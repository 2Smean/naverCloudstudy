import React from 'react';
import img1 from '../Image/01.png';
import img2 from '../Image/02.png';
import img3 from '../Image/03.png';
import img4 from '../Image/04.png';
import img5 from '../Image/05.png';
import { Button } from '@mui/material';
import Swal from 'sweetalert2';

const SweetApp = () => {
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
        </div>
    );
};

export default SweetApp;