package loga;
import java.util.*;

public class MapTask3 {
	public static void main(String[] args) {
		String b="java";
		String a1[]=b.split("");
     	Map<String,Integer> num=new HashMap<>();
		for(String c:a1)
		{
			if(num.containsKey(c))
			{
			
				num.put(c, num.get(c)+1);
			}
		
		else
		{
			num.put(c,1);
		}
		}
		System.out.println(num);
	}

	}


