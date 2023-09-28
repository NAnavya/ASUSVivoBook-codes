import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static String searchB(int a[],int n,int f) {
		int first=0;
		int last=n-1;
		int mid=n/2;
		String c=null;
		while(first<=last) {
			mid=(first+last)/2;
		if(a[mid]==f) {
			c= "found";
		break;
		}
		else if(f<a[mid])
			last=mid-1;
		else if(f>a[mid])
			first=mid+1;
		}
		if(first>last)
		c= "NotFOund";	
		return c;
	}
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter arraysize");
    	int n=s.nextInt();
    	int a[]=new int[n];
    	System.out.println("Enter array values");
    	for(int i=0;i<n;i++) {
    		a[i]=s.nextInt();
    	}
    	System.out.println("Enter search element");
    	int se=s.nextInt();
    	Arrays.sort(a);
    	String a1=searchB(a,n,se);
    	System.out.println(a1);
    	
    }

}
