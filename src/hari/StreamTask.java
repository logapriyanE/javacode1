package hari;
import java.util.*;
import java.util.stream.*;

public class StreamTask {
	public static void main(String args[]) {
		Integer a[]= {8,4,3,7,6,4,5,2,1,1,6};
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(list);
		System.out.println("Remove the duplicate elemant");
		Stream<Integer> s=list.stream();
		list.stream().distinct().forEach(c->System.out.println("-"+c));
		System.out.println("even number");
		list.stream().filter(b->b%2==0).forEach(a1->System.out.println(a1));
        long l=list.stream().filter(b->b%2==0).count();
        System.out.println("count of even number-- "+l);
		
	}

}
