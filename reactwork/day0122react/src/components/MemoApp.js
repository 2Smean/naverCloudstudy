import React, { useState } from 'react';
import ShowState from './ShowState';

const MemoApp = () => {
    const [number, setNumber] = useState(0);
    const [text, setText] = useState('');

    //증가 이벤트 생성
    const increNumber = () => {
        setNumber(number + 1);
    }
    //감소 이벤트 생성
    const decreNumber = () => {
        setNumber(number - 1);
    }
    //텍스트 변경 이벤트
    const onChangeTextHandler = (e) => {
        setText(e.target.value);
    }
    return (
        <div>
            <button className='btn btn-danger btn-sm'
                onClick={increNumber}>증가</button>
            <br />
            <button className='btn btn-danger btn-sm'
                onClick={decreNumber}>감소</button>
            <br />
            <input type='text' placeholder='input name'
                onChange={onChangeTextHandler} />

            <hr />
            {/* 출력을 ShowState 에서 한다 */}
            <ShowState number={number} text={text} />
        </div>
    );
};

export default MemoApp;