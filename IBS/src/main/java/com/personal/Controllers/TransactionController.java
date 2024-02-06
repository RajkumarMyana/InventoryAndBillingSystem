package com.personal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.EntityClasses.Invoice;
import com.personal.EntityClasses.Product;
import com.personal.EntityClasses.Transaction;
import com.personal.Repository.TransactionRepository;
import com.personal.Services.TransactionService;
import com.personal.payload.InvoicePayload;
import com.personal.payload.ProductDetails;
import com.personal.payload.TransactionPayload;

@RestController
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping(value="/transaction")
	public String createTransaction(@RequestBody TransactionPayload transactionPayload) {
		Transaction transaction = new Transaction();
		transaction.setCid(transactionPayload.getCid());
		transaction.setProductQty(transactionPayload.getProductQty());
		transaction.setPaymentMethod(transactionPayload.getPaymentMethod());		
		
		InvoicePayload invoicePayload = new InvoicePayload();
		invoicePayload.setCid(transactionPayload.getCid());
		invoicePayload.setProductQty(transactionPayload.getProductQty());
		Invoice invoice = transactionService.addInvoice(invoicePayload);
		transaction.setInvoice(invoice);
		return transaction.getTransactionId();
	}
	
	@GetMapping( value  = "/getAllTransactions")
	public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}
}
