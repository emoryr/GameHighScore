import { iScore } from "../../interfaceModel/score";
import TableList from '../table'

type iList = {
    loading: boolean;
    scores: iScore[]
}

export default function ScoreList({ loading, scores }: iList) {
    return (
        <div>
            {loading ? (
                <div>Loading...</div>
            ) : (
                
                <TableList>
                    <TableList.Header headerProperties={[
                        { label: 'Name' }, 
                        { label: 'Level'},
                        { label: 'Xp'}]} />
                    <TableList.Body data={scores} bodyProperties={[
                        { key: 'name' }, 
                        { key: 'level'},
                        { key: 'xp'}]} />
                </TableList>
            )}
        </div>
    );
}