import { Button, Form } from 'react-bootstrap';

const SearchPlayer = () => {
    return (
        <div>
            <Form>
                <Form.Group className="mb-3" controlId="searchPlayer">
                    <Form.Label>Player name</Form.Label>
                    <Form.Control type="text" placeholder="Player name" />
                </Form.Group>
                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </div>
    );
}

export default SearchPlayer;