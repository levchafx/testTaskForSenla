package by.levchenko.testTaskForSenla.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public static int[] convertStringToIntArray(String s) {
		List<Integer> integers = new ArrayList<>();

		if (s.contains(",")) {
			for (String string : s.split(",")) {
				integers.add(Integer.parseInt(string));
			}
		} else {
			for (String string : s.split(" ")) {
				integers.add(Integer.parseInt(string));
			}
		}
		Collections.sort(integers);
		int[] result = new int[integers.size()];
		int position = 0;
		for (int i : integers) {
			result[position] = i;
			position++;
		}

		return result;
	}

	public static int[][] fillMatrix(List<int[]> inputNumbers) {
		int[][] matrix = new int[inputNumbers.size()][inputNumbers.size()];

		for (int i = 0; i < inputNumbers.size(); i++) {
			matrix[i] = sortLines(inputNumbers).get(i);
		}
		return matrix;
	}

	public static int getMaxNumber(List<int[]> inputNumbers) {
		int max = 0;
		for (int[] i : inputNumbers) {
			for (int j = 0; j < i.length; j++) {
				if (i[j] > max) {
					max = i[j];
				}
			}
		}
		return max;
	}

	public static int getSum(int[] numbersToSum) {
		int sum = 0;
		for (int i = 0; i < numbersToSum.length; i++) {
			sum += numbersToSum[i];
		}
		return sum;
	}

	public static List<int[]> sortLines(List<int[]> inputNumbers) {
		Map<Integer, int[]> sortedMap = new TreeMap<>(Collections.reverseOrder());
		List<int[]> sortedInputNumbers = new ArrayList<>();
		for (int[] i : inputNumbers) {
			sortedMap.put(getSum(i), i);
		}
		sortedInputNumbers.addAll(sortedMap.values());
		return sortedInputNumbers;
	}

	public static void printMatrix(List<int[]> inputNumbers) {
		int[][] matrix = fillMatrix(inputNumbers);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
