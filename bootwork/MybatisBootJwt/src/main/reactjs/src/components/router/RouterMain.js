import React from 'react';
import '../MyStyle.css';
import Menu from '../Menu';
import { Route, Routes } from 'react-router-dom';
import Home from '../Home';
import MemberList from '../member/MemberList';
import MemberForm from '../member/MemberForm';
import BoardList from '../board/BoardList';
import LoginForm from '../login/LoginForm';
import BoardForm from '../board/BoardForm';
import BoardDetail from '../board/BoardDetail';

const RouterMain = () => {
    return (
        <div>
            <Menu />
            <br style={{ clear: 'both' }} />
            <div style={{ marginTop: '30px' }}>
                <Routes>
                    <Route path='/' element={<Home />} />
                    <Route path='/member'>
                        <Route path='list' element={<MemberList />} />
                        <Route path='form' element={<MemberForm />} />
                    </Route>

                    <Route path='/board'>
                        <Route path='list' element={<BoardList />} />
                        <Route path='list/:currentPage' element={<BoardList />} />
                        <Route path='detail/:h' element={<BoardDetail />} />
                        <Route path='form' element={<BoardForm />} />
                    </Route>

                    <Route path='/login' element={<LoginForm />} />
                </Routes>

            </div>
        </div>
    );
};

export default RouterMain;