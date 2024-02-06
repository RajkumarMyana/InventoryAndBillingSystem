package com.personal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.EntityClasses.Invoice;
import com.personal.Repository.InvoiceRepository;

@RestController
public class InvoiceController {


	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@GetMapping(value = "/getInvoices")
	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}
}
