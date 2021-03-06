package org.anonbnr.design_patterns.oop.behavioral.strategy;

/**
 * a Subtract class that plays the role of ConcreteStrategy in the Strategy design pattern.
 * it implements the arithmetic operation of binary integer subtraction.
 * @author anonbnr
 */
public class Subtract implements ArithmeticOperation {

	/**
	 * Returns x - y.
	 */
	
	public int execute(int x, int y) {
		return x - y;
	}
}
