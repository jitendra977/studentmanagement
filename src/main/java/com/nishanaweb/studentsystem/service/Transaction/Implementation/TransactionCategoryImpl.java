package com.nishanaweb.studentsystem.service.Transaction.Implementation;

import com.nishanaweb.studentsystem.model.Budget.Transactions;
import com.nishanaweb.studentsystem.repository.Transaction.TransactionCategoryRepo;
import com.nishanaweb.studentsystem.service.Transaction.TransactionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionCategoryImpl implements TransactionCategoryService {
    @Autowired
    private TransactionCategoryRepo transactionCategoryRepo;

    @Override
    public void saveTransaction(Transactions.TransactionCategory transactionCategory) {
        transactionCategoryRepo.save(transactionCategory);
    }
}
