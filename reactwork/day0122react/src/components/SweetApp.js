import React, { useState } from 'react';
import img1 from '../Image/01.png';
import img2 from '../Image/02.png';
import img3 from '../Image/03.png';
import img4 from '../Image/04.png';
import img5 from '../Image/05.png';
import { Button } from '@mui/material';
import Swal from 'sweetalert2';

const SweetApp = () => {
    const [sangpum, setSangpum] = useState('체크자켓');

    return (
        <div>
            <h3 className='alert alert-danger'>SweetAlert 사용법</h3>
            <hr />
            <Button variant='outlined' color='warning'
                onClick={() => {
                    Swal.fire('안녕하세요');
                }}>기본 Alert</Button>
            <br />
            <Button variant='outlined' color='error'
                onClick={() => {
                    Swal.fire({
                        title: 'Swal Test',
                        html: "오늘은 즐거운 <br/> 월요일 <br/> 아침부터 눈이 왔어요 ! <br/> 기분 조아 !",
                        icon: "warning",
                        confirmButtonText: "확인",
                        confirmButtonColor: '#3085d6',
                        cancelButtonText: "취소",
                        cancelButtonColor: 'pink',
                        showCancelButton: true
                    }).then(result => {
                        if (result.isConfirmed) {
                            Swal.fire("확인을 누르셨네요");
                        } else {
                            Swal.fire("취소를 누르셨군요");
                        }
                    })
                }}>확인,취소 Alert</Button>
            <br />
            <button type='button' className='btn btn-success'
                onClick={() => {
                    Swal.fire({
                        title: "사진넣기",
                        html: `<h5>사진을 넣어보자!</h5>`,
                        imageUrl: img3,
                        imageWidth: 70,
                        showCancelButton: true,
                        confirmButtonText: "삭제",
                        cancelButtonText: "삭제취소"
                    }).then(result => {
                        if (result.isConfirmed) {
                            Swal.fire("삭제하셨네요");
                        } else {
                            Swal.fire("취소하셨군요");
                        }
                    })
                }}>사진넣기</button>
            <br />
            <button type='button' className='btn btn-info btn-sm'
                onClick={() => {
                    Swal.fire({
                        title: "Input Your Email",
                        input: "email",
                        inputLabel: "Your Email Address",
                        inputPlaceholder: 'Enter Your email Address'
                    }).then(result => {
                        Swal.fire(`당신의 이메일 주소는 [${result.value}]`);
                    })
                }}>이메일</button>
            <br />
            <button type='button' className='btn btn-success'
                onClick={() => {
                    Swal.fire({
                        icon: "info",//warning, error, info 등 여러가지 있음
                        title: "상품삭제",
                        text: `${sangpum} 상품을 삭제하시겠습니까?`,
                        showCancelButton: true,
                        confirmButtonText: "삭제",
                        cancelButtonText: "취소"
                    }).then(result => {
                        if (result.isConfirmed) {
                            Swal.fire("삭제하셨네요");
                        } else {
                            Swal.fire("취소하셨군요");
                        }
                    }
                    )
                }}>
                상품삭제
            </button>
            <br />
            <button type='button' className='btn btn-warning'
                onClick={() => {
                    let arr = [
                        { photo: img1, msg: "톰" },
                        { photo: img2, msg: "제리" },
                        { photo: img3, msg: "둘리" },
                        { photo: img4, msg: "또치" },
                        { photo: img5, msg: "마이콜" },
                    ];
                    let s = "";
                    for (let m of arr) {
                        s +=
                            `<img alt='' src=${m.photo} width=40/><b>${m.msg}</b><br/>`;
                    }

                    Swal.fire({
                        icon: "warning",
                        title: "좋아요 누른 사람 목록",
                        html: s
                    })
                }}>배열 출력</button>
        </div >
    );
};

export default SweetApp;