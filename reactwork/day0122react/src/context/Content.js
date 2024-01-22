import React, { useContext } from 'react';
import { ThemeContext } from './ThemeContext';
import { UserContext } from './UserContext';

const Content = () => {
    const { isDark, doll } = useContext(ThemeContext);
    const user = useContext(UserContext);
    return (
        <div className='content' style={{ backgroundColor: isDark ? 'gray' : 'white' }}>
            <p>역시 깐따삐아야ㅋㅋ 성능 좋구만
                <img alt='' src={require(`../Image/${doll}`)} />
            </p>
        </div>
    );
};

export default Content;