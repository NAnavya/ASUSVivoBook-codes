package Example1;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int k = 0;
		if (a < b) {
			for (int i = 2; i <= a; i++) {
				if (((a % i) == 0) && ((b % i) == 0)) {
					k = i;

				}
			}

		} else {
			for (int i = 2; i <=b; i++) {
				if (((a % i) == 0) && ((b % i) == 0)) {
					k = i;

				}
			}
		}
		System.out.println(k);

	}
}
