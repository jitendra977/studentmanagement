package com.nishanaweb.studentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nishanaweb.studentsystem.model.Student;
import com.nishanaweb.studentsystem.service.StudentService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }    
    @GetMapping("/get")
    public List<Student>getAllStudent(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}") // Define endpoint for DELETE request with student ID as a path variable
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "Student with ID " + id + " is deleted";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student updateStudent) {
        Student existingStudent = studentService.getStudentById(id);
        if (existingStudent != null) {
            existingStudent.setName(updateStudent.getName());
            existingStudent.setAddress(updateStudent.getAddress());
            existingStudent.setEmail(updateStudent.getEmail());
            // Update other fields as needed
            studentService.saveStudent(existingStudent);
            return "Student with ID " + id + " is updated";
        } else {
            return "Student with ID " + id + " not found";
        }
    }

}
