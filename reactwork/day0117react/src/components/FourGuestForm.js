import axios from 'axios';
import React, { useState } from 'react';

const FourGuestForm = () => {
    const [photo, setPhoto] = useState('');
    const [nickname, setNickname] = useState('');
    const [content, setContent] = useState(''); //내용 많을 때는 Ref 로 하는게 좋음

    const imageUrl = "https://kr.object.ncloudstorage.com/bitcamp-lsm/bootmyshop/"; //ncloud 에서 가져옴

    //파일 업로드 이벤트 
    const onUploadEvent = (e) => {
        const uploadFile = new FormData();
        uploadFile.append("upload", e.target.files[0]);

        //.post 안주고 axios.post() 가 아니라 내부에 있기 때문에
        axios({
            method: 'post',
            url: "/guest/upload",
            data: uploadFile,
            headers: { 'Content-Type': 'multipart/form-data' }
        }).then(res => {
            setPhoto(res.data); //실제 스토리지에 올라간 사진파일명 반환
        })
    }

    return (
        <div>
            <div style={{ width: '400px' }}>
                <input type='file' className='form-control' onChange={onUploadEvent} />
                <img alt='' src={imageUrl + photo} width={130} />
                <b>{photo}</b>
            </div>
        </div>
    );
};

export default FourGuestForm;