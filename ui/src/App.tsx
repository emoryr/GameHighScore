
import Scores from './pages/scores'
import { Container, Row, Col } from 'react-bootstrap'
import Categories from './components/category';
import SearchPlayer from './components/forms/searchPlayer';
import ComparePlayers from './components/forms/comparePlayers';

function App() {
  return (
    <div>
      <Container>
        <Row>
          <Col xs={3}>
           <Categories />
          </Col>
          <Col xs={6}>
            <Scores/>
          </Col>
          <Col xs={3}>
            <Container>
              <Row>
                <Col>
                  <SearchPlayer />
                </Col>
              </Row>
              <Row>
                <Col>
                  <ComparePlayers />
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
