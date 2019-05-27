package aspectjdemo.nonaop;

import aspectjdemo.model.Customer;

public class Main {
	public static void main(String[] args) {
		CustomerManament customerManament = new CustomerManament();
		Customer customer = new Customer(1, "Tai Tran Thien");
		customerManament.addCustomer(customer);
		
		System.out.println("=====================================================\n");
		
		customerManament.getCustomer(1);
	}
}
