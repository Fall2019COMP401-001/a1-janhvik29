package a1;

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
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		int customerCount = scan.nextInt();
		String customerNames[] = new String[customerCount];
		double allTotals[] = new double[customerCount];
		
		
		// Goes through each customer
		
		for (int i = 0; i < customerCount; i++) {
			String first = scan.next();
			String last = scan.next();
			customerNames[i] = first + " " + last;
			int itemsBought = scan.nextInt();
			double customerTotal = 0;
			
			for (int j = 0; j < itemsBought; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				// Goes through items and prices arrays
				
				for (int k = 0; k < count; k++) {
					if (items[k] == name) {
						double oneItemPrice = prices[k];
						oneItemPrice += oneItemPrice * quantity;
						customerTotal += oneItemPrice;
					
					}
				}
			}
			allTotals[i] = customerTotal;	
		}
		
		int max = 0;
		int min = 0;
		double maxTotal = allTotals[0];
		double minTotal = allTotals[0];
		double total = allTotals[0];
		
		for (int i = 1; i < customerCount; i++) {
			
			if (allTotals[i] > maxTotal) {
				maxTotal = allTotals[i];
				max = i;
			}
			
			if (allTotals[i] < minTotal) {
				minTotal = allTotals[i];
				min = i;
			}
			total += allTotals[i];
		}
		
		double average = total / customerCount;
		
		System.out.println("Biggest: " + customerNames[max] + "(" + maxTotal + ")");
		System.out.println("Smallest: " + customerNames[min] + "(" + minTotal + ")");
		System.out.println("Average: " + average);
		scan.close();
		
}
}


		
