package loga;
import java.util.*;

public class task {

	public static void main(String[] args) {
		Integer a[]= {26,13,5,6,-2,-1,13};
		TreeSet<Integer> c=new TreeSet<Integer>(Arrays.asList(a));
		System.out.println(c);
		LinkedList<Integer> b=new LinkedList<Integer>(c);
		System.err.println(b.get(c.size()-2));
		// Another method of solution:
		int d[]=new int[c.size()];
		int i=0;
		for(Integer y:c)
		{
			d[i]=y;
			i++;
		}
		System.out.println(d[d.length-2]);
	
		

	}

}
