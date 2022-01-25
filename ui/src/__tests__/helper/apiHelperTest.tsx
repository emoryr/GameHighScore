import { categoryList, scoreList } from './../../mock/categoryList';
import ApiRequest from '../../helper/apiHelper';
import axios from "axios";
jest.mock('axios');
describe('When do a category request', () => {
    describe('and there is no error', () => {
        test('Show category list response', async () => {
            (axios.get as jest.Mock).mockImplementationOnce(() => Promise.resolve({ data: categoryList }))
            await expect(ApiRequest.getCategories('/category/all')).resolves.toHaveLength(2)
        });
    });

})

describe('When do a score request', () => {
    describe('and there is no error', () => {
        test('Show category list response', async () => {
            (axios.get as jest.Mock).mockImplementationOnce(() => Promise.resolve({ data: scoreList }))
            await expect(ApiRequest.getCategories('/score/category/Attack')).resolves.toHaveLength(3)
        });
    });

})