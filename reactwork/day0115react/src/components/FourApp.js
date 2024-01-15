import React from 'react';
import img1 from '../images/K-036.png';
import img2 from '../images/K-039.png';
import img3 from '../images/K-041.png';
import img4 from '../images/K-049.png';
import './MyStyle.css';

function FourApp(props) {
    //4개의 import 된 이미지를 배열에 저장 
    const myImage = [img1, img2, img3, img4];
    const data = [
        { "name": "강호동", "addr": "서울", "hp": "010-1234-1234", "photo": "C1" },
        { "name": "이승민", "addr": "경기", "hp": "010-3453-5235", "photo": "C3" },
        { "name": "장원태", "addr": "제주도", "hp": "010-2352-2343", "photo": "C5" },
        { "name": "이준일", "addr": "인천", "hp": "010-3455-6345", "photo": "C7" }
    ]

    return (
        <div>
            <h3 className='alert alert-danger'>FourApp-map 으로 이미지 배열 출력</h3>
            {
                myImage.map((img, idx) => (<img alt='' src={img} width='200' />))
            }
            <hr />
            {
                data.map((ele, i) => (
                    <div className='box' key={i}>
                        <h5>이름: {ele.name}</h5>
                        <h5>주소: {ele.addr}</h5>
                        <h5>핸드폰: {ele.hp}</h5>
                        <img alt='프로필사진'
                            src={require(`../images/${ele.photo}.png`)} width='150' />
                    </div>
                ))
            }
            <hr />

            <table className='table table-borderd' style={{ width: '500px' }}>

                <thead>
                    <tr>
                        <th width='50'>번호</th>
                        <th width='100'>사진</th>
                        <th width='100'>이름</th>
                        <th width='150'>핸드폰</th>
                        <th>주소</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        data.map((ele, idx) => (
                            <tr key={idx}>
                                <td>{idx + 1}</td>
                                <td>
                                    <img alt=''
                                        src={require(`../images/${ele.photo}.png`)}
                                        width='80' />
                                </td>
                                <td>{ele.name}</td>
                                <td>{ele.hp}</td>
                                <td>{ele.addr}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>


        </div >
    );
}

export default FourApp;