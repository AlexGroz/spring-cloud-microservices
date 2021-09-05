package com.javastart.account.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Getter
@NoArgsConstructor
public class AccountRequestDTO {

    private String name;

    private String email;

    private String phone;

    private OffsetDateTime creationDate;
}
