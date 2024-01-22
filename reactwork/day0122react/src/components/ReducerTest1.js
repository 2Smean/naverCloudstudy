import React, { useReducer, useState } from 'react';
/*
    useReducer : state 관리가 용이하며 유지, 보수가 편하다 
    호출 : dispatch ( type , action ) --> reducer ( state , action )
    기능 
    reducer: state 를 업데이트하는 역할 ( 은행 )
    dispatch - state 업데이트를 요구 
    action - 요구의 내용 
*/
//Reducer 를 이용해서 입출금관리를 하는 간단한 예제입니다

//action.type 을 미리 상수화해서 정해놓고자 할 경우 ( 상수 등록 )
const ACTION_TYPES = {
    add: 'addmoney',
    sub: 'submoney'
}

const reducer = (state, action) => {
    console.log("reducer 가 일을 합니다", state, action);

    switch (action.type) {

        //case 'addmoney' :
        case ACTION_TYPES.add:
            return state + Number(action.payload);

        case ACTION_TYPES.sub:
            return state - Number(action.payload);

        default:
            return state;
    }
}

const ReducerTest1 = () => {
    const [number, setNumber] = useState(0); // 잔액이 아닌 입출금 입력값 payload 로 전달될 값 

    const [money, dispatch] = useReducer(reducer, 0);// (reducer, money의 초기값) 이벤트를 처리할 기관 (reducer) , money의 초기값


    return (
        <div>
            <h5 className='alert alert-info'>Reducer 예제 #1 ( 간단 ) </h5>
            <h2>useReducer 은행에 오신것을 환영합니다</h2>
            <h3><b>잔 고 : {money}</b></h3>

            <input type='text' placeholder='입출금을 입력하세요'
                onChange={(e) => setNumber(e.target.value)} /> &nbsp;{number}
            <br />
            <button type='button' className='btn btn-info btn-sm'
                onClick={() => dispatch({ 'type': ACTION_TYPES.add, payload: number })}>
                입금
            </button>
            &nbsp;&nbsp;
            <button type='button' className='btn btn-danger btn-sm'
                onClick={() => dispatch({ 'type': ACTION_TYPES.sub, payload: number })}>
                출금
            </button>
        </div>
    );
};

export default ReducerTest1;