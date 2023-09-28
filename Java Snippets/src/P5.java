
public class P5 {
 public static void main(String[] args) {
	 boolean b1=true;
	 boolean b2=false;
	 boolean b3=true;
	 if((b1&b2)|(b2&b3)&b3) {
		 System.out.println("alpha");
	 }
	 if((b1=false)|(b1&b3)|(b1|b2)) {
		 System.out.println("beta");
	 }
 }
}
