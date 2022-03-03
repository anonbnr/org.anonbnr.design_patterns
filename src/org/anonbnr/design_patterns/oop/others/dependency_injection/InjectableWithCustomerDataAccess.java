package org.anonbnr.design_patterns.oop.others.dependency_injection;

public interface InjectableWithCustomerDataAccess {
	void inject(ICustomerDataAccess dataAccess);
}
