package snippets;

public class code3 {
	public void finalize() {
     System.out.println("Garbage Collection Demo");
}
	public static void main(String[] args) {
		code3 c1=new code3();
		c1=null;
		System.gc();
		
	}
}
