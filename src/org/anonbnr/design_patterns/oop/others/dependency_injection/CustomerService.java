package org.anonbnr.design_patterns.oop.others.dependency_injection;

public class CustomerService {
	/* ATTRIBUTES */
	private CustomerBusinessLogic businessLogic;
	
	/* CONSTRUCTORS */
	public CustomerService() {
		
	}
	
	/* METHODS */
	// Dependency Injection by constructor
	public static CustomerService serveWithConstructorInjection(
			ICustomerDataAccess dataAccess) {
		CustomerService service = new CustomerService();
		service.businessLogic = new CustomerBusinessLogic(dataAccess);
		
		return service;
	}
	
	// Dependency Injection by setter
	public static CustomerService serveWithSetterInjection(
			ICustomerDataAccess dataAccess) {
		CustomerService service = new CustomerService();
		service.businessLogic = new CustomerBusinessLogic();
		service.businessLogic.setCustomerDataAccess(dataAccess);
		
		return service;
	}
	
	// Dependency Injection by injectable interface
	public static CustomerService serveWithInterfaceInjection(
			ICustomerDataAccess dataAccess) {
		CustomerService service = new CustomerService();
		service.businessLogic = new InterfaceInjectableCustomerBusinessLogic();
		((InterfaceInjectableCustomerBusinessLogic) service.businessLogic)
			.inject(dataAccess);
		
		return service;
	}
	
	public String getCustomerName(int id) {
		return businessLogic.getCustomerName(id);
	}
}