package com.spring.bmilewsk.services;

import com.spring.bmilewsk.data.entity.Account;

import java.util.Optional;

public interface AccountService {
    Optional<Account> findById(Long id);
}
