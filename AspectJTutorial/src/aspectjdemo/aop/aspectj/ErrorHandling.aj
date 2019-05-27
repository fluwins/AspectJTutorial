package aspectjdemo.aop.aspectj;

import aspectjdemo.connector.ConnectionManagement;
import aspectjdemo.model.Customer;
import aspectjdemo.util.LogUtil;
import aspectjdemo.aop.CustomerManament;

public aspect ErrorHandling {
	pointcut errorHandling(): call(void CustomerManament.addCustomer(Customer));

	after() throwing (RuntimeException e): errorHandling() {
		LogUtil.logError("Error: " + e.getMessage());
		ConnectionManagement.closeConnection();
	}

}
