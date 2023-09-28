import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		LocalDateTime d = null;
		System.out.println(d.now());
		System.out.println(new Date());
		System.out.println((new Date()).getTime());
		System.out.println((new Date()).getDate());
		System.out.println((new Date()).getHours());
		System.out.println(new java.sql.Date((new Date()).getTime()));
	
	Supplier<String> s=()-> "Navya";
	Supplier<Date> s1=()-> new Date();
	Supplier<Date> s2= Date ::new; // here it is not taking any argument called as Contructor reference
	System.out.println(s.get());
	
	
	Consumer<Long>  c=(i)->System.out.println(i);
	Consumer<String>  c1= System.out::println;// no.of parameters accepting and we are printing same arguments means we can use methodreference
	c.accept( 6l);
	
	
	Predicate<Integer> p=(i)-> i>10;
	System.out.println(p.test(9));	
	
	
	Function<String,Integer> f= Integer::parseInt;              //(String a)->Integer.parseInt(a);
	System.out.println(f.apply("10")+20);
	
	BiFunction<String,String,Integer> f1= (s11,s22)->Integer.parseInt(s11+s22);
	int fun=f.apply("10");
	System.out.println(f1.apply("10","10")+20);


}
}