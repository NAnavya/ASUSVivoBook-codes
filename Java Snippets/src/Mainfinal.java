import java.util.Scanner;

public class Mainfinal {
	static final long tooth=343l;
	static long dolt(long tooth) {
		System.out.println(++tooth+"hii ");
		return ++tooth;
	}
	
	public static void main(String[] args) {
	  System.out.println(tooth+" ");
	  final long tooth =340l;
	  new Mainfinal().dolt(tooth);
	  System.out.println(tooth);
	}
}
