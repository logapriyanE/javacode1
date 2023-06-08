package loga;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class ArrayListEx {
   public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        list.add("nokia");
        list.add("sony");
        list.add("vivo");
        list.add("one plus");
        //list.add(null);
        Collections.sort(list);
        Object o=list.get(0);
        String i=list.get(1);
        System.out.println(o);
        System.out.println(i);
       
		/*
		 * list.addAll(2,list1); System.out.println(list);
		 */
        
	}

}
