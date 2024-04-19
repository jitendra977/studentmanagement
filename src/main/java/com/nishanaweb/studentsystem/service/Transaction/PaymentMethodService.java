package com.nishanaweb.studentsystem.service.Transaction;

import com.nishanaweb.studentsystem.model.Budget.Transactions;


import java.util.List;


public interface PaymentMethodService {
    public List<Transactions.PaymentMethod>getAllPaymentMethod();
    public void SavePaymentMethod(Transactions.PaymentMethod paymentMethod);
}
