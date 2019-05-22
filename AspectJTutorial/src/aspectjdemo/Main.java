package aspectjdemo;

public class Main {

	//Before apply AOP
	public static void main(String[] args) {
		CustomerManament customerManament = new CustomerManament();
		Customer customer = new Customer(1, "Tai Tran Thien");
		try {
			ConnectionManagement.openConnection();
			customerManament.addCustomer(customer);
			ConnectionManagement.closeConnection();
		} catch (Exception e) {}
	}
	
	//Apply AOP
//	public static void main(String[] args) {
//		CustomerManament customerManament = new CustomerManament();
//		Customer customer = new Customer(1, "Tai Tran Thien");
//		try {
//			customerManament.addCustomer(customer);
//			System.out.println("=====================================================");
//			customerManament.addCustomer(customer);
//		} catch (Exception e) {}
//		System.out.println("=====================================================");
//		Customer customer1 = customerManament.getCustomer(1);
//		System.out.println("Customer info: " + customer1.getFullName());
//	}
}
