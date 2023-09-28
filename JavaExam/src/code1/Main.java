package code1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String pattern = "^[a-zA-Z0-9]+$";
		final String p1 = "^[0-9]+$";
		final String p2 = "^[a-zA-z]+$";
		int k = 0;
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		if (a.length() == 10) {
			if (a.matches(pattern)) {

				String b = a.charAt(2) + "" + a.charAt(3);

				if (b.matches(p1)) {

					String c = a.charAt(0) + "" + a.charAt(a.length() - 1);
					if (c.matches(p2)) {
						k++;
					}
				}
			}

		}
		if (k > 0) {
			System.out.println("Coupon code is valid");
		} else
			System.out.println("Coupon code is invalid");

	}

}
