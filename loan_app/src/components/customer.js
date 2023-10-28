import { Link, Routes, Route, useNavigate, useParams } from "react-router-dom";
import { useState } from "react";


// component to register
export function ProfileRegistration(){
    //profile needs name,emailId, password, phone, dob
    let[customerId, setCustomerId] = useState('');
    let[firstname, setFirstName] = useState('');
    let[lastname, setLastName] = useState('');
    let[emilId, setEmailId] = useState('')
    let[password, setPassword] = useState('');
    let[phone, setPhone] = useState('');
    let[pan, setPan] = useState('');
    let navigate = useNavigate();
    let handleSubmit = (e) => {
        e.preventDefault();
        //once the data goes to login you need to navigate  to login
        let profile = {"customerId":customerId, "firstname":firstname, "lastname":lastname, "emailId":emilId, "password":password, "phone":phone, "pan":pan}
        //et url = ""
        //axios.post(url, profile)
        //.then( response => navigate('/login'))
        //.catch( err => navigate('/register'));
        console.log(profile)
        //navigate("/login");
    }
    return(<div className="container">
        <h3>Registration Form For Loan</h3><hr/>
        <form onSubmit={handleSubmit}>
        <div className="w-25" >
                <label className="fw-bold">Enter Customer-Id</label>
                <input type="number" onChange={(e) => setCustomerId(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label className="fw-bold">Enter Your First Name</label>
                <input type="text" onChange={(e) => setFirstName(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label className="fw-bold">Enter Your Last Name</label>
                <input type="text" onChange={(e) => setLastName(e.target.value)}></input>
            </div>
            <div className="w-25" >
                <label className="fw-bold">Enter Your Email-Id</label>
                <input type="email" onChange={(e) => setEmailId(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label className="fw-bold">Enter Your Password</label>
                <input type="password" onChange={(e) => setPassword(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label className="fw-bold">Enter Your Phone Number</label>
                <input type="number" onChange={(e) => setPhone(e.target.value)}></input>
            </div>
            <div className="w-25">
                <label className="fw-bold">Enter Your Pan-Card Number</label>
                <input type="number" onChange={(e) => setPan(e.target.value)}></input>
            </div>
            <div className="'w-25">
                <input type="submit" value='Register'></input>
            </div>
        </form>
        <div>
            <Link to = '/login'>Login</Link>
        </div>
    </div>)

}


//component to login
export function ProfileLogin() {
    let[emailId, setEmailId] = useState('');
    let[password, setPassword] = useState('');
    //to programmatically navigate
    let navigate = useNavigate();
    //authenticate the emailId and Password 
    let handleSubmit =(e) =>{
        e.preventDefault();
        //let Login = {emailId:"emailId", password:"password"}
        navigate('/success/'+emailId); //url: /success/:emailId
    };
    return(<div className="container mx-auto">
        <h3>Login Form</h3><hr/>
        <form onSubmit={handleSubmit}>
            <div className="w-25">
                <input type="text" placeholder="Enter Your Email-Id" className="form-control "
                onChange={(e) => setEmailId(e.target.value)}></input>
            </div>
            <div className="w-25">
                <input type="password" placeholder="Enter Your Password" className="form-control"
                onChange={(e) => setPassword(e.target.value)}></input>
            </div>
            <div>
                <input type="submit" className="btn btn-secondary" value='Login'></input>
            </div>
            <div>
                <Link to ='/register'>Create Profile</Link>
            </div>
        </form>
    </div>)
}
