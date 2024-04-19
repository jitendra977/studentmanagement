package com.nishanaweb.studentsystem.service.Transaction.Implementation;

import com.nishanaweb.studentsystem.model.Budget.Transactions;
import com.nishanaweb.studentsystem.repository.Transaction.TransactionsRepository;
import com.nishanaweb.studentsystem.service.Transaction.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionsServiceImpl implements TransactionsService {
    @Autowired
    private TransactionsRepository transactionsRepository;

    @Override
    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    @Override
    public void saveTransaction(Transactions transactions) {
        transactionsRepository.save(transactions);
    }


}
