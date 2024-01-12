import React, { useState } from 'react';
import c5 from '../images/C5.png'

function FourApp(props) {
    const [fname,setFname]=useState('Single Day');
    const [fsize,setFsize]=useState('20px');
    const [fcolor,setFcolor]=useState('blue');


    //이벤트들
    //글자색 변경하는 이벤트
    const changeFontColor=(e)=>{
        setFcolor(e.target.value);
    }

    //글꼴 변경하는 이벤트 
    const changeFontName=(e)=>{
        setFname(e.target.value);
    }

    //글 크기 변경하는 이벤트
    const changeFontSize=(e)=>{
        setFsize(e.target.value);
    }
    return (
        <div className='box'>
            <h3 className='alert alert-info'>FourApp
                <img alt="" src={c5}
                style={{width:'60px',float:'right'}}/>
            </h3>
            <div style={{fontFamily:fname,fontSize:fsize,color:fcolor}}>
                나는 지금 해피하다 우와!!!!!!!
            </div>
            <div style={{marginTop:'10px'}}>

                <label>
                    <input type='radio' name='fcolor' defaultValue={'red'}
                    onClick={changeFontColor}/>빨강
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fcolor' defaultValue={'blue'}
                    defaultChecked
                    onClick={changeFontColor}/>파랑
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fcolor' defaultValue={'green'}
                    onClick={changeFontColor}/>초록
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fcolor' defaultValue={'magenta'}
                    onClick={changeFontColor}/>분홍 
                </label>
            </div>



            <div style={{marginTop:'10px'}} onClick={changeFontName}>
                <label>
                    <input type='radio' name='fname' defaultValue={'Gamja Flower'}/>GamjaFlower
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fname' defaultValue={'Single Day'}
                    defaultChecked/>SingleDay
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fname' defaultValue={'Jua'}/>Jua
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fname' defaultValue={'Nanum Pen Script'}/>Nanum Pen Script 
                </label>
            </div>


            <div style={{marginTop:'10px'}} onClick={changeFontSize}>
                <label>
                    <input type='radio' name='fsize' defaultValue={'13px'}/>아주작게
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fsize' defaultValue={'20px'}
                    defaultChecked/>작게
                </label>

                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fsize' defaultValue={'30px'}/>크게
                </label>
                
                <label style={{marginLeft:'10px'}}>
                    <input type='radio' name='fsize' defaultValue={'40px'}/>아주크게 
                </label>
            </div>
        </div>
    );
}

export default FourApp;