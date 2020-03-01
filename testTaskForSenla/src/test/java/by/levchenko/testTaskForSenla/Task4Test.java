package by.levchenko.testTaskForSenla;

import org.junit.Assert;
import org.junit.Test;

import by.levchenko.testTaskForSenla.Task4.BackPack;

public class Task4Test {

	@Test
	public void test() {

		int numberOfItems = 5;
		int capacity = 25;
		int[] weights = { 0, 12, 8, 20, 14, 5 };
		int[] values = { 0, 27, 38, 100, 72, 24 };
		int expectedOutput = 124;
		BackPack bp = new BackPack(numberOfItems, capacity, weights, values);
		Assert.assertEquals(expectedOutput, bp.solve());
	}

}
