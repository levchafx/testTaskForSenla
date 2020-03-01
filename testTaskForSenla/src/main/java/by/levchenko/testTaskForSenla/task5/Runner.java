package by.levchenko.testTaskForSenla.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		List<int[]> inputNumbers = new ArrayList<>();
		int matrixSize = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter matrix size");
		if (sc.hasNext()) {
			matrixSize = sc.nextInt();
			sc.nextLine();
			int counter = matrixSize;
			while (counter > 0) {

				System.out.println("please enter next row of numbers containing " + matrixSize
						+ " numbers separated by either backspace or comma ");

				String s = sc.nextLine();
				inputNumbers.add(Solution.convertStringToIntArray(s));
				counter--;

			}
			Solution.printMatrix(inputNumbers);
			System.out.println("Max number is " + Solution.getMaxNumber(inputNumbers));

		}

		sc.close();
	}
}
