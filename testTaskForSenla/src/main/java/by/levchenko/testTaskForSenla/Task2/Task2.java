package by.levchenko.testTaskForSenla.Task2;

import java.util.Scanner;

public class Task2 {
	// greatest common divisor
	public static int gcdRecursive(int i, int j) {
		return j == 0 ? i : gcdRecursive(j, i % j);

	}

	public static int gcd(int i, int j) {
		int k;
		while (j != 0) {
			k = j;
			j = i % j;
			i = k;
		}
		return i;
	}

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter 2 numbers:");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			j = sc.nextInt();
			System.out.println(
					"Greatest common divisor for " + i + ", " + j + " is " + gcdRecursive(Math.abs(i), Math.abs(j)));
			System.out.println("Greatest common divisor for " + i + ", " + j + " is " + gcd(Math.abs(i), Math.abs(j)));
		} else {
			System.out.println("please enter correct numbers");
		}
		sc.close();
	}
}
