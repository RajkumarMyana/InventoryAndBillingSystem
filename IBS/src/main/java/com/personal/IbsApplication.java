package com.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class IbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbsApplication.class, args);
	}

}
