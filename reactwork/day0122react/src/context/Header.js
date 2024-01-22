import React, { useContext } from 'react';
import { ThemeContext } from './ThemeContext';
import { UserContext } from './UserContext';

const Header = () => {
    const { isDark, doll } = useContext(ThemeContext);
    const user = useContext(UserContext);

    return (
        <div className='header' style={{ backgroundColor: isDark ? 'black' : 'lightblue' }}>
            <h1>Welcome {user}!
                <img alt='' src={require(`../Image/${doll}`)} width='30' />
            </h1>
        </div>
    );
};

export default Header;