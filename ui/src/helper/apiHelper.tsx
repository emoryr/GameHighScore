import axios from "axios";
import { iScore } from "../interfaceModel/score";
import { iCategory } from "../interfaceModel/category";


let baseURL = "http://localhost:8080/";
if (process.env.HOST_PATH) {
    baseURL = process.env.HOST_PATH;
}

async function getScores(endpoint: string): Promise<iScore[]> {
    try {
        const response = await axios.get(`${ baseURL }${ endpoint }`)
        return response?.data.data;
    } catch (err) {
        throw err;
    }

}

async function getCategories(endpoint: string): Promise<iCategory[]> {
    try {
        const response = await axios.get(`${ baseURL }${ endpoint }`)
        return response?.data.data;
    } catch (err) {
        throw err;
    }

}

export default { getScores, getCategories };