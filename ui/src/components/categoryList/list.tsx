import { iCategory } from "../../interfaceModel/category";
import TableList from '../table'

type iList = {
    loading: boolean;
    categories: iCategory[];
    onClick: (item: any) => void
}

export default function CategoryList({ loading, categories, onClick }: iList) {
    return (
        <div>
            {loading ? (
                <div>Loading...</div>
            ) : (
                
                <TableList>
                    <TableList.Header headerProperties={[
                        { label: 'Category' }]} />
                    <TableList.Body onClick={onClick}  data={categories} bodyProperties={[
                        { key: 'name' }]} />
                </TableList>
            )}
        </div>
    );
}