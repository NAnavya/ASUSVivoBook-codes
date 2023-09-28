package code1;

import java.util.Scanner;

public class Main2{
	public static String[] getPlayerNames(int noOfPlayres,String playerNames[]) {
		String[] a=playerNames;
	
		int k=0;
		int n=noOfPlayres;
		String[] b=new String[n];
		for(int i=0;i<n;i++) {
			
			if((a[i].charAt(0)=='M')|| (a[i].charAt(a[i].length()-1)=='a')) {
				b[k++]=a[i];
				System.out.println(a[i]);
				System.out.println(k);
			}
			
		}
		String c[]=new String[k];
		for(int i=0;i<k;i++) {
			c[i]=b[i];
		}
		return c;
	}
}




