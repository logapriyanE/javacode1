package loga;
import java.util.*;
public class MapTask {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		Map<Integer,String> name=new HashMap<>();
		name.put(3,"Aravinth");
		name.put(4,"Siva");
		name.put(5,"Vasanth");
		name.put(1,"Anith");
		name.put(2,"Tharun");
		System.out.println(name);
		System.out.println("Enter in remove key");
		int aa=a.nextInt();
		name.remove(aa);
		System.out.println(name);
		System.out.println("Enter in new value");
		String bb=a.next();
		name.putIfAbsent(aa, bb);
		System.out.println(name);
		 for(Map.Entry<Integer, String> s:name.entrySet()) {
			   System.err.println(s.getValue()+ " : "+s.getKey());
		   }

	}

}
