package com.personal.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.personal.EntityClasses.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

}
