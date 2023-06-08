package hari;

import java.util.Arrays;
import java.util.*;

public class TodayTask {

	public static void main(String[] args) {
		Integer a[]= {2,3,1,4,6,3,3,6,1};
		int k=10032;
		String h=String.valueOf(k);
		StringBuffer d=new StringBuffer(h);
		d.reverse();
		List<Integer> b=new ArrayList<Integer>(Arrays.asList(a));
		TreeSet<Integer> b1=new TreeSet<Integer>();
		System.out.println(b);
		for(int i=0;i<b.size();i++) {
			for(int j=1+i;j<b.size();j++) {
				if(b.get(i)==b.get(j)) {
					b1.add(b.get(i));
				}
			}
		}
		System.out.println("Duplicate Element"+b1);
		System.out.println(d);
  
	}

}
