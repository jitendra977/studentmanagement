package com.nishanaweb.studentsystem.model.Budget;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
@Table(name = "Transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "transaction_category_id")
    private TransactionCategory transactionCategory;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @Entity
    @Data
    @Table(name = "Transaction_Category")
    public static class TransactionCategory {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String category_name;


    }

    @Data
    @Entity
    @Table(name = "PaymentMethod")
    public static class PaymentMethod {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String payment_method;

    }
}
