package com.personal.payload;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionPayload {

	private Integer cid;
	private Map<String, Integer> productQty;
	private String paymentMethod;
}
