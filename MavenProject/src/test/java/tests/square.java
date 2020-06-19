package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class square {

	@Test
	public void test() {
		
		ExtendCode test = new ExtendCode();
		int output= test.square(5);
		
		assertEquals(25,output);
	}

}
