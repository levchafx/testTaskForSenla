package by.levchenko.testTaskForSenla;

import org.junit.Assert;
import org.junit.Test;

import by.levchenko.testTaskForSenla.Task3.Task3;

public class Task3Test {

	@Test
	public void test() {
		int expectedOutput = 3;
		String inputText = "Java is running on JAVA virtual machine which comes with java runtime environment";
		String searchWord = "jAvA";
		Assert.assertEquals(expectedOutput, Task3.countWords(inputText, searchWord));
	}

}
