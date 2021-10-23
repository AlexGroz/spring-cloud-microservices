package com.javastart.deposit.controller;

import com.javastart.deposit.controller.dto.DepositResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {

    @PostMapping("/deposits")
    public DepositResponseDTO deposit(){

    }
}
