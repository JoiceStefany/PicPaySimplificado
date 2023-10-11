package com.picpaysimplificado.Domin.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transaction;

public interface transactionRepository extends JpaRepository<Transaction, Long> {
    
    
}
