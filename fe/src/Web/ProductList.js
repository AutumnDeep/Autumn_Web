import React, {useEffect, useState} from 'react';
import axios from 'axios';

const ProductList = () => {
    const [data, setData] = useState('');

    useEffect(() => {
        ProductListView();
    },[])
 
    async function ProductListView() {
        await axios.get('/product/list')
        .then((res)=>{
            console.log(res.data); 
            setData(res.data);
        })
        .catch((err)=>{
        console.log(err);
        })
    }   

    return (
        <div>
          {data ? data.map((datas)=> (
            <div key={datas.id}>
            <div className="name">{datas.name}</div>
            </div>
          )) : ''}
        </div>
    );
}

export default ProductList;