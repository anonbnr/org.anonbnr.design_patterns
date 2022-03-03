package org.anonbnr.design_patterns.oop.others.dependency_injection;

public class InterfaceInjectableCustomerBusinessLogic extends 
	CustomerBusinessLogic implements InjectableWithCustomerDataAccess{

	@Override
	public void inject(ICustomerDataAccess dataAccess) {
		System.out.println("Interface Dependency Injection: ");
		this.dataAccess = dataAccess;
	}
}
