package com.nishanaweb.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nishanaweb.studentsystem.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{


}
