package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void mySimpleEqualsTest() 
	{
		String expectedName = "Nikita";
		assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myObjectEqualsTest() 
	{
		Employee expectedEmpObj = new Employee(1, "Nikita", 15000);
		assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}
