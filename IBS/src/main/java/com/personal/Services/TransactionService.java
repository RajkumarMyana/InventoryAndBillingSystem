package com.personal.Services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.EntityClasses.Customer;
import com.personal.EntityClasses.Invoice;
import com.personal.EntityClasses.Product;
import com.personal.Repository.CustomerRepository;
import com.personal.Repository.InvoiceRepository;
import com.personal.Repository.ProductRepository;
import com.personal.payload.InvoicePayload;

@Service
public class TransactionService {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public Invoice addInvoice(InvoicePayload invoicePayload) {
		Invoice invoice = new Invoice();
		invoice.setDate(new Date());
		
		Customer customer = customerRepository.findById(invoicePayload.getCid()).orElseThrow();
		invoice.setCustomer(customer);
		
		Double totalAmount = 0.0;
		Map<String, Product> productDetails = new HashMap<>();
		for( String pid: invoicePayload.getProductQty().keySet() ) {
			Double amount = 0.0;
			Product product = productRepository.findById(pid).orElseThrow();
			Integer qty = invoicePayload.getProductQty().get(pid);
			amount = product.getPrice()*qty;
			productDetails.get(pid);
			productDetails.put(pid, product);
			totalAmount += amount;
		}

		invoice.setProductDetails(productDetails);
		invoice.setTotalAmount(totalAmount);
		invoiceRepository.save(invoice);
		return invoice;
				
	}
}
