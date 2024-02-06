package com.personal.EntityClasses;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	
	@Id
	private String transactionId;
	private Integer cid;
	private Map<String, Integer> productQty;
    private Invoice invoice;
    private String paymentMethod;
}
