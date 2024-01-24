import { Alert } from '@mui/material';
import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import MemberCard from './MemberCard';

const MemberList = () => {
    const [memberlist, setMemberList] = useState([]);

    const navi = useNavigate();

    const getMemberlist = () => {
        axios.get("/member/list")
            .then(res => {
                console.log(res)
                setMemberList(res.data.mlist);
            })
    }

    useEffect(() => {
        getMemberlist();
    }, []);

    //삭제 이벤트 
    const deleteMember = (num) => {
        const a = window.confirm("삭제하려면 확인을 눌러주세요!");
        if (a) {
            const url = "/member/delete?num=" + num;
            axios.delete(url)
                .then(res => {
                    //삭제 성공 후 목록 다시 출력 
                    getMemberlist();
                })
        }
    }

    return (
        <div>
            <h4 className='alert alert-danger'>회원 목록(총 {memberlist.length}명)</h4>
            <table className='table table-bordered'>

                <tbody>
                    {
                        memberlist &&
                        memberlist.map((row, idx) => (
                            <MemberCard key={idx} row={row}
                                deleteMember={deleteMember} />
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
};

export default MemberList;