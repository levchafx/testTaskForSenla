package by.levchenko.testTaskForSenla;

import org.junit.Assert;
import org.junit.Test;

import by.levchenko.testTaskForSenla.Task1.Task1;

public class Task1Test {

	@Test
	public void isEven() {
		int testEven = 100;
		int testOdd = 101;
		String testStringEven = "even";
		String testStringOdd = "odd";
		Assert.assertEquals(testStringEven, Task1.isEvenOrOdd(testEven));
		Assert.assertEquals(testStringOdd, Task1.isEvenOrOdd(testOdd));
	}

	@Test
	public void isComposite() {
		int testPrime = 29;
		int testComposite = 30;
		String testStringPrime = "prime";
		String testStringComposite = "composite";
		Assert.assertEquals(testStringPrime, Task1.isPrimeOrComposite(testPrime));
		Assert.assertEquals(testStringComposite, Task1.isPrimeOrComposite(testComposite));
	}
}
