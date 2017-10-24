/*Junitexample*/
package basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitExampleTest {

	@Test
	public void testsomething() {
		assertEquals("B","B");
		assertEquals(10,Math.abs(-10));
		assertEquals("ABCD","abcd".toUpperCase());
		assertEquals(true,"ABCD".equalsIgnoreCase("abcd"));
		assertTrue("ABCD".equalsIgnoreCase("abcd"));
		assertFalse("ABCD1".equalsIgnoreCase("abcd"));
	}

}
