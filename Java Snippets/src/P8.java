
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
			for(int i=0;i<5;i++) {
		   inner:
				for(int j=0;j<5;j++) {
					System.out.println("Hello" +i+j);
					continue outer;
				}
				System.out.println("Outer");
			}
		System.out.println("Good-Bye");

	}

}
