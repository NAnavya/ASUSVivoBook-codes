import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Scanner s=new Scanner(System.in);
//		Date d=new Date();
//		java.sql.Date ds=new java.sql.Date(d.getDate());
//		System.out.println(d);
//		System.out.println(ds);
//		String a=d.toLocaleString();
//		System.out.println(d.toLocaleString());
		String a=s.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d=sdf.parse(a);
		String d1=sdf.format(d);
		java.sql.Date ddd=new java.sql.Date(d.getTime());
		System.out.println(d +"  "+d1+"  "+d.getTime()+" sd"+ddd);

	}

}
