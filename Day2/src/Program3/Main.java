package Program3;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the over");
	   Long over = sc.nextLong();
	   System.out.println("Enter the ball");
	   Long ball = sc.nextLong();
	   System.out.println("Enter the runs");
	   Long runs = sc.nextLong();
	   sc.nextLine();
	   System.out.println("Enter the batsman");
	   String batsman = sc.nextLine();
	   System.out.println("Enter the bowler");
	   String bowler = sc.nextLine();
	   System.out.println("Enter the nonStriker");
	   String nonStriker = sc.nextLine();
	   Delivery D1 = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
	   D1.displayDeliveryDetails();
	 }
}
