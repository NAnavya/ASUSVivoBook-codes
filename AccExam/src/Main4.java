import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[] =new int[4];
		for(int i=0;i<4;i++) {
			a[i]=s.nextInt();
		}
		int rc=a[0]-a[1];
		int sum=a[3];
		while(rc!=0) {
			if(rc>=a[1]) {
		if(a[1]*a[2]>=a[3]) {
			sum=sum+a[3];
			rc=rc-a[1];
		}
			}
		else {
			sum=sum+rc*a[2];
			rc=rc-rc;
	}
		}
		System.out.println(sum);
	}

}
