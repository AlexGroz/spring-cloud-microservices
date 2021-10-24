package com.javastart.deposit.service;

import com.javastart.deposit.controller.dto.DepositResponseDTO;
import com.javastart.deposit.exception.DepositServiceException;
import com.javastart.deposit.repository.DepositRepository;
import com.javastart.deposit.rest.AccountServiceClient;
import com.javastart.deposit.rest.BillServiceClient;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DepositService {

    private final DepositRepository repository;

    private final AccountServiceClient accountServiceClient;

    private final BillServiceClient billServiceClient;

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public DepositService(DepositRepository repository, AccountServiceClient accountServiceClient,
                          BillServiceClient billServiceClient, RabbitTemplate rabbitTemplate) {
        this.repository = repository;
        this.accountServiceClient = accountServiceClient;
        this.billServiceClient = billServiceClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    public DepositResponseDTO deposit(Long accountId, Long billId, BigDecimal amount){
        if (accountId == null && billId == null){
            throw new DepositServiceException("Account is null and bill is null");
        }
    }
}
