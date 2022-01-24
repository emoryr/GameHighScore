import { iScore } from "../../interfaceModel/score";
import TableList from '../table'

type iHeader = {
    label: string
}

type iBody = {
    key: string
};


type iList = {
    loading: boolean;
    scores: iScore[];
    onClick: (item: any) => void
    headerInit: iHeader
    bodyInit: iBody;
}

export default function ScoreList({ loading, scores, onClick, headerInit, bodyInit }: iList) {

    return (
        <div>
            {loading ? (
                <div>Loading...</div>
            ) : (
                
                <TableList>
                    <TableList.Header headerProperties={
                        [
                            headerInit,
                            {label: 'Level' },
                            {label: 'Xp'}
                        ]
                    } />
                    <TableList.Body onClick={onClick} data={scores} bodyProperties={
                        [
                            bodyInit,
                            {key: 'level'},
                            {key: 'xp'}
                        ]
                    } />
                </TableList>
            )}
        </div>
    );
}