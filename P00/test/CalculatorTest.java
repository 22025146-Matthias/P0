import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(actual, expected);

	}

	@Test
	public final void testSubstract() {
//	    fail("Not yet implemented");

		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public final void testMultiple() {
		int a = 10;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);

		int expected = 100;
		assertEquals(expected, actual);
	}

	@Test
	public final void testDivide() {
		int a = 10;
		int b = 10;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 1;
		assertEquals(expected, actual);
	}

}
