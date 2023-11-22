package ar.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitJavaMavenTest {

	@Test
	public void testHelloWorld() {
		InitJavaMaven initJavaMaven = new InitJavaMaven();
		Integer retVal = initJavaMaven.helloWorld();
		assertNotNull(retVal);
		assertEquals(retVal.intValue(),  0);
	}

}
