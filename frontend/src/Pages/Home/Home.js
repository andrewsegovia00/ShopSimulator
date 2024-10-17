import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import Image from 'react-bootstrap/Image';
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/Button';
import heroImg from "../../ImagesFolder/HeroPage/hero.png";
import 'bootstrap/dist/css/bootstrap.min.css';

const Home = () => {
    return (
        <>
            <div
                className="text-white"
                style={{
                    height: '100vh',
                    display: 'flex',
                    backgroundColor: '#1C1919',
                    position: 'relative',
                    alignItems: 'center'
                }}
            >
                <Container fluid>
                    <Row style={{ height: '80%' }}>

                        <Col xs={12} md={6} style={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
                            <Image
                                src={heroImg}
                                rounded
                                style={{ height: '80%', width: 'auto', objectFit: 'cover' }}
                            />
                        </Col>

                        <Col xs={12} md={6} style={{ display: 'flex', flexDirection: 'column', justifyContent: 'center' }}>
                            <h2>HOW TO PLAY</h2>
                            <p>
                                Step into the world of business management with FUN GAME, 
                                an immersive role-playing game where you'll learn the ins 
                                and outs of running a successful company. Start with a small 
                                startup and work your way up by mastering essential skills like 
                                billing, payroll, and debt management. Hire and manage employees, 
                                unlock bonuses, and expand your business empire by making strategic 
                                financial decisions. With realistic challenges and scenarios, you'll 
                                gain hands-on experience in paying off debt, handling employee payroll, 
                                and growing your business from the ground up. Can you build the ultimate 
                                business empire and stay out of the red?
                                </p>
                            
                            
                            <h2>ABOUT THE DEV</h2>
                            <p>
                            Korem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate 
                            libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu 
                            ad litora torquent per conubia nostra, per inceptos himenaeos.

                            </p>
                        </Col>
                    </Row>

                    <Button
                        style={{
                            position: 'absolute',
                            left: '50%',
                            bottom: '3em',
                            transform: 'translateX(-50%)',
                            borderRadius: '10%',
                            padding: '10px 40px',
                            border: '1px solid white',
                            backgroundColor: '#E54949',
                            color: 'white',
                            fontSize: '2em',
                        }}
                    >
                        <strong>Start</strong>
                    </Button>
                </Container>
            </div>
        </>
    );
};

export default Home;
