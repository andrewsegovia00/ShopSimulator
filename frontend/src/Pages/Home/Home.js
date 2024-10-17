import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import heroImg from "../../ImagesFolder/HeroPage/hero.png";
import Image from 'react-bootstrap/Image';
import 'bootstrap/dist/css/bootstrap.min.css';

const Home = () => {
    return (
    <>
    {/* <div className="bg-dark" > */}
    <div className="bg-dark text-white" style={{ height: '100vh', display: 'flex', alignItems: 'center' }}>
        <Container>
            <Row>
                <Col xs={4}>
                <Image src={heroImg} rounded  style={{ width: '60vh'}}/>
                </Col>
            </Row>
        </Container>
    </div>
    </>
    )
}

export default Home;