package com.nishanaweb.studentsystem.repository.Transaction;

import com.nishanaweb.studentsystem.model.Budget.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
