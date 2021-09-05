package com.javastart.account.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {

    private Long accountId;

    private String name;

    private String email;

    private  String phone;

    private OffsetDateTime creationDate;

}
