package by.levchenko.testTaskForSenla.Task4;

import java.util.ArrayList;
import java.util.List;

//this is a common solution of knapsack problem using methods of dynamic programming
//source used for solving https://ru.wikipedia.org/wiki/Задача_о_рюкзаке
public class BackPack {
	private int numberOfItems;
	private int capacity;
	private int[][] backPackTable;
	private int totalValue;
	private int[] weights;
	private int[] values;
	private List<Item> itemsToTake;

	public BackPack(int numberOfItems, int capacity, int[] weights, int[] values) {
		super();
		this.numberOfItems = numberOfItems;
		this.capacity = capacity;
		this.weights = weights;
		this.values = values;
		this.backPackTable = new int[numberOfItems + 1][capacity + 1];
		this.itemsToTake = new ArrayList<>();
	}

	public int solve() {
		for (int i = 1; i < numberOfItems + 1; i++) {
			for (int j = 1; j < capacity + 1; j++) {
				int itemNotToTake = backPackTable[i - 1][j];
				int itemToTake = 0;
				if (weights[i] <= j) {
					itemToTake = values[i] + backPackTable[i - 1][j - weights[i]];
				}
				backPackTable[i][j] = Math.max(itemNotToTake, itemToTake);
			}
		}
		return totalValue = backPackTable[numberOfItems][capacity];
	}

	public void showResult() {
		int totalWeight = 0;
		for (int n = numberOfItems, w = capacity; n > 0; n--) {
			if (backPackTable[n][w] != 0 && backPackTable[n][w] != backPackTable[n - 1][w]) {
				itemsToTake.add(new Item(weights[n], values[n]));
				totalWeight += weights[n];
				w -= weights[n];
			}
		}
		System.out.println("Capacity = " + capacity);
		System.out.println("Total weight = " + totalWeight);
		System.out.println("Total value = " + totalValue);
		System.out.println("We take items: " + itemsToTake);
	}
}
