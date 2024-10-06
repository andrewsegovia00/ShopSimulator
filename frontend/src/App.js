import './App.css';
import Navigationbar from './Components/NavigationBar/NavigationBar';
// import Dashboard from './Pages/Dashboard/Dashboard';
// import ErrorPage from './Pages/ErrorPage/ErrorPage';
import { Routes, Route } from "react-router-dom";

function App() {

  return (
    <>
      <Navigationbar />
      <Routes>
        {/* <Route path="/dashboard" element={<Dashboard/>} />
        <Route path="*" element={<ErrorPage/>} /> */}
      </Routes>
    </>
  );
}

export default App;
