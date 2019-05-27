package aspectjdemo.aop;

import java.util.ArrayList;
import java.util.List;

import aspectjdemo.model.Customer;

public class CustomerManament {

	List<Customer> customers;

	public CustomerManament() {
		customers = new ArrayList<>();
	}

	public Customer getCustomer(Integer id) {
		return getCustomerById(id);
	}

	public void addCustomer(Customer customer) {
		if (null != getCustomerById(customer.getId())) {
			throw new RuntimeException("Customer already existed.");
		}

		this.customers.add(customer);
		System.out.println("The customer: " + customer.getFullName() + " has been added.");
	}

	private Customer getCustomerById(Integer id) {
		return customers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
	}
}
