package com.project.debitcardservice.models.entity;

import com.project.debitcardservice.models.dto.Account;
import com.project.debitcardservice.models.dto.Client;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document(collection = "debit-card")
public class DebitCardEntity {
    @Id
    private String id;
    private Client client;
    private Account mainAccount;
    private ArrayList<Account> accountList;
}
