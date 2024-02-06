package com.personal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.EntityClasses.Customer;
import com.personal.Repository.CustomerRepository;


@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping(value="/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer.getCname();
	}
	
	@GetMapping( path = "/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
//	@RequestMapping(value="/getCustomerDetails/{cid}",method = RequestMethod.GET)
//	public Customer getCustomerDetailsById(@PathVariable Integer cid) {
//		return customerRepository.findByCid(cid).get(0);
////		return customerRepository.getCustomerDetailsById(cid);
//	}
//	
//	@RequestMapping(value = "/deleteCustomer/{cid}",method = RequestMethod.DELETE)
//	public void deleteCustomer(@PathVariable Integer cid) {
//		customerRepository.deleteByCid(cid);
////		return customerRepository.deleteCustomer(cid);
//	}
}
