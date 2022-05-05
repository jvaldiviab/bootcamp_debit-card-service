package com.project.debitcardservice.repository;

import com.project.debitcardservice.models.entity.DebitCardEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDebitCardRepository extends ReactiveMongoRepository<DebitCardEntity, String> {

}
