package Example3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmpStreamMain {
	public static void main(String[] args) {
		List<Emp> empList=Arrays.asList(new Emp(1,"Navya",23),
				new Emp(2,"Navya2",21),
				new Emp(3,"Navya3",22),
				new Emp(1,"Navya",23),
				new Emp(2,"Navya2",21),
				new Emp(3,"Navya3",22));
		//Here forEach is a consumer
		Consumer<Emp> empc=System.out::print;
		//herewe didnot call the accept but we get the values.Buthere the values are executed by forEach method like Calculated example
		empList.forEach(empc);
		empList.forEach(System.out::println);
		
		
		//forEach -- Consumer
		//filter -- predicate
		//map -- function
		
		//Stream - not for I/O where read/write It is used to processes the data
		
		//Map , Filter,  Reduce
		//Employee db -11 col- 10000  rows
		//4 - col  -- map(function)
		//find emp 01-jan (filter)  format of data is same
		//get count
		
		
		//STreams is not storing the data/modify the data it is just to process the data
		// filter and map are intermediate operations and we have terminal/final operations like sum()
		empList.stream().filter(n->n.getAge()>21).map(n->n.getName()).forEach(System.out::println);   // here format is changed from emp to emp.name
		empList.stream().filter(n->n.getAge()>21).forEach(System.out::println); //here format doesnot change because here we are getting the same format as emp but based on the condition
	    int a=	(int) empList.stream().map(n->n.getName()).filter(n->n.startsWith("n")).count();
		int sum=empList.stream().filter(n->n.getAge()>21).mapToInt(n->n.getAge()).sum();
		System.out.println(sum);
		
		Set<Emp> li=empList.stream().filter(n->n.getAge()>21).collect(Collectors.toSet());
		
		
		String ss=empList.stream().filter(n->n.getAge()>21).map(n->n.getName()).collect(Collectors.joining(","));
		System.out.println(ss);
		/*  Reduction  --  terminal operation
		  1.aggregate function (min.max,avg,count)  -- we find in sql
		  2.Collectors
		  
		  */
	}

}
