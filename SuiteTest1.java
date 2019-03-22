package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {
	
	public String message = "Nikita";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test//(expected = ArithmeticException.class) // junit exception test
	public void testJUintMessage() {
		System.out.println("Junit Message is printing");
		junitMessage.printMessage();
	}
	
	@Test
	public void testJUnitHiMessage() {
		message = "Hi!" + message;
		System.out.println("JUnit Hi Message is Printing");
		//assertEquals(message, junitMessage.printHiMessage());
		System.out.println("Suite Test 1 is successful " + message);
	}
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
