package poly.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
	@Test
	public void testSum() {
		Calculator ca = new Calculator();
		Assert.assertEquals(ca.sum(3, 2), 5);
	}
	@Test
	public void testSub() {
		Calculator ca = new Calculator();
		Assert.assertEquals(ca.sub(3, 2), 10);
	}
}
