package com.vishist.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vishist.customer.dal.entities.Customer;
import com.vishist.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Customer elite");
		customer.setEmail("someemail@yahoo.com");

		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomerById() {
		Optional<Customer> findById = customerRepository.findById(1l);
		if (findById.isPresent()) {
			Customer customer = findById.get();
			System.out.println(customer);

		}
	}

	@Test
	public void testUpdateStudent() {
		Optional<Customer> findById = customerRepository.findById(1l);
		if (findById.isPresent()) {
			Customer customer = findById.get();
			customer.setEmail("someemail@gmail.com");

			customerRepository.save(customer);
		}
	}

	@Test
	public void testDelete() {
		Optional<Customer> findById = customerRepository.findById(1l);
		if (findById.isPresent()) {
			Customer customer = findById.get();
			customerRepository.delete(customer);
		}
	}
}
