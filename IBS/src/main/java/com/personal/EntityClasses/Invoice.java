package com.personal.EntityClasses;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Invoices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

	@Id
	private String orderId;
	private Date date;
	private Customer customer;
	private Map<String, Product> productDetails;
	private Double totalAmount;
}
