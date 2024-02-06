package com.personal.payload;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {
	

	private String pid;
	private String pname;
	private Map<Double, Integer> priceQty;
	
}
