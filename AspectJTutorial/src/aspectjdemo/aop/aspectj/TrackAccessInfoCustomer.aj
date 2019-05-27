package aspectjdemo.aop.aspectj;

import java.util.Date;

import aspectjdemo.model.Customer;
import aspectjdemo.util.LogUtil;
import aspectjdemo.aop.CustomerManament;

public aspect TrackAccessInfoCustomer {
	pointcut trackAccessCustomer(): call(Customer CustomerManament.getCustomer(Integer));

	after() returning(Customer customer) : trackAccessCustomer() {
		//Process result
		LogUtil.logInfo("Customer " + customer.getFullName() + " has been accessed at " + new Date());
	}
}
