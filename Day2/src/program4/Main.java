package program4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the player details");
	  String p1 = sc.nextLine();
	  String[] playerDetails=p1.split(",",4);
	  Player p = new Player(playerDetails[0],playerDetails[1],playerDetails[2]);
	  p.split();
	  
  }
}