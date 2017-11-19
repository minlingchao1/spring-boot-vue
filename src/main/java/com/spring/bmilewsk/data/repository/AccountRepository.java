package com.spring.bmilewsk.data.repository;

import com.spring.bmilewsk.data.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Optional<Account> findById(Long id);
}