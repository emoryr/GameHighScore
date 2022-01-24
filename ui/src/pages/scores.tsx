import { useState, useEffect } from 'react';
import ScoreList from '../components/scoreList/list';
import CategoryList from '../components/categoryList/list';
import RequestApi from '../helper/apiHelper';
import { iScore } from '../interfaceModel/score';
import { iCategory } from '../interfaceModel/category';
import { Button, Col, Container, Form, Row } from 'react-bootstrap';

const Scores = () => {
    const [scores, setScores] = useState<iScore[] | []>([]);
    const [categories, setCategories] = useState<iCategory[] | []>([]);
    const [loading, setLoading] = useState(true);

    let typeCategory = 'Overall';

    const loadScores = async () => {
        const scoreList = await RequestApi.getScores('score/category/' + typeCategory);
        setScores(scoreList);
        setLoading(!scoreList.length)
    }

    const loadCategories = async () => {
        const categoriesList = await RequestApi.getCategories('category/all');
        setCategories(categoriesList);
        setLoading(!categoriesList.length)
    }

    useEffect(() => {
        loadScores();
        loadCategories();
    }, []);

    return (
        <div>
        <h3>{typeCategory} Highscore</h3>
        <ScoreList scores={scores} loading={loading}/>
        </div>
    );
}

export default Scores;