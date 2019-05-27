package aspectjdemo.aop;

import aspectjdemo.model.Customer;

public class Main {
	// Apply AOP
	public static void main(String[] args) {
		CustomerManament customerManament = new CustomerManament();
		Customer customer = new Customer(1, "Tai Tran Thien");
		
		try {
			customerManament.addCustomer(customer);
			System.out.println("=====================================================\n");
			customerManament.addCustomer(customer);
		} catch (Exception e) {}
		
		System.out.println("=====================================================\n");
		customerManament.getCustomer(1);
	}
}
