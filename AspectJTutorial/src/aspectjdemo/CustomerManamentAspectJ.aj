//package aspectjdemo;
//
//import java.util.Date;
//
//public aspect CustomerManamentAspectJ {
//	pointcut accessToDatabase(): (
//			call(Customer CustomerManament.getCustomer(Integer)) ||
//			call(void CustomerManament.addCustomer(Customer))
//			);
//
//	before() : accessToDatabase() {
//		ConnectionManagement.openConnection();
//	}
//
//	after() returning : accessToDatabase() {
//		ConnectionManagement.closeConnection();
//	}
//
//	pointcut errorHandling(): call(void CustomerManament.addCustomer(Customer));
//
//	after() throwing (Exception e): errorHandling() {
//		ConnectionManagement.logError(e);
//		ConnectionManagement.closeConnection();
//	}
//
//	pointcut trackAccessCustomer(): call(Customer CustomerManament.getCustomer(Integer));
//
//	after() returning(Customer customer) : trackAccessCustomer() {
//		//Process result
//		System.out.println("Customer " + customer.getFullName() + " has been accessed at " + new Date());
//	}
//}
