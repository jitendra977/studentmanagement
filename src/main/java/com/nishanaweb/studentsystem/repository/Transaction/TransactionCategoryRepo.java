package com.nishanaweb.studentsystem.repository.Transaction;

import com.nishanaweb.studentsystem.model.Budget.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionCategoryRepo extends JpaRepository<Transactions.TransactionCategory,Long> {

}
