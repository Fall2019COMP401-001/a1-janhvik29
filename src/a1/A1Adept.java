package a1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int count = scan.nextInt();
		String items[] = new String[0];
		double prices[] = new double[0];
		
		for (int i = 0; i < count; i++) {
			String item = scan.next();
			items[items.length] = item;
			double price = scan.nextDouble();
			prices[prices.length] = price;
		}
		
		int customers = scan.nextInt();
		double total = 0;
		double x = 0;
		double big = 0;
		double small = 0;
		double t = 0;
		String max = "";
		String min = "";
		
		for (int i = 0; i < customers; i++) {
			String first = scan.next();
			String last = scan.next();
			int c = scan.nextInt();
			
			for (int j = 0; j < c; j++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				for (int k = 0; k < items.length; k++) {
					if (items[k] == name) {
						x += prices[k] * quantity;
					}
				}
				total += x;
			}
			t += total;
			if (total >= big) {
				big = total;
				max = first + last;
			}
			if (total <= small) {
				small = total;
				min = first + last;
			}
		}
		
		System.out.println("Biggest: " + String.format("%.2f", max) + "(" + big + ")");
		System.out.println("Smallest: " + String.format("%.2f", min) + "(" + small + ")");
		System.out.println("Average: " + String.format("%.2f", t/customers));
		scan.close();
	}
}
