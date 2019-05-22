package helloaspectj;

public aspect HelloAspectJ {

	// Định nghĩa ra một pointcut.
	 // call: gọi method sayHello() của class HelloAspectJDemo
	 pointcut callSayHello(): call(* HelloAspectJDemo.sayHello());
	 
	 before() : callSayHello() {
	     System.out.println("Before call sayHello");
	 }
	 
	 after() : callSayHello()  {
	     System.out.println("After call sayHello");
	 }
}
