package org.anonbnr.design_patterns.oop.others.dependency_injection;

public class CustomerDataAccess implements ICustomerDataAccess {
	
	/* CONSTRUCTOR */
	public CustomerDataAccess() {
		
	}

	/* METHODS */
	@Override
	public String getCustomerName(int id) {
		return String.format("Name of customer with ID %d", id);
	}
}
