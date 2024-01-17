import * as React from 'react';
import { styled } from '@mui/material/styles';
import Card from '@mui/material/Card';
import CardHeader from '@mui/material/CardHeader';
import CardMedia from '@mui/material/CardMedia';
import CardContent from '@mui/material/CardContent';
import CardActions from '@mui/material/CardActions';
import Collapse from '@mui/material/Collapse';
import Avatar from '@mui/material/Avatar';
import IconButton, { IconButtonProps } from '@mui/material/IconButton';
import Typography from '@mui/material/Typography';
import { red } from '@mui/material/colors';
import FavoriteIcon from '@mui/icons-material/Favorite';
import ShareIcon from '@mui/icons-material/Share';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import { Photo } from '@mui/icons-material';


const ExpandMore = styled((props) => {
    const { expand, ...other } = props;
    return <IconButton {...other} />;
})(({ theme, expand }) => ({
    transform: !expand ? 'rotate(0deg)' : 'rotate(180deg)',
    marginLeft: 'auto',
    transition: theme.transitions.create('transform', {
        duration: theme.transitions.duration.shortest,
    }),
}));

export default function ThreeCardApp({ item }) {
    const [expanded, setExpanded] = React.useState(false);
    const [heart, setHeart] = React.useState(false);
    const [share, setShare] = React.useState(false);
    const [settings, setSettings] = React.useState(false);

    const handleExpandClick = () => {
        setExpanded(!expanded);
    };

    //3초뒤에 꺼지는 함수
    const handleClick = () => {
        // 버튼을 눌렀을 때 red로 설정
        setSettings(true);

        // 3초 후에 다시 gray로 설정
        setTimeout(() => {
            setSettings(false);
        }, 3000);
    };

    return (
        <Card sx={{ maxWidth: 345 }}>
            <CardHeader
                avatar={
                    <Avatar sx={{ bgcolor: red[500] }} aria-label="recipe">
                        Bit
                    </Avatar>
                }
                action={
                    <IconButton aria-label="settings"
                        style={{ color: settings ? "red" : "gray" }}
                        onClick={handleClick}>
                        <MoreVertIcon />
                    </IconButton>
                }
                title="Person 회원"
                subheader={item.writeday}
            />
            <CardMedia
                component="img"
                height="230"
                image={require(`../images/${item.photo}`)}
                alt="Paella dish"
            />
            <CardContent>
                <Typography variant="body2" color="text.secondary">
                    <h4><b>이름 : {item.name}</b></h4>
                    <h4><b>나이 : {item.age}</b></h4>
                </Typography>
            </CardContent>
            <CardActions disableSpacing>
                <IconButton aria-label="add to favorites"
                    style={{ color: heart ? "red" : "gray" }}
                    onClick={() => {
                        setHeart(!heart);
                    }}>
                    <FavoriteIcon />
                </IconButton>
                <IconButton aria-label="share"
                    style={{ color: share ? "blue" : "gray" }}
                    onClick={() => {
                        setShare(!share)
                    }}>
                    <ShareIcon />
                </IconButton>
                <ExpandMore
                    expand={expanded}
                    onClick={handleExpandClick}
                    aria-expanded={expanded}
                    aria-label="show more"
                >
                    <ExpandMoreIcon />
                </ExpandMore>
            </CardActions>
            <Collapse in={expanded} timeout="auto" unmountOnExit>
                <CardContent>
                    <Typography paragraph>회원정보</Typography>
                    <Typography paragraph style={{ color: 'pink', backgroundColor: 'black' }}>
                        <h6>혈액형 : {item.blood}형</h6>
                        <h6>가입일 : {item.writeday}</h6>
                    </Typography>
                </CardContent>
            </Collapse>
        </Card>
    );
}
