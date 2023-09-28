package Program5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String name = sc.nextLine();
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		Venue v1 = new Venue(name, city);
		System.out.println(v1.toString());
		boolean b = true;
		while (b) {
			System.out.println("Verify and Update Venue Details");
			System.out.println("Menu\n" + "1.UpdateVenue name\n" + "2.Update CityName\n" + "3.All info correct/exit");
			System.out.println("Type  1 or 2 or 3");
			int n = sc.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Enter Venue Name");
				sc.nextLine();
				String a = sc.nextLine();
				v1.setName(a);
				System.out.println(v1.toString());
				break;

			}
			case 2: {
				System.out.println("Enter City Name");
				sc.nextLine();
				String a = sc.nextLine();
				v1.setCity(a);
				System.out.println(v1.toString());
				break;

			}
			case 3: {
				System.out.println(v1.toString());
				b = false;
				break;

			}

			}
		}

	}
}
