package com.navya.trywithresource;

public class MyResource implements AutoCloseable {

	MyResource(){
		System.out.println("Resource creation ");
	}
	
	public void doProcess() {
		System.out.println("Resource Processing");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Resource Closing");
		
	}

}
