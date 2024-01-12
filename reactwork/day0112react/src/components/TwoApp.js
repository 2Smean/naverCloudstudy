import React, { useState } from 'react';
import './MyStyle.css';
import c4 from '../images/C4.png'

function TwoApp(props) {
    const [number,setNumber]=useState(0);

    return (
        <div className='box'>
            <h3 className='alert alert-info'>TwoApp
                <img alt="" src={c4}
                style={{width:'60px',float:'right'}}/>
            </h3>
            <div style={{fontSize:'40px',color:'red',marginLeft:'200px'}}>
                {number}
            </div>
            <div style={{marginLeft:'130px'}}>
                <button type='button' className='btn btn-outline-success'
                onClick={()=>{
                    if(number===0){
                        alert("0 이하로 감소할 수 없습니다");
                        return; //함수 종료
                    }
                    setNumber(number-1);
                }}>숫자 감소</button>

                <button type='button' className='btn btn-outline-success'
                 style={{marginLeft:'10px'}}
                 onClick={()=>{
                    if(number===10){//== 값만 비교, === 값과 타입까지 비교 
                        alert("10 이상 증가할 수 없습니다");
                        return; //함수 종료
                    }
                    setNumber(number+1);
                }}>숫자 증가</button>
            </div>
        </div>
    );
}

export default TwoApp;