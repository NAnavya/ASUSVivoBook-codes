package code1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Main2 m=new Main2();
     String[] a={"Mahendra Singh","RohitSharma","Ravichandran Ashwin"};
     String[] c=m.getPlayerNames(3,a);
     for(int i=0;i<c.length;i++) {
    	 System.out.println(c[i]);
     }
	}

}
