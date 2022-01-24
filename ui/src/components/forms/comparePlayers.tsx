import { useState } from 'react';
import { Button, Form } from 'react-bootstrap';

const ComparePlayers = ({onClick}: any) => {

    const [nameValue, setNameValue] = useState("")
    const [nameValueExtra, setNameValueExtra] = useState("")

    const handleOnSubmit = (evt: any) => {
        evt.preventDefault()
        onClick(nameValue, nameValueExtra)
    }

    return (
        <div>
            <Form>
                <Form.Label>Compare Users</Form.Label>
                <Form.Group className="mb-3" controlId="searchPlayerA">
                    <Form.Control onChange={(evt) => setNameValue(evt.target.value)}
                     value={nameValue} type="text" placeholder="Player 1 name" />
                </Form.Group>
                <Form.Group className="mb-3" controlId="searchPlayerB">
                    
                    <Form.Control onChange={(evt) => setNameValueExtra(evt.target.value)}
                     value={nameValueExtra} type="text" placeholder="Player 2 name" />
                </Form.Group>
                <Button onClick={handleOnSubmit} variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </div>
    );
}

export default ComparePlayers;