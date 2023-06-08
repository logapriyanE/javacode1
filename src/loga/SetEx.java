package loga;
import java.util.*;
public class SetEx {
     public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
    	 set.add("Eash");
    	 set.add("praveen");
    	 set.add("java sundar");
    	 set.add("naveen");
    	 set.add("java sundar");
    	 set.add(null);
    	 set.add(null);
    	 
    	 System.out.println(set);
    	 
    	 LinkedHashSet<String> set1=new LinkedHashSet<>();
    	 set1.add("Eash");
    	 set1.add("praveen");
    	 set1.add("java sundar");
    	 set1.add("naveen");
    	 set1.add("java sundar");
    	 set1.add(null);
    	 set1.add(null);
    	 System.out.println(set1);
    	 
    	 TreeSet<String> set2=new TreeSet<>();
    	 set2.add("Eash");
    	 set2.add("praveen");
    	 set2.add("java sundar");
    	 set2.add("naveen");
    	 set2.add("java sundar");
    	 System.out.println(set2);


    	 
    	 
    	 
	}

}
