
class MyThread1 extends Thread {
   //   void add();

    	  public void run() {
    		  System.out.println("Before start method");
    		  this.stop();
    		  System.out.println("After stop method");
    	  }
}
class A1{
	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		t.start();
	}
}
