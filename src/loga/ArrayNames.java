package loga;
import java.util.*;
public class ArrayNames {
    public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
	    list.add("Arun");
	    list.add("gohul");
	    list.add("Roja");
	    list.add("Praveen");
	    System.out.println(list);
	    //list.remove("gohul");
	   //list.remove(2);
	    list.set(1,"Naveen");
	    System.out.println(list.contains("kamala"));
	    System.out.println(list.get(0));
	    System.out.println(list.indexOf("Arun"));
	    System.out.println(list);
	   // list.clear();
	    System.out.println(list.size());
	    
	    //for loop
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    // for Each
	    for(String s:list) {
	    	System.out.println(s);
	    }
	    //iterator()
	    
	    Iterator<String> i=list.iterator();
	    System.out.println(list);
	    while(i.hasNext()) {
	    	//System.out.println(i);
	    	
	    	System.out.println(i.next());
	    	i.remove();
	    }
	    System.out.println(list);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    }

}
