import axios from "axios";
import { iScore } from "../interfaceModel/score";
import { iCategory } from "../interfaceModel/category";

const baseURL = "http://localhost:8080/";

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