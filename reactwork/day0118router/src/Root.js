import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import RouterMain from '../../day0118router/src/RouterMain';

const Root = () => {
    return (
        <BrowserRouter>
            <RouterMain />
        </BrowserRouter>
    );
};

export default Root;