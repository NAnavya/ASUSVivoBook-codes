
public class MainfinalPrac {
	// The Global variables are no need to initialize but localvariable are must
	static final int a=12;
	public void hello(int a) {
	System.out.println(++a);
	System.out.println(++a);
	}
	
	public static void main(String[] args) {
		final int a=11;
		
        new MainfinalPrac().hello(a);
		
		
	}

}
