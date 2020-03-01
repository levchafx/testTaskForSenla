package by.levchenko.testTaskForSenla;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import by.levchenko.testTaskForSenla.task5.Solution;

public class Task5Test {
	private List<int[]> input = new ArrayList<>();

	@Test
	public void convertStringToIntArrayTest() {
		String input1 = "1 2 3 4 5";
		String input2 = "1,2,3,4,5";
		int[] expectedOutput = { 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(expectedOutput, Solution.convertStringToIntArray(input1));
		Assert.assertArrayEquals(expectedOutput, Solution.convertStringToIntArray(input2));
	}

	@Test
	public void getMaxNumberTest() {
		input.add(new int[] { 1, 2, 3, 4, 5 });
		input.add(new int[] { 0, 1, 2, 3, 4 });
		int expectedOutput = 5;
		Assert.assertEquals(expectedOutput, Solution.getMaxNumber(input));
	}

	@Test
	public void getSumTest() {
		int expectedOutput = 15;
		Assert.assertEquals(expectedOutput, Solution.getSum(new int[] { 1, 2, 3, 4, 5 }));
	}

}
