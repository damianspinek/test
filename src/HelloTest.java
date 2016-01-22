import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CounterTest {

	@Test
	public void test_that_two_plus_two_is_four() {
		assertEquals(4, Counter.plus(2,2));
	}
	
	@Test
	public void test_that_two_minus_two_is_zero() {
		assertEquals(0, Counter.minus(2,2));
	}
	
	@Test
	public void test_that_two_divide_two_is_one() {
		assertEquals(1, Counter.divide(2,2));
	}
	
	@Test
	public void test_that_two_multiple_two_is_four() {
		assertEquals(4, Counter.divide(2,2));
	}

}
