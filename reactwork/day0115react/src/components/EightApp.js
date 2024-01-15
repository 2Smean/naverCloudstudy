import { AddAPhotoRounded, AddAlarmRounded, CameraRollOutlined, DownloadDone, DownloadForOffline, ImageAspectRatio, PhoneBluetoothSpeakerOutlined, PhotoAlbum, PhotoCamera, PhotoCameraBackOutlined, UpdateRounded } from '@mui/icons-material';
import React from 'react';

function EightApp(props) {
    return (
        <div>
            <h3 className='alert alert-info'>EightApp</h3>
            <AddAPhotoRounded />
            <AddAlarmRounded />
            <CameraRollOutlined />
            <UpdateRounded />
            <DownloadDone />
            <DownloadForOffline />
            <PhotoAlbum />
            <PhoneBluetoothSpeakerOutlined />
            <ImageAspectRatio />
            <PhotoCameraBackOutlined />
        </div>
    );
}

export default EightApp;