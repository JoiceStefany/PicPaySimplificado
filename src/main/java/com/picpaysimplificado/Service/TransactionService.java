package com.picpaysimplificado.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpaysimplificado.DTOs.TransactionDto;
import com.picpaysimplificado.Repository.TransactionRepository;


@Service
public class TransactionService {
    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    public void createTransaction(TransactionDto transactionDto ) throws Exception {
        User sender = this.userService.findUserById(transactionDto.senderId());
    }
}
