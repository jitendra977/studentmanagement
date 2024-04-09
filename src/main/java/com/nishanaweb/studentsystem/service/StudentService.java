package com.nishanaweb.studentsystem.service;
import com.nishanaweb.studentsystem.model.Student;

import java.util.List;


public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> getAllStudents();
    public void deleteStudentById(Long id);
    public Student getStudentById(Long id);

    void updateStudent(Long id, Student updatedStudent);
}
