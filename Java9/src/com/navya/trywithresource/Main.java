package com.navya.trywithresource;

public class Main {
	public static void main(String[]args) {
		MyResource r1=new MyResource();
		MyResource r2=new MyResource();
		MyResource r3=new MyResource();
		
			try(r1;r2;r3) {
				r1.doProcess();
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			r1.doProcess();
		
	}

}
