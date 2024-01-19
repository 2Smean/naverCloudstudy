import React, { useEffect } from 'react';
import { useNavigate } from 'react-router-dom';

const PersonRowItem = ({ idx, row, onDelete }) => {
    console.log("row는 다음과 같아요");
    console.log(row); //row 

    const navi = useNavigate();

    return (
        <tr>
            <td align='center'>{idx + 1}</td>
            <td>
                <div style={{ cursor: 'pointer' }}
                    onClick={() => navi(`/detail/${row.pnum}`)}>
                    <img alt=''
                        src={require(`../images/${row.photo}`)}
                        style={{ width: '30px', height: '30px', border: '1px solid gray' }} />

                    <b style={{ marginLeft: '10px' }}>{row.name}</b>
                </div>
            </td>
            <td align='center'>
                <button className='btn btn-danger btn-sm'
                    onClick={() => {
                        onDelete(row.pnum)
                    }}>
                    회원삭제
                </button>
            </td>
        </tr>
    );
};

export default PersonRowItem;