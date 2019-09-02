package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		String items[] = new String[count];
		int custCount[] = new int[count];
		int bought[] = new int[count];
		
		for (int i = 0; i < count; i++) {
			items[i] = scan.next();
			double itemPrice = scan.nextDouble();
		}
		
		int customerCount = scan.nextInt();
		for (int j = 0; j < customerCount; j++) {
			String first = scan.next();
			String last = scan.next();
			int itemsBought = scan.nextInt();
			boolean check[] = new boolean[count];
			for (int k = 0; k < itemsBought; k++) {
				int quantity = scan.nextInt();
				String name = scan.next();
				int r = 0;
				
				for (int x = 0; x < items.length; x++) {
					if (name.equals(items[x])) {
						r = x;
					}
				}
				check[r] = true;
				bought[r] += quantity;
			}
			for (int c = 0; c < count; c++) {
				if (check[c] == true) {
					custCount[c] += 1;
				}
			}
		}
			for (int d = 0; d < count; d++) {
				if (bought[d] > 0) {
					System.out.println(custCount[d] + " customers bought " + bought[d] + " " + items[d]);
				} else {
					System.out.println("No customers bought " + items[d]);
				}
			}
		
	}
}
