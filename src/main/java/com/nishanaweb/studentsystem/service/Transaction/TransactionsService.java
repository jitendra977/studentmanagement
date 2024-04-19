package com.nishanaweb.studentsystem.service.Transaction;

import com.nishanaweb.studentsystem.model.Budget.Transactions;


import java.util.List;

public interface TransactionsService {
    public List<Transactions> getAllTransactions();
    public void saveTransaction(Transactions transactions);

}
