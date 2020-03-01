package by.levchenko.testTaskForSenla;

import org.junit.Assert;
import org.junit.Test;

import by.levchenko.testTaskForSenla.Task2.Task2;

public class Task2Test {

	@Test
	public void testGcd() {
		int i = 48;
		int j = 0;
		int expectedOutput = i;
		Assert.assertEquals(expectedOutput, Task2.gcdRecursive(i, j));
		Assert.assertEquals(expectedOutput, Task2.gcd(i, j));
	}

}
