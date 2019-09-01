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
		
		for (int i = 0; i < count; i++) {
			String item = scan.next();
			items[i] = item;
			double price = scan.nextDouble();
			prices[i] = price;
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
				t = 0;
				for (int k = 0; k < items.length; k++) {
					x = 0;
					if (items[k] == name) {
						x += prices[k] * quantity;
					}
					t += x;
				}
				total += t;
			}
			if (total > big) {
				big = total;
				max = first + " " + last;
			} else if (total < small) {
				small = total;
				min = first + " " + last;
			}
		}
		
		System.out.println("Biggest: " + max + "(" + big + ")");
		System.out.println("Smallest: " + min + "(" + small + ")");
		System.out.println("Average: " + t/customers);
		scan.close();
	}
}
