 // public class Alien doesnot accept public because in its own class only we have to create seperate class for that and import that package
 class Alien{
	String invade(short ships) {
		return "a few" ;
	}
}

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Alien().invade((short)7));
		

	}

}
