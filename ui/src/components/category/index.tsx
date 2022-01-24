import { useState, useEffect } from 'react';
import CategoryList from '../categoryList/list';
import RequestApi from '../../helper/apiHelper';
import { iCategory } from '../../interfaceModel/category';

const Categories = ({onClick}: any) => {
    const [categories, setCategories] = useState<iCategory[] | []>([]);
    const [loading, setLoading] = useState(true);

    const loadCategories = async () => {
        const categoriesList = await RequestApi.getCategories('category/all');
        setCategories(categoriesList);
        setLoading(!categoriesList.length)
    }

    useEffect(() => {
        loadCategories();
    }, []);

    return (
        <CategoryList onClick={onClick} categories={categories} loading={loading}/>
    );
}

export default Categories;