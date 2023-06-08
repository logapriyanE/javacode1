package loga;
import java.util.*;
public class MapEx {
    public static void main(String[] args) {
     HashMap<Integer,String> map =new HashMap<>();
     map.put(103,"janu");
     map.put(101,"java sundar");
     map.put(102,"sundar");
     map.put(1, null);
     map.put(104,"mani");
     map.put(100,"kamala");
     map.put(104,"maniii");
     
     System.out.println(map.get(100));
     System.out.println(map.containsKey(103));
     System.out.println(map.containsValue("janu"));
     map.replace(102,"ram");
     System.out.println(map);
     map.replace(100,"kamala", "k");
     System.out.println(map);
     map.remove(100);
     System.out.println(map);
     System.out.println(map.values());
     
     //keySet()
    Set<Integer> set=map.keySet();
    ArrayList<Integer> list=new ArrayList<>(set);
    System.out.println(list);
    Iterator<Integer> i=set.iterator();
    while(i.hasNext()) {
    	Integer ii=i.next();
    	System.out.println(ii+" : "+map.get(ii));
    	
    }
    
    //for loop
    for(int k=0;k<list.size();k++) {
    	System.out.println(map.get(list.get(k))+"--for loop");
    }
    
    //foreach
    for(Integer j:set) {
    	System.out.println(j+ " : "+map.get(j));
    }
    
     //entrySet()
    
    
   Set<Map.Entry<Integer, String>> set2=map.entrySet();
   
   ArrayList<Map.Entry<Integer, String>> list2=new ArrayList<>(set2);
   System.out.println(list2);
   Iterator<Map.Entry<Integer, String>> i2=set2.iterator();  
   while(i2.hasNext()) {
	   Map.Entry<Integer, String> m= i2.next();
	  System.out.println(m.getValue()+ " : "+m.getKey());
   }
   
   //forEach
   for(Map.Entry<Integer, String> s:set2) {
	   System.out.println(s.getValue()+ " : "+s.getKey());
   }
     

	}

}
