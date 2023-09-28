import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sc="";
		int max=-1;
		int m=0;
		int n=s.nextInt();
		int k=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int j=0;j<n;j++) {
			sc="";
		for(int i=j;i<n;i++) {
	      sc=sc+a[i];
	      if(Integer.parseInt(sc)%90==0) {
	    	  m=Integer.parseInt(sc);
	    	  if(m>max) {
	    		  max=m;
	    	  }
	      }
		}
		
	}System.out.println(max);
		}

}
