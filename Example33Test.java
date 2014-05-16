import static org.junit.Assert.*;

import org.junit.Test;


public class Example33Test {

	@Test
	public final void testMagic_square() {
		
		assertTrue(Example33.magic_square(new int[][]{{4,9,2}, {3,5,7}, {8,1,6}}));
		assertTrue(Example33.magic_square(new int[][]{{7,12,1,14}, {2,13,8,11}, {16,3,10,5}, {9,6,15,4}}));
		assertTrue(Example33.magic_square(new int[][]{{23, 28, 21}, {22, 24, 26}, {27, 20, 25}}));
		assertFalse(Example33.magic_square(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
		assertFalse(Example33.magic_square(new int[][]{{16, 23, 17}, {78, 32, 21}, {17, 16, 15}}));
	}

}
