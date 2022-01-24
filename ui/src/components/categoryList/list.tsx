import { iCategory } from "../../interfaceModel/category";
import TableList from '../table'

type iList = {
    loading: boolean;
    categories: iCategory[]
}

export default function CategoryList({ loading, categories }: iList) {
    return (
        <div>
            {loading ? (
                <div>Loading...</div>
            ) : (
                
                <TableList>
                    <TableList.Header headerProperties={[
                        { label: 'Category' }]} />
                    <TableList.Body data={categories} bodyProperties={[
                        { key: 'name' }]} />
                </TableList>
            )}
        </div>
    );
}