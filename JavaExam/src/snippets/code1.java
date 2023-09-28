package snippets;

class code {
  private static  int count=0;
  public static int getcount(){
	  return count;
  }
  public code() {
	  count++;
  }
}
public class code1{
	public static void main(String[] args) {
		code c1=new code();
		System.out.println(c1.getcount());
		code c2=new code();
		System.out.println(c2.getcount());
	}
	
}
