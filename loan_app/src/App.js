import logo from './logo.svg';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import { ProfileLogin, ProfileRegistration } from './components/customer';


function App() {
  return (
    <div className = 'container-fluid'>
    <div className = 'alert alert-secondary'>
      <h2 className = 'text-center'>Loan Application</h2>
    </div>
    <div>
      <Routes>
        <Route path='' element={<ProfileLogin/>}></Route>
        <Route path='/login' element={<ProfileLogin/>}></Route>
        <Route path='/register' element={<ProfileRegistration/>}></Route>
        
      </Routes>
    </div>
  </div>
    
  );
}


export default App;
