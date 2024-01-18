import { Alert } from '@mui/material';
import React from 'react';
import { useParams } from 'react-router-dom';
import simg from '../image/01.png';
import gimg from '../image/10.png';

const About = () => {
    const { emp } = useParams();
    console.log({ emp }); //{ "emp" : "Samsung" }
    console.log({ emp }.emp); // Samsung

    return (
        <div>
            <Alert variant='filled' severity='success'>
                About 컴포넌트
            </Alert>
            {
                // emp 값이 넘어오지 않은 경우 실행할 영역
                emp == null ?
                    <div>
                        <h1>저는 취업준비생입니다</h1>
                        <img alt='' src={require(`../image/05.png`)} />
                    </div>
                    :
                    //emp 값이 있는 경우 실행할 영역
                    <div>

                        <h1>저는 {emp} 에 다니고 있습니다</h1>
                        <img alt='' src={(emp === 'Samsung' ? simg : gimg)} />
                    </div>
            }
        </div>
    );
};

export default About;