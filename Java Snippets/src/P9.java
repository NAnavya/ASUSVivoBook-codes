
public class P9 {

	P9(){
		
	}
	P9(P9 p){
		p1=p;   //p1=p2;
	}
	P9 p1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P9 p2=new P9();
		P9 p3=new P9(p2);
		p3.go();
		P9 p4=p3.p1;  //p3.p2  ==> p4=p2;
		//System.out.println(p4);
		p4.go();
		P9 p5=p2.p1; 
		//System.out.println(p5);
		p5.go();

	}
	void go() {
		System.out.println("hi");  //15,17
		
	}

}
