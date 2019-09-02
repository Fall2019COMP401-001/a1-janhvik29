package a1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int count = scan.nextInt();
		String items[] = new String[count];
		double prices[] = new double[count];
		
		// Create arrays with all items and their prices
		for (int i = 0; i < count; i++) {
			String item = scan.next();
			items[i] = item;
			double price = scan.nextDouble();
			prices[i] = price;
		}
		
		int customerCount = scan.nextInt();
		
		double customerTotal;
		double oneItemPrice = 0;
		double all = 0;
		String maxName = "";
		String minName = "";
		double allTotals[] = new double[customerCount];
		String customerNames[] = new String[customerCount];
		
		// Goes through each customer
		
		for (int i = 0; i < customerCount; i++) {
			String first = scan.next();
			String last = scan.next();
			int itemCount = scan.nextInt(); // Count for how many items bought
			customerTotal = 0;
			// Goes through each item the customer bought
			for (int j = 0; j < itemCount; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				// Goes through items and prices arrays
				for (int k = 0; k < items.length; k++) {
					oneItemPrice = 0;
					if (items[k] == name) {
						oneItemPrice += prices[k] * quantity;
					}
				}
				customerTotal += oneItemPrice; // Total price of all items bought
			}
			customerNames[i] = first + " " + last;
			allTotals[i] = customerTotal;
		}
		
		double maxTotal = allTotals[0];
		double minTotal = allTotals[0];
		
		for (int i = 0; i < allTotals.length; i++) {
			if (allTotals[i] < minTotal) {
				minTotal = allTotals[i];
				minName = customerNames[i];
			}
		}
			
		for (int j = 0; j < allTotals.length; j++) {
			if (allTotals[j] > maxTotal) {
				maxTotal = allTotals[j];
				maxName = customerNames[j];
			}
		}
		
		for (int k = 0; k < allTotals.length; k++) {
			all += allTotals[k];
		}
		
		System.out.println("Biggest: " + maxName + "(" + maxTotal + ")");
		System.out.println("Smallest: " + minName + "(" + minTotal + ")");
		System.out.println("Average: " + all/customerCount);
		scan.close();
		
}
}


		
