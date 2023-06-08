package hari;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;
public class MethodReferences {
	int x;
	MethodReferences(int x)
	{
		this.x=x;
		System.out.println(x);
	}
	 double add(Integer a,Integer b) {
		return a+b;
	}
	public int compare(Integer a1,Integer a2) {
		return a1.compareTo(a2);
	}

	public static void main(String[] args) {
		//MethodReferences m=new MethodReferences();
		//BiFunction<Integer,Integer,Double> ab=m::add;
		Consumer<Integer> c=MethodReferences::new;
	c.accept(4);
		   // System.out.println(ab.apply(2,3));;
		List<Integer> ac=Arrays.asList(3,5,6,7,3,2);
		System.out.println(ac);
		for(int  )
		Map<Integer, Integer> aa=ac.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(aa);

	}

}
