
import Scores from './pages/scores'
import { Container, Row, Col } from 'react-bootstrap'
import Categories from './components/category';
import SearchPlayer from './components/forms/searchPlayer';
import ComparePlayers from './components/forms/comparePlayers';
import { useState } from 'react';
import { iCategory } from './interfaceModel/category';
import { iScore } from './interfaceModel/score';

function App() {

  const [category, setCategories] = useState("Overall");
  const [player, setPlayer] = useState("");
  const [playerExtra, setPlayerExtra] = useState("");
  const [isCompare, setIsCompare] = useState(false);

  const loadCategories = (item: iCategory) => {
    setCategories(item.name);
  }

  const searchPlayer = (name: string) => {
    setCategories("");
    setPlayer(name);
    setIsCompare(false)
  }

  const loadPlayer = (item: iScore) => {
    setCategories("");
    setPlayer(item.name);
    setIsCompare(false);
  }

  const compareTwoPlayer= (player: string, playerExtra: string) => {
    setCategories("");
    setPlayer(player);
    setPlayerExtra(playerExtra);
    setIsCompare(true)
  }

  return (
    <div>
      <Container fluid>
        <Row>
          <Col xs={3}>
           <Categories onClick={loadCategories}/>
          </Col>
          <Col xs={6}>
            <Scores onClick={loadPlayer} player={player} isCompare={isCompare}
            playerExtra={playerExtra} typeCategory={category}/>
          </Col>
          <Col xs={3}>
            <Container>
              <Row>
                <Col>
                  <SearchPlayer onClick={searchPlayer}/>
                </Col>
              </Row>
              <Row>
                <Col>
                  <ComparePlayers onClick={compareTwoPlayer}/>
                </Col>
              </Row>
            </Container>
          </Col>
        </Row>
      </Container>
    </div>
  );
}

export default App;
