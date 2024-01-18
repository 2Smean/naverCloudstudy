import { Alert } from '@mui/material';
import React from 'react';

const HomeSub1 = () => {
    return (
        <div>
            <Alert variant='filled' severity='warning'>
                오늘의 일기 <br />
                오늘은 어쩌고 저쩌고 저래서 이랬고 점심은 무엇을<br />
                공부는 무엇을 어찌고 저찌고...
            </Alert>
        </div>
    );
};

export default HomeSub1;