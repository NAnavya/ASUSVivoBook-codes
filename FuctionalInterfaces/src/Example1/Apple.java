package Example1;
import java.util.*;

public class Apple {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b[] =new int[a];
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		int k=0;
		int t=0;
		for(int i=0;i<a;i++) {
			if(b[i]==100) {
				k++;
			}
			else
				t++;
		}
		if(t==(k/2)) {
			System.out.println("yes");
			
		}
		else
			System.out.println("No");
	}

}
