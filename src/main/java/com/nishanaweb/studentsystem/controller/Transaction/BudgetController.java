package com.nishanaweb.studentsystem.controller.Transaction;

import com.nishanaweb.studentsystem.model.Budget.Transactions;
import com.nishanaweb.studentsystem.service.Transaction.PaymentMethodService;
import com.nishanaweb.studentsystem.service.Transaction.TransactionCategoryService;
import com.nishanaweb.studentsystem.service.Transaction.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    @Autowired
    private TransactionsService transactionsService;

    @Autowired
    private TransactionCategoryService transactionCategoryService;

    @Autowired
    private PaymentMethodService paymentMethodService;



    @PostMapping("/save")
    public String savePayment(@RequestBody Transactions transactions){
        transactionsService.saveTransaction(transactions);
        return "new transaction added";
    }

    @PostMapping("/addPaymentMethod")
    public String savePaymentMethod(@RequestBody Transactions.PaymentMethod paymentMethod){
        paymentMethodService.SavePaymentMethod(paymentMethod);
        return "new category added";
    }

    @PostMapping("/saveCategory")
    public  String saveTransactionCategory(@RequestBody Transactions.TransactionCategory transactionCategory){
        transactionCategoryService.saveTransaction(transactionCategory);
        return "transaction category added";
    }

    @GetMapping("/getPayment")
    public List<Transactions.PaymentMethod> getPaymentMethod(){
        return paymentMethodService.getAllPaymentMethod();
    }

    @GetMapping("/getAll")
    public List<Transactions> getAllTransaction(){
        return transactionsService.getAllTransactions();
    }

}
