package Example1;

public class MathMain {
	public static void main(String[] args) {
		Math m1=new Add();
		int add=m1.calculate(1, 2);
		Math m2=new Sub();
		int sub=m2.calculate(4, 2);
		System.out.println(add+" "+sub);
		Calculate cal=new Calculate();
		System.out.println(cal.perform(m1, 8,6));
		
		
		
		//here no need to create the class to implement that interfaces
		Math m=(i,j)->{
			return i+j;
		};
		Math m12=(i,j)->i-j;
		System.out.println(m.calculate(12,13));
		
		
		
		//Examples 
		
		
		Runnable r=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Run"+i+1);
				}
			}
		};
		
		
		Runnable r1=() ->{
				for(int i=0;i<5;i++) {
					System.out.println(i+1+"Run");
				}
			
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main"+i+1);
		}
		
		
	}

}
