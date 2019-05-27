package aspectjdemo.nonaop;

import java.util.ArrayList;
import java.util.List;

import aspectjdemo.connector.ConnectionManagement;
import aspectjdemo.model.Customer;

public class CustomerManament {
	List<Customer> customers;

	public CustomerManament() {
		customers = new ArrayList<>();
	}

	public Customer getCustomer(Integer id) {
		ConnectionManagement.openConnection();
		Customer customer = getCustomerById(id);
		System.out.println("Customer info: " + customer.getFullName() + ".");
		ConnectionManagement.closeConnection();
		return customer;
	}

	public void addCustomer(Customer customer) {
		ConnectionManagement.openConnection();
		if (null != getCustomerById(customer.getId())) {
			throw new RuntimeException("Customer already existed.");
		}

		this.customers.add(customer);
		System.out.println("The customer: " + customer.getFullName() + " has been added.");
		ConnectionManagement.closeConnection();
	}

	private Customer getCustomerById(Integer id) {
		Customer customer = customers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
		return customer;
	}
}
