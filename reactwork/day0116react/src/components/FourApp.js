import React, { useState } from 'react';
import FourChildApp from './FourChildApp';
// **부모, 자식간의 통신**
// **1.부모컴포넌트에서 자식 컴포넌트로 props 를 통해서 값이나 이벤트 전달을 할수 있다**
// **2.자식컴포넌트에서는 부모컴포넌트의 값을 props로 받아서 출력은 가능하지만 직접적으로 변경은 불가능하다**
// **3. 만약 변경하려면 부모의 이벤트를 props를 통해서 호출을 해서 그 이벤트함수에서 변경을 하면 된다**
// *** props 는부모컴포넌트가설정하며 , 컴포넌트자신은해당 props 를읽기전용으로만사용할수있다**
//**컴포넌트내부에서읽고또업데이트하려면 state 를써야한다**
function FourApp(props) {
    const [count, setCount] = useState(0);

    //count 를 증가하는 함수 
    const changeCount = () => {
        setCount(count + 1);
    }
    return (
        <div>
            <h3 className='alert alert-info'>FourApp-부모,자식간 통신</h3>
            <h4><b>방문횟수 : {count}회</b></h4>
            <FourChildApp name={"이승민"} age={"25세"} addr={"경기도"} incre={changeCount} />
            <FourChildApp name={"장원태"} age={"29세"} addr={"서울"} incre={changeCount} />
            <FourChildApp name={"이준일"} age={"30세"} addr={"용산"} incre={changeCount} />
        </div>
    );
}

export default FourApp;