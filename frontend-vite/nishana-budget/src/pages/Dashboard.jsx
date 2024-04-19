import React, { useState, useEffect } from 'react'; // Add import statement for React
import { Button, Container, Form,  Table, Modal } from "react-bootstrap";

const Dashboard = () => {
  const [students, setStudents] = useState([]); // Initialize students state properly

  useEffect(() => {
    fetchStudent(); // Call fetchStudent function when component mounts
  }, []); // Empty dependency array to ensure useEffect runs only once when component mounts

  const fetchStudent = () => {
    fetch("http://127.0.0.1:8080/student/get")
      .then((res) => res.json())
      .then((result) => {
        setStudents(result);
      });
  };

  const confirmDelete = (id) => {
    // Add your delete confirmation logic here
  };

  const handleEdit = (student) => {
    // Add your edit logic here
  };

  return (
    <>
      <div className="container">
      
      <Table striped bordered hover>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {students.map((student) => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.address}</td>
              <td>{student.email}</td>
              <td>
                <Button style={{ marginRight: "10px" }} onClick={() => confirmDelete(student.id)} variant="danger">
                  Delete
                </Button>
                <Button onClick={() => handleEdit(student)}>Edit</Button>
              </td>
            </tr>
          ))}
        </tbody>
      </Table>
      </div>
    </>
  );
};

export default Dashboard;
