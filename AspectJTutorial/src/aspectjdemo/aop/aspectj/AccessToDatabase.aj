package aspectjdemo.aop.aspectj;

import aspectjdemo.connector.ConnectionManagement;
import aspectjdemo.model.Customer;
import aspectjdemo.aop.CustomerManament;

public aspect AccessToDatabase {
	pointcut accessToDatabase(): (
			call(Customer CustomerManament.getCustomer(Integer)) ||
			call(void CustomerManament.addCustomer(Customer))
			);

	before() : accessToDatabase() {
		ConnectionManagement.openConnection();
	}

	after() returning : accessToDatabase() {
		ConnectionManagement.closeConnection();
	}

}
