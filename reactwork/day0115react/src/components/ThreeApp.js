import React from 'react';

function ThreeApp(props) {
    const names = ['리액트', '스프링부트', '자바', '파이썬', '뷰'];

    //방법1 
    const nameList = names.map((irum, i) => (<li key={i}>{irum}</li>));
    return (
        <div>
            <h3 className='alert alert-danger'>ThreeApp-map 반복문</h3>
            {nameList}
            <hr />
            {/* 직접 return 문 안에서 반복해서 출력하는 경우 */}
            {
                names.map((irum, i) => (<h6 key={i}>{i}:{irum}</h6>))
            }
            <hr />
            {/* 배열이 아닌 특정 숫자 범위로 출력하고자 할 경우 */}
            {
                // [...new Array(10)].map((a, i) => (<h5 key={i}>{i}:{a}</h5>))

                //c1.png~c8.png 이미지를 map 을 이용해서 출력해보자
                [...new Array(8)].map((a, i) =>
                    (<img alt='' key={i} src={require(`../images/C${i + 1}.png`)} width={100} />))
            }
        </div>

    );
}

export default ThreeApp;