package com.in28Minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		// fail("Not yet implemented!");
		// assertEquals("ABC", "ABCD"); -Failure
		
		// assertEquals(expected, actual);
		// assertEquals("XYZ", "XYZ"); -Success
		
		StringHelper helper = new StringHelper();
		
		assertEquals("CDE", helper.truncateAInFirst2Positions("AACD"));
	}

}
