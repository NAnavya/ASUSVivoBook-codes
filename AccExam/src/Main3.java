import java.util.Scanner;

public class Main3 {
	public static  void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=0;
     for(int i=1;i<n/2;i++) {
    	 if(i*i==n || i*i<n) {
    		 k=i;
    	 }
    	 else if(i*i>n) {
    		 break;
    	 }
     }
     System.out.println(k);
     
     
}

}