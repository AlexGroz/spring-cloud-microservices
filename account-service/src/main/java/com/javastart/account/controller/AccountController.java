package com.javastart.account.controller;

import com.javastart.account.controller.dto.AccountResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/{accountId}")
    public AccountResponseDTO getAccount(@PathVariable Long accountId){

    }
}
