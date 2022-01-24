import { Table } from 'react-bootstrap';

type iHeader = {
    label: string
}

type iBody = {
    key: string
};

type iTableList = {
    children: JSX.Element[]
}

const TableList = ({ children }: iTableList): JSX.Element => {
    return (
        <Table striped bordered hover>
            {children}
        </Table>
    );
}


type iTableHeader = {
    headerProperties: iHeader[];
}
const tableHeader = ({ headerProperties }: iTableHeader) => {
    return (
        <thead data-testid="tableHeader">
            <tr>
                {headerProperties?.map((item, index: number) => {
                    return (<th key={index}>{item.label}</th>)
                })}
            </tr>
        </thead>

    )
}

type iTableBody = {
    bodyProperties: iBody[];
    data: any[];
    onClick:(item: any) => void
}
const tableBody = ({ data, bodyProperties, onClick }: iTableBody) => {
    return (
        <tbody data-testid="scoreList">
            {data?.map((item: any, index: number) => {
                return (
                    <tr onClick={() => onClick(item)} key={index}>
                        {bodyProperties.map((i, id: number) => <td key={id}>{item[i.key]}</td>)}
                    </tr>
                )
            })}
        </tbody>
    )
}
TableList.Body = tableBody;
TableList.Header = tableHeader;

export default TableList;