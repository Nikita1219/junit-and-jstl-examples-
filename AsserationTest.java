package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsserationTest {
@Test
	public void testAssert()
	{
		//Variable declaration
		String string1="Junit";
		String string2="Juni";
		String string3="test";
		String string4="test";
		String string5=null;
		int variable1=1;
		int variable2=2;
		int[] airthematicArray1 = {1,2,3};
		int[] airthematicArray2 = {1,2,3};
		
		//Assert statements
		assertEquals(string1,string2);
		assertSame(string3,string4);
		assertNotSame(string1,string3);
		assertNotNull(string1);
		assertNull(string5);
		assertTrue(variable1<variable2);
		assertArrayEquals(airthematicArray1,airthematicArray2);		
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}
