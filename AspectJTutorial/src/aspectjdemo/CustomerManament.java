package aspectjdemo;

import java.util.ArrayList;
import java.util.List;

public class CustomerManament {

	List<Customer> customers;

	public CustomerManament() {
		customers = new ArrayList<>();
	}

	public Customer getCustomer(Integer id) {
		return getCustomerById(id);
	}

	public void addCustomer(Customer customer) throws Exception {
		if (null != getCustomerById(customer.getId())) {
			throw new Exception("Customer already existed.");
		}

		this.customers.add(customer);
		System.out.println("The customer: " + customer.getFullName() + " has been added.");
	}

	private Customer getCustomerById(Integer id) {
		return customers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
	}
}
