import React, { useEffect, useState } from 'react';
import c1 from '../images/C1.png';
import c2 from '../images/C2.png';

function TwoApp(props) {
    const [show, setShow] = useState(true);
    const [count, setCount] = useState(1);

    const clickButtonEvent = () => {
        setCount(count + 1);
        //비동기 처리라 아래 코드가 먼저 호출될수도 있다
        // setShow(count % 3 === 0 ? true : false);
        // setShow(count % 3 == 0); // boolean 값이기 때문에 아래처럼 해도된다
    }

    useEffect(() => {
        setShow(count % 3 === 0 ? true : false);
    }, [count]);//count 변경시 자동호출

    return (
        <div>
            <h3 className='alert alert-danger'>TwoApp-3의 배수마다 이미지 보이기/안보이기</h3>
            <button type='button' className='btn btn-danger'
                onClick={clickButtonEvent}>숫자증가</button>
            <b style={{ fontSize: '4em', color: 'red', marginLeft: '50px' }}>{count}</b>
            <br /><br />
            {
                // show 가 true 일 때 보이는 이미지 
                show &&
                <img alt="" src={c1} />
            }

            {
                // show 가 false 일때 보이는 이미지 
                !show &&
                <img alt="" src={c2} />
            }

            {/* src 의 이미지를 import 없이 출력하는 방법 */}
            <img alt='' src={require('../images/C7.png')} />
        </div>
    );
}

export default TwoApp;