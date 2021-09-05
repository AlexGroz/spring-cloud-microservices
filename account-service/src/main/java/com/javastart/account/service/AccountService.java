package com.javastart.account.service;

import com.javastart.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {


    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountRepository getAccountById(Long accountId){
        return accountRepository.findById(accountId).orElseThrow()
    }
}



