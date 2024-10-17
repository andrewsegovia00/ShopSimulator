import './App.css';
import Navigationbar from './Components/NavigationBar/NavigationBar';
// import Dashboard from './Pages/Dashboard/Dashboard';
import ErrorPage from './Pages/ErrorPage/ErrorPage';
import Home from './Pages/Home/Home';
import { Routes, Route } from "react-router-dom";

function App() {

  return (
    <>
      <Navigationbar />
      <Routes>
      <Route path="/" element={<Home />} />
      {/* <Route path="/dashboard" element={<Dashboard/>} />
      <Route path="/addEmployee" element={<NewEmployee />} />
      <Route path="/updateEmployee/:id" element={<UpdateEmployee />} /> */}
      <Route path="*" element={<ErrorPage/>} />
      </Routes>
    </>
  );
}

export default App;
