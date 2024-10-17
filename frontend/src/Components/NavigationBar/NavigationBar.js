import Container from "react-bootstrap/esm/Container"
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import { Link } from "react-router-dom"

const Navigationbar =  () => {
    
    return(
        <>
        <Navbar bg="dark" variant="dark">
            <Container justify>
                <Navbar.Brand as={Link} to="/">
                    <strong>Shop Simulator</strong>
                </Navbar.Brand>
                <Nav >
                    <Nav.Link as={Link} to="/dashboard" className="nav-link">How to Play</Nav.Link>
                    <Nav.Link as={Link} to="/addEmployee" className="nav-link">Bonuses</Nav.Link>
                </Nav>
            </Container>
        </Navbar>
        </>
        
    )
}

export default Navigationbar;
