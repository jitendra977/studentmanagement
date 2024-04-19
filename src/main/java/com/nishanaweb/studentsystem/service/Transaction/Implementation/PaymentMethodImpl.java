package com.nishanaweb.studentsystem.service.Transaction.Implementation;

import com.nishanaweb.studentsystem.model.Budget.Transactions;
import com.nishanaweb.studentsystem.repository.Transaction.PaymentMethodRepository;
import com.nishanaweb.studentsystem.service.Transaction.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<Transactions.PaymentMethod> getAllPaymentMethod() {
        return paymentMethodRepository.findAll();
    }

    @Override
    public void SavePaymentMethod(Transactions.PaymentMethod paymentMethod) {
        paymentMethodRepository.save(paymentMethod);
    }

}
