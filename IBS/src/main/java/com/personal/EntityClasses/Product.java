package com.personal.EntityClasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("Inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	private String pid;
	private String pname;
	private Double price;
	private Integer qty;
}
