package by.levchenko.testTaskForSenla.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int numberOfItems = 0;
		int capacity = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter backpack's capacity ");
		if (sc.hasNextInt()) {
			capacity = sc.nextInt();
		}
		System.out.println("please enter number of items to choose from");
		if (sc.hasNextInt()) {
			numberOfItems = sc.nextInt();
		}
		int[] weights = new int[numberOfItems + 1];
		int[] values = new int[weights.length];
		int counter = numberOfItems;
		for (int i = counter; i > 0; i--) {
			System.out.println("please enter item's weight and value separated by backspace");
			if (sc.hasNextInt()) {
				weights[i] = sc.nextInt();
				values[i] = sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
		List<Item> items = new ArrayList<>();
		for (int i = weights.length - 1; i > 0; i--) {

			items.add(new Item(weights[i], values[i]));

		}
		System.out.println("Initial list of items: " + items);

		BackPack bp = new BackPack(numberOfItems, capacity, weights, values);
		bp.solve();
		bp.showResult();

	}

}
