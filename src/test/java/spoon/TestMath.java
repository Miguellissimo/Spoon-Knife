package spoon;

import static org.junit.Assert.*;
import math.IMath;

import org.junit.Test;

public class TestMath {

	@Test
	public void test_add() {
		IMath math = new math.Math();
		assertEquals(5, math.add(2, 3));
		assertEquals(0, math.add(0, 0));
		assertEquals(0, math.add(-1, 1));
	}
	
	@Test
	public void test_sub() {
		IMath math = new math.Math();
		assertEquals(6, math.sub(6, 0));
		assertEquals(6, math.sub(9, 3));
		assertEquals(0, math.sub(-1, -1));
	}
	
	@Test
	public void test_mul() {
		IMath math = new math.Math();
		assertEquals(6, math.mul(6, 1));
		assertEquals(8, math.mul(4, 2));
		assertEquals(0, math.mul(5, 0));
	}
	
	@Test
	public void test_div() {
		IMath math = new math.Math();
		assertEquals(3, math.div(9, 3));
		assertEquals(5, math.div(15, 3));
		assertEquals(6, math.div(36, 6));
	}

}
