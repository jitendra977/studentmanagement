package com.nishanaweb.studentsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishanaweb.studentsystem.model.Student;
import com.nishanaweb.studentsystem.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override 
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.orElse(null);
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
    @Override
    public void updateStudent(Long id,Student updatedStudent)
    {
        Student existingStudent = getStudentById(id);
        if(existingStudent != null){
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setEmail(updatedStudent.getEmail());
            studentRepository.save(existingStudent);
        }

    }
}
