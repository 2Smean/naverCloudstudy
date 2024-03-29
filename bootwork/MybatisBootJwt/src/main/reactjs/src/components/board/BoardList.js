import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { Link, useNavigate, useParams } from 'react-router-dom';
import BoardRowItem from './BoardRowItem';

const BoardList = () => {
    const [data, setData] = useState(''); //서버에서 보낸 리스트및 페이지 출력에 필요한 모든 데이타들 (db에 있는거 다받음)
    const [search, setSearch] = useState('');

    const navi = useNavigate();
    const { currentPage } = useParams();
    console.log({ currentPage }); //값이 안넘어올 경우 null

    //처음 시작시 1페이지 목록 가져온다
    const boardList = () => {
        const url = "/board/list?currentPage=" + (currentPage == null ? 1 : currentPage) + "&search=" + search;
        axios.get(url)
            .then(res => {
                setData(res.data);
            })
    }

    // useEffect(() => {
    //     console.log("boardList useEffect! 확인#1")
    //     boardList();
    // }, []); //처음 시작시 한번 호출 

    useEffect(() => {
        console.log("boardList useEffect! 확인#2")
        boardList();
    }, [currentPage]); //페이지 번호나 검색단어가 바뀔때마다 다시 호출. after: search 뻄 search 놔두면 계속 호출됨

    return (
        <div>
            <h4 className='alert alert-danger'>게시판 목록
                {
                    sessionStorage.token
                    &&
                    <button type='button' className='btn btn-info'
                        onClick={() => navi("/board/form")}>글쓰기</button>
                }
            </h4>

            <div className='input-group' style={{ width: '300px', float: 'right' }}>
                <input type='text' className='form-control'
                    value={search} onChange={(e) => setSearch(e.target.value)}
                    placeholder='검색할 제목을 입력해주세요' />
                &nbsp;
                <button type='button' className='btn btn-success btn-sm'
                    onClick={() => {
                        // 검색 버튼 클릭 시 currentPage를 1로 설정하여 검색 결과가 첫 페이지에서 시작하도록 함
                        const url = `/board/list?currentPage=1&search=${search}`;

                        axios.get(url)
                            .then(res => {
                                setData(res.data);
                            })
                            .catch(error => {
                                console.error("게시판 목록을 가져오는 중 오류 발생:", error);
                            });
                    }}>검색</button>
            </div>

            <table className='table table-bordered' style={{ width: '600px' }}>
                <thead>
                    <tr>
                        <th style={{ width: '60px', backgroundColor: '#ddd' }}>번호</th>
                        <th style={{ width: '350px', backgroundColor: '#ddd' }}>제목</th>
                        <th style={{ width: '100px', backgroundColor: '#ddd' }}>작성자</th>
                        <th style={{ width: '60px', backgroundColor: '#ddd' }}>조회</th>
                        <th style={{ width: '130px', backgroundColor: '#ddd' }}>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        data.list &&
                        data.list.map((row, idx) => (
                            <BoardRowItem key={idx} row={row} idx={idx} no={data.no} />
                        ))
                    }
                </tbody>
            </table>

            <div style={{ width: '700px', textAlign: 'center' }}>
                {/* 이전으로 이동 */}
                {
                    data.startPage > 1 ?
                        <Link to={`/board/list/${data.startPage - 1}`} className='pagenum'>
                            <b style={{ color: 'black' }}>이전</b>
                        </Link> : ''
                }
                {
                    data.parr &&
                    data.parr.map((n, i) =>
                        <Link to={`/board/list/${n}`} className='pagenum'>
                            <b style={{ color: n == currentPage ? 'red' : 'black' }}>
                                {n}
                            </b>
                        </Link>)
                }
                {/* 다음으로 이동 */}
                {
                    data.endPage < data.totalPage ?
                        <Link to={`/board/list/${data.endPage + 1}`} className='pagenum'>
                            <b style={{ color: 'black' }}>다음</b>
                        </Link> : ''
                }
            </div>
        </div>
    );
};

export default BoardList;