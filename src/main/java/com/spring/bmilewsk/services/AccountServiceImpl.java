package com.spring.bmilewsk.services;


import com.spring.bmilewsk.data.entity.Account;
import com.spring.bmilewsk.data.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public Optional<Account> findById(Long id) {
        return this.repository.findById(id);
    }
}
