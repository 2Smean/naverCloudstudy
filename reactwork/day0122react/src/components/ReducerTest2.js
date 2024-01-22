import React, { useReducer, useState } from 'react';
import Student from './Student';
/*
    useReducer : state 관리가 용이하며 유지, 보수가 편하다 
    호출 : dispatch ( type , action ) --> reducer ( state , action )
    기능 
    reducer: state 를 업데이트하는 역할 ( 은행 )
    dispatch - state 업데이트를 요구 
    action - 요구의 내용 
*/

// reducer 설정시 초기값으로 미리 지정 
const initialState = {
    count: 2,
    students: [
        {
            id: new Date(),
            name: '이승민',
            isHere: false
        },
        {
            id: new Date(),
            name: '저승민',
            isHere: true
        }
    ]
}

const reducer = (state, action) => {
    switch (action.type) {
        case 'add-student':
            //payload 를 통해서 name 을 전달 받을 것이다.
            const name = action.payload.name;
            //추가할 학생정보 구성
            //delete 는 name 과 id 모두 받는다 이유는 동명이인 떄문에
            //배열이므로 반복문돌려서 id 같은것 찾아서 지우거나 같지않은 것 (filter,slice) filter 쉬움 해서 지우면 된다
            const addStudent = {
                id: new Date(),
                // name : name, //key value 값이 같으므로 생략가능
                name,
                isHere: false
            }

            const data = {
                count: state.count + 1,
                students: [
                    ...state.students,
                    addStudent
                ]
            }
            return data;
        case 'delete-student':
            return {
                count: state.count - 1,
                students: state.students.filter((s) => (s.id !== action.payload.id)) //()괄호넣는게 좋음
            };
        case 'mark-student':
            return {
                count: state.count, //mark 는 true false 값이므로 1을 뺄 필요가없다 
                students: state.students.map((s) => {
                    if (s.id === action.payload.id) {
                        return {
                            ...s,
                            isHere: !s.isHere
                        }
                    }
                    return s;
                })
            }
        default:
            return state;
    }
}

const ReducerTest2 = () => {
    const [name, setName] = useState('');
    const [studentInfo, dispatch] = useReducer(reducer, initialState);

    return (
        <div>
            <h5 className='alert alert-danger'>Reducer 예제 #2 ( 복잡 ) </h5>
            <h6>Reducer 학생 관리 시스템</h6>
            <h6>총 학생수 : {studentInfo.count}</h6>
            <div className='input-group' style={{ width: '200px' }}>
                <input type='text' className='form-control'
                    value={name} onChange={(e) => setName(e.target.value)} />
                &nbsp;&nbsp;
                <button type='button'
                    className='btn btn-outline-danger btn-sm'
                    onClick={() => dispatch({ 'type': 'add-student', payload: { name } })}>추가</button>
                <hr /><hr />
                {
                    studentInfo.students.map((stu, idx) =>
                        <Student key={idx} stu={stu} dispatch={dispatch} />)
                }
            </div>
        </div>
    );
};

export default ReducerTest2;