package org.anonbnr.design_patterns.oop.others.dependency_injection;

public class CustomerBusinessLogic {
	/* ATTRIBUTES */
	protected ICustomerDataAccess dataAccess;
	
	/* CONSTRUCTORS */
	public CustomerBusinessLogic() {
		dataAccess = new CustomerDataAccess();
	}
	
	// Interface for Dependency Injection by Constructor
	public CustomerBusinessLogic(ICustomerDataAccess dataAccess) {
		System.out.println("Constructor Dependency Injection: ");
		this.dataAccess = dataAccess;
	}
	
	/* METHODS */
	public String getCustomerName(int id) {
		return dataAccess.getCustomerName(id);
	}
	
	// Interface for Dependency Injection by Setter Method
	public void setCustomerDataAccess(ICustomerDataAccess dataAccess) {
		System.out.println("Setter Dependency Injection: ");
		this.dataAccess = dataAccess;
	}
}
