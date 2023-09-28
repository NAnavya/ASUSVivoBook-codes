 interface A{
	 default void write() {
		 System.out.println("A");
		 
	 }
 }
 interface B{
	 default void write() {
		 System.out.println("B");
	 }
 }
public class InterfaceTopic implements A,B {
	public static void main(String[] args) {
		InterfaceTopic i=new InterfaceTopic();
		i.write();
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		A.super.write();
	}

}
