import React, { useState } from 'react';
import c7 from '../images/C5.png';
import s1 from '../images/1.jpg';
import s2 from '../images/2.jpg';
import s3 from '../images/3.jpg';
import s4 from '../images/4.jpg';
import s5 from '../images/5.jpg';


function FiveApp(props) {
    const [show,setShow]=useState(true); //true 면 보이고 false 면 안보이는
    const [photo,setPhoto]=useState(s1);
    const [border,setBorder]=useState('inset');

    return (
        <div className='box'>
            <h3 className='alert alert-info'>FiveApp
                    <img alt='' src={c7}
                    style={{width:'60px',float:'right'}}/>
            </h3>
            <div>
                <label>
                    <input type='checkbox' defaultChecked
                    onClick={(e)=>{
                        setShow(e.target.checked)
                    }}/>
                    이미지 보이기/숨기기
                </label>
                <br/><br/>
                <select className='form-select' style={{width:'200px'}}
                onChange={(e)=>{
                    setPhoto(e.target.value);
                }}>
                    <option value={s1}>영식의 저녁밥</option>
                    <option value={s2}>영호의 간식</option>
                    <option value={s3}>옥순의 주식</option>
                    <option value={s4}>영철</option>
                    <option value={s5}>순자</option>
                </select>
                <br/>
                <select className='form-select' style={{width:'200px'}}
                onChange={(e)=>{
                    setBorder(e.target.value)
                }}>
                    <option>inset</option>
                    <option>dotted</option>
                    <option>solid</option>
                    <option>dashed</option>
                    <option>double</option>
                    <option>groove</option>
                </select>
                <br/>
                {
                    //show 값이 true면 이미지가 보이고, false 면 안보인다
                    show && 
                    <img alt="" src={photo} style={{border:`10px ${border} gray`, width:'400px'}}/>
                }
            </div>
        </div>
    );
}

export default FiveApp;