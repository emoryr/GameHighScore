import { Button, Form } from 'react-bootstrap';

const ComparePlayers = () => {
    return (
        <div>
            <Form>
                <Form.Label>Compare Users</Form.Label>
                <Form.Group className="mb-3" controlId="searchPlayerA">
                    <Form.Control type="text" placeholder="Player 1 name" />
                </Form.Group>
                <Form.Group className="mb-3" controlId="searchPlayerB">
                    
                    <Form.Control type="text" placeholder="Player 2 name" />
                </Form.Group>
                <Button variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </div>
    );
}

export default ComparePlayers;