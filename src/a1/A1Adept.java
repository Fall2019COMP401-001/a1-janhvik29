package a1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int count = scan.nextInt();
		String items[] = (String[])Array.newInstance(String.class, count);
		double prices[] = (double[])Array.newInstance(double.class, count);
		
		// Create arrays with all items and their prices
		for (int i = 0; i < count; i++) {
			String item = scan.next();
			items[i] = item;
			double price = scan.nextDouble();
			prices[i] = price;
		}
		
		int customers = scan.nextInt();
		double total = 0;
		double x = 0;
		
		double t = 0;
		String max = "";
		String min = "";
		double allTotals[] = (double[])Array.newInstance(double.class, customers);
		
		// Goes through each customer
		
		for (int i = 0; i < customers; i++) {
			String first = scan.next();
			String last = scan.next();
			int c = scan.nextInt(); // Count for how many items bought
			total = 0;
			// Goes through each item the customer bought
			for (int j = 0; j < c; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				t = 0;
				// Goes through items and prices arrays
				for (int k = 0; k < items.length; k++) {
					if (items[k] == name) {
						x += prices[k] * quantity;
					}
				}
				total += x; // Total price of all items bought
			}
			allTotals[i] = total;
		}
		
		double big = allTotals[0];
		double small = allTotals[0];
		
		for (int i = 1; i < allTotals.length; i++) {
			if (allTotals[i] < small) {
				small = allTotals[i];
			}
			
		for (int j = 1; j < allTotals.length; j++) {
			if (allTotals[i] > big) {
				big = allTotals[i];
			}
		
		for (int k = 0; k < allTotals.length; k++) {
			t += allTotals[k];
		}
		
		System.out.println("Biggest: " + max + "(" + big + ")");
		System.out.println("Smallest: " + min + "(" + small + ")");
		System.out.println("Average: " + t/customers);
		scan.close();
		}
		
		}
	}
}

		
