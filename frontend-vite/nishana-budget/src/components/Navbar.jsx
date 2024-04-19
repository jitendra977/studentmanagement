import React from 'react';
import { NavLink } from 'react-router-dom';



const Navbar = () => {



    // // Function to format the date
    // function formatDate(date) {
    //   const options = {
    //     weekday: 'long',
    //     year: 'numeric',
    //     month: 'long',
    //     day: 'numeric',
    //     hour: 'numeric',
    //     minute: 'numeric',
    //     second: 'numeric',
    //     timeZoneName: 'short'
    //   };
    //   return date.toLocaleDateString('en-US', options);
    // }

    // // Function to update the timestamp
    // function updateTimestamp() {
    //   const timestampElement = document.getElementById('timestamp');
    //   const currentDate = new Date();
    //   const formattedDate = formatDate(currentDate);
    //   timestampElement.textContent = formattedDate;
    // }

    // // Call the updateTimestamp function to initially set the timestamp
    // updateTimestamp();

    // // Update the timestamp every second
    // setInterval(updateTimestamp, 1000);

  return (
    <>
    <nav className="navbar navbar-expand-lg bg-body-tertiary">
  <div className="container-fluid">
    <NavLink className="navbar-brand" to="/">NISHANA</NavLink>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <NavLink className="nav-link active" aria-current="page" to="/student">Student Management</NavLink>
        </li>
        <li className="nav-item">
          <NavLink className="nav-link active" aria-current="page" to="/budget">My Budget</NavLink>
        </li>
        <li className="nav-item">
          <NavLink className="nav-link" to="/about">About</NavLink>
        </li>
        
        <li className="nav-item">
          <a className="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
      <div className="d-flex bg-info m-2 p-1 border border-primary shadow-lg rounded">
          <div id="timestamp">December 12, 2009 6:00 pm GMT</div>
        </div>
      <form className="d-flex" role="search">
      <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button className="btn btn-outline-success" type="submit">Search</button>
        <button className="btn btn-outline-primary" type="submit">Admin</button>
      </form>
    </div>
  </div>
</nav>
    </>
  );
};

export default Navbar;
