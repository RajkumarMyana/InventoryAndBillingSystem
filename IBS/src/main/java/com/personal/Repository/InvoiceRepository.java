package com.personal.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.personal.EntityClasses.Invoice;

@Repository
public interface InvoiceRepository extends MongoRepository<Invoice, String>{

}
