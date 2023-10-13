package com.picpaysimplificado.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.Domin.Transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}