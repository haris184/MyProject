package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class square {

	@Test
	public void test() {
		
		ExtendCode test = new ExtendCode();
		int output= test.square(2);
		
		assertEquals(4,output);
	}

}
