import { useState } from 'react';
import { Button, Form } from 'react-bootstrap';

const SearchPlayer = ({onClick}: any) => {

    const [nameValue, setNameValue] = useState("")

    const handleOnSubmit = (evt: any) => {
        evt.preventDefault()
        onClick(nameValue)
    }

    return (
        <div>
            <Form>
                <Form.Group className="mb-3" controlId="searchPlayer">
                    <Form.Label>Player name</Form.Label>
                    <Form.Control onChange={(evt) => setNameValue(evt.target.value)}
                     value={nameValue} type="text" placeholder="Player name" />
                </Form.Group>
                <Button onClick={handleOnSubmit} variant="primary" type="submit">
                    Submit
                </Button>
            </Form>
        </div>
    );
}

export default SearchPlayer;