package com.picpaysimplificado.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.Domin.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
    Optional<User> findUserByDocument(String document);

  Optional<User> findById(Long id);
}