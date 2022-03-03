package org.anonbnr.design_patterns.oop.others.dependency_injection;

public class Main {

	public static void main(String[] args) {
		ICustomerDataAccess dataAccess = new CustomerDataAccess();
		CustomerService service = CustomerService
				.serveWithConstructorInjection(dataAccess);
		System.out.println(service.getCustomerName(1));
		System.out.println();
		// Constructor Dependency Injection: 
		// Name of customer with ID 1
		
		service = CustomerService
				.serveWithSetterInjection(dataAccess);
		System.out.println(service.getCustomerName(1));
		System.out.println();
		// Setter Dependency Injection: 
		// Name of customer with ID 1
		
		service = CustomerService
				.serveWithInterfaceInjection(dataAccess);
		System.out.println(service.getCustomerName(1));
		// Interface Dependency Injection: 
		// Name of customer with ID 1
	}
}