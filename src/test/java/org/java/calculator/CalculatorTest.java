package org.java.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class CalculatorTest {
	Random rnd = new Random();
	
	@RepeatedTest(10)
	@DisplayName("Add Testing...")
	public void addTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 + num2;
		
		final float finalRes = Calculator.add(num1, num2);
		assertEquals(attRes, finalRes);
	}
	
	@RepeatedTest(10)
	@DisplayName("Subtract Testing...")
	public void subtractTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 - num2;
		
		final float finalRes = Calculator.subtract(num1, num2);
		assertEquals(attRes, finalRes);
	}
	
	@RepeatedTest(10)
	@DisplayName("Divide Testing...")
	public void divideTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 / num2;
		
		final float finalRes = Calculator.divide(num1, num2);
		assertEquals(attRes, finalRes);
	}
	
	@RepeatedTest(10)
	@DisplayName("Multiply Testing...")
	public void multiplyTest() {
		final float num1 = rnd.nextFloat();
		final float num2 = rnd.nextFloat();
		final float attRes = num1 * num2;
		
		final float finalRes = Calculator.multiply(num1, num2);
		assertEquals(attRes, finalRes);
	}
}
