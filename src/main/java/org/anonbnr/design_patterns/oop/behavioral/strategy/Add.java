package org.anonbnr.design_patterns.oop.behavioral.strategy;

/**
 * an Add class that plays the role of ConcreteStrategy in the Strategy design pattern.
 * it implements the arithmetic operation of binary integer addition.
 * @author anonbnr
 */
public class Add implements ArithmeticOperation {
	
	/**
	 * Returns x + y.
	 */
	
	public int execute(int x, int y) {
		return x + y;
	}
}
