package loga;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Hash {

	public static void main(String[] args) {
	   
	   HashMap<String,String> map=new HashMap<>();
	   
	  
	   
	   map.put("A", "Java");
	   map.put("B","Python");
	   map.put("C", "C++");
	   System.out.println(map);
	   
	   Collections.synchronizedMap(map);
	   
	  Set<Map.Entry<String,String>> set= map.entrySet();
	  
	  Iterator<Map.Entry<String,String>> i=set.iterator();
	  
	  while(i.hasNext()) {
		  //map.put("D","Python");//- ConcurrentModificationException
	     Map.Entry<String,String> m= i.next();
		//m.setValue("Python");
		System.out.println(m.getKey()+" : "+m.getValue());
		//if(m.getKey().equals("B")) 
			//System.out.println(m.getValue());
		
	  }

	  
	  ConcurrentHashMap<String, String> cmap=new ConcurrentHashMap<>();
	   cmap.put("A", "Java");
	   cmap.put("B","Python");
	   cmap.put("C", "C++");
	  
	 Set<Map.Entry<String, String>>set2= cmap.entrySet();
	  
     Iterator<Map.Entry<String, String>> ii=set2.iterator();
     while(ii.hasNext()) {
    	 cmap.put("D","P");
    	 System.out.println(ii.next());
     }
	}

}





