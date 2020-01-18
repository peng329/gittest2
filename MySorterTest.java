
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySorterTest {
	//在gitHub新增註解
	// test set with negative number
	private double tc7[][] = { { 1, 2, -99 }, { 1, 2, -99 } };

	private MySorter sorter;
	private MySorter two;

	@Before
	public void setUp() throws Exception {
		sorter = new MySorter();
	}

	@After
	public void tearDown() throws Exception {
		sorter = null;
	}

	private void assertDoubleArrayEquals(double[] expected, double[] actual) {
		assertEquals(expected.length, actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], actual[i], 0.0001);
		}
	}

	@Test
	public void testSort7() {
		double expected[] = tc7[1];
		double input[] = tc7[0];
		System.out.println("Test Case 7: test set with negative number");
		input = sorter.sort(input);
		assertDoubleArrayEquals(expected, input);
	}

}
