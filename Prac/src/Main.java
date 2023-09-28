import java.util.Scanner;

public class Main {
	public static int o;
	public static boolean cal(int a) {
		int sum = 0;
		int rem = 0;
		Boolean b = false;
		while (a != 0) {
			rem = a % 10;
			a = a / 10;
			sum = sum + rem * rem;                 
		}
		System.out.println(sum);
		if(sum == 1) {
			b = true;

		}
		else if(sum!=a){
			b=cal(sum);
		}
		return b;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		o=a;
	//	boolean c = cal(a);
		System.out.println(cal(a));
	}

}
