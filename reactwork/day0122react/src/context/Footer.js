import React, { useContext } from 'react';
import { ThemeContext } from './ThemeContext';

const Footer = () => {
    const { isDark, setIsDark, doll } = useContext(ThemeContext);

    return (
        <footer className='footer' style={{ backgroundColor: isDark ? 'black' : 'lightgray' }}>
            <img alt='' src={require(`../Image/${doll}`)} style={{ width: '30px' }} />
            <button type='button' className='button'
                onClick={() => setIsDark(!isDark)}>
                Dark Mode</button>
        </footer>
    );
};

export default Footer;