package com.personal.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.personal.EntityClasses.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>{

}
