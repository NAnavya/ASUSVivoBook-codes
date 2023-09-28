import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		int max=0;
		int m=0;
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();			
		}
		for(int i=0;i<n;i++) {
			s="";
			for(int j=i;j<n;j++) {
				s=s+a[j];
				if(Integer.parseInt(s)%90==0) {
					max=Integer.parseInt(s);
				}
			}
			System.out.println(max);
			if(m<max) {
				m=max;
			}
		}
		System.out.println(m);
		

	}

}
