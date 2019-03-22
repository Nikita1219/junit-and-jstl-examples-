package com.niit.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationExample {
	
	private ArrayList<String> list;
	
	@BeforeClass
	
	public static void m1()
	{
		System.out.println("Using @BeforeClass annotation , exceuted before all test case");
	}
	
	@Before
	public void m2() 
	{
		list = new ArrayList<String>();
		System.out.println("Using @Before annotation , exceuted before each test case");
	}
	
	@AfterClass
	public static void m3()
	{
		System.out.println("Using @AfterClass annotation , exceuted before all test case");
	}
	
	@After
	public void m4() 
	{
		list.clear();
		System.out.println("Using @After annotation , exceuted before each test case");
	}
	
	@Test
	public void m5()
	{
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
	}
	
	@Ignore
	public void m6()
	{
		System.out.println("using @Ignore , thos exceution is ignored");
	}
	
	@Test(timeout=10)
	public void m7()
	{
		System.out.println("using @Test(timeout), it can be used to enforced timeout in Junit 4 test case");
	}
	
	@Test
	public void m8() 
	{
		System.out.println("Using @Test(expected), it will check for " + "specifed exception during its exceution");
	}
	

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
