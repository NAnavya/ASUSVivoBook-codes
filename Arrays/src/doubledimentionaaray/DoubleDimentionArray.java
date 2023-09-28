package doubledimentionaaray;

import java.util.Scanner;

public class DoubleDimentionArray {
      public static void main(String[] args) {
//    	  int a[][] = {{1,2,3,4,5},{1,2,3,4,5}};
    	  int a1[]= {11,12,13};
    	  int a[][] =new int[2][5];
    	  Scanner s=new Scanner(System.in);
    	 for(int i=0; i<2; i++) {
    		  for(int j=0; j<5; j++) {
    			 a[i][j] = s.nextInt();
    		  }
    	  }
    	  System.out.println("hii");
    	  for(int i=0; i<2; i++) {
    		 for(int j=0; j<5; j++) {
    		  System.out.println(a[i][j]);
    	  }
    	  }
    		  System.out.println("hii1");
    	  for(int a2:a1) {
    		  System.out.println(a2);
    }
    	  System.out.println("hii2");
    	    for(int[] a3:a) {
    	    	for(int a4:a3) {
    	    		System.out.println(a4);
    	    	}
    	    }
      }
      }
      
