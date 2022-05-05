package com.project.debitcardservice.models.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class AccountType {
    private String description;
    private String type;
}
