import React from 'react';
import Menu from './Menu';
import { Route, Routes } from 'react-router-dom';
import errimg from './Image/01.png';
import CallBackApp from './components/CallBackApp';
import MemoApp from './components/MemoApp';
import ReducerApp from './components/ReducerApp';
import ContextApp from './context/ContextApp';
import SweetApp from './components/SweetApp';
import './components/MyStyle.css';
import Home from './components/Home';
import QueryString from './components/QueryString';

const RouteMain = () => {
    return (
        <div className='main'>
            <Menu />
            <hr style={{ clear: 'both' }} />
            <Routes>
                <Route path='/' element={<Home />}></Route>
                <Route path='/callback' element={<CallBackApp />}></Route>
                <Route path='/memo' element={<MemoApp />}></Route>
                <Route path='/reducer' element={<ReducerApp />}></Route>
                <Route path='/context' element={<ContextApp />}></Route>
                <Route path='/sweet' element={<SweetApp />}></Route>
                <Route path='/query' element={<QueryString />}></Route>

                <Route path='*' element={
                    <div>
                        <h1>잘못된 URL 주소입니다</h1>
                        <br /><br />
                        <img alt='' src={errimg} />
                    </div>
                }>

                </Route>
            </Routes>

        </div>
    );
};

export default RouteMain;