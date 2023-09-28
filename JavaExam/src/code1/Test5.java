package code1;

public class Test5 {
	public static String validateCity(String cityName) {
		String a=cityName;
		String o="Invalid";
		String b=""+a.charAt(0)+a.charAt(1);
		String c=""+a.charAt(a.length()-2)+a.charAt(a.length()-1);
		String d=a.substring(2,a.length()-2);
		//System.out.println(d+b+c);
		 final String e="^[*]+$";
		 final String f="^[a-zA-Z]+$";
		 if(b.matches(f)&&c.matches(f)) {
			if( d.matches(e)) {
				o="Valid";
			}
		 }
		return o;
		
	}

}
