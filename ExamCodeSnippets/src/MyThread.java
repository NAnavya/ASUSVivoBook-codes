
public class MyThread extends Thread {
	private static int data;
	public synchronized void doThread() {
		int current=data;
		current++;
		data=current;
	}
	public void run() {
		doThread();
	}

}
