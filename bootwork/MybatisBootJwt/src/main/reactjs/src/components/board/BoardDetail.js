import React from 'react';
import { useParams } from 'react-router-dom';

const BoardDetail = () => {
    const { h } = useParams();

    return (
        <div>
            {h}번째 글입니다.
        </div>
    );
};

export default BoardDetail;