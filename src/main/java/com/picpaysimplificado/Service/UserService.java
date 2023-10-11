package com.picpaysimplificado.Service;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpaysimplificado.Domin.User;
import com.picpaysimplificado.Domin.UserType;
import com.picpaysimplificado.Repository.UserRepository;

@Service

public class UserService {
    
    @Autowired
    private UserRepository repository;
     
    public void validationTransation(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
          throw new Exception("Usuário do tipo logista não pode realizar a transação");
        }
        if (sender.getBalance().compareTo(amount) < 0){
             throw new Exception("Saldo Insuficiente");
        }
    }
    public User findUserById(Long id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
     }
    public void saveUser(User user){
        this.repository.save(user);
    }
}