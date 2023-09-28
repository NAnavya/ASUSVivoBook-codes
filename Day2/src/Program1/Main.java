package Program1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String venue= sc.nextLine();
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		Venue v1 = new Venue(venue,city);
		System.out.println(v1.toString());
		

	}

}
