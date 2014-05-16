import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Example32Test {

	@Test
	public final void testIsPrime() {
		
		assertTrue(Example32.isPrime(3));
		assertTrue(Example32.isPrime(7));
		assertTrue(Example32.isPrime(37));
		assertFalse(Example32.isPrime(15));
		assertFalse(Example32.isPrime(105));
	}

	@Test
	public final void testGoldbach() {
		
		assertEquals("[(2, 2)]", Example32.goldbach(4).toString());
		assertEquals("[(3, 3)]", Example32.goldbach(6).toString());
		assertEquals("[(3, 5)]", Example32.goldbach(8).toString());
		assertEquals("[(3, 7), (5, 5)]", Example32.goldbach(10).toString());
		assertEquals("[(3, 97), (11, 89), (17, 83), (29, 71), (41, 59), (47, 53)]", Example32.goldbach(100).toString());
	}

}
