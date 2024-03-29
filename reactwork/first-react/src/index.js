import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import AppEx from './App';
import First from './FirstComponent';
import reportWebVitals from './reportWebVitals';
import SecondApp from './SecondApp';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <AppEx /> */}
    <First/>
    <SecondApp/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
