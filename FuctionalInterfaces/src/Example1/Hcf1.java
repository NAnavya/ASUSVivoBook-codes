package Example1;

public class Hcf1 {
 public static int fun(int a,int b) {
	 if(a/b==0) {
		 return a;
	 }
	 else {
		 return fun(a%b,a);
	 }
 }
   public static void main(String[] args) {
	   int a=675,b=835;
	   System.out.println(fun(b,a));
	   
   }
}
