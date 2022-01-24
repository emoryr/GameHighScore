import { useState, useEffect } from 'react';
import { Col, Row } from 'react-bootstrap';
import ScoreList from '../components/scoreList/list';
import RequestApi from '../helper/apiHelper';
import { iScore } from '../interfaceModel/score';

type iList = {
    typeCategory: string;
    onClick: (item: any) => void
    player: string;
    isCompare?: boolean;
    playerExtra?: string
}


const Scores = ( {typeCategory, onClick, player, isCompare, playerExtra} : iList) => {
    const [scores, setScores] = useState<iScore[] | []>([]);
    const [scoresExtra, setScoresExtra] = useState<iScore[] | []>([]);
    const [loading, setLoading] = useState(true);
    const [headerInit, setHeader] = useState({label: 'Name'})
    const [bodyInit, setBody] = useState({key: 'name'})
    const [title, setTitle] = useState("");

    const loadScoresByCategory = async () => {
        const scoreList = await RequestApi.getScores('score/category/' + typeCategory);
        setScores(scoreList);
        setLoading(!scoreList.length)
    }

    const loadScoresByPlayer = async () => {
        const scoreList = await RequestApi.getScores('score/player/' + player);
        setScores(scoreList);
        setLoading(!scoreList.length)
    }

    const loadTwoPLayer = async () => {
        const scoreList = await RequestApi.getScores('score/player/' + player);
        const scoreListExtra = await RequestApi.getScores('score/player/' + playerExtra);
        setScores(scoreList);
        setScoresExtra(scoreListExtra);
        setLoading(!scoreList.length)
    }

    useEffect(() => {
        if (!isCompare) {
            if(typeCategory != "") {
                loadScoresByCategory();
                setHeader({label: 'Name'})
                setBody({key: 'name'})
                setTitle(typeCategory)
            } else {
                loadScoresByPlayer();
                setHeader({label: 'Skill'})
                setBody({key: 'category'})
                setTitle(player)
            }
        } else {
            setHeader({label: 'Skill'})
            setBody({key: 'category'})
            loadTwoPLayer();
            setTitle(player + " vs " + playerExtra)
        }
    }, [typeCategory, player]);

    return (
        <div>
        <h3>{title} Highscore</h3>
        {isCompare? 
            <Row>
                <Col md={6}> 
                <ScoreList headerInit={headerInit} bodyInit={bodyInit} 
                    onClick={onClick} scores={scores} loading={loading}/>
                </Col>
                <Col md={6}>
                <ScoreList headerInit={headerInit} bodyInit={bodyInit} 
                    onClick={onClick} scores={scoresExtra} loading={loading}/>
                </Col>
            </Row>
            :
            <ScoreList headerInit={headerInit} bodyInit={bodyInit} 
            onClick={onClick} scores={scores} loading={loading}/>
        }
        </div>
    );
}

export default Scores;