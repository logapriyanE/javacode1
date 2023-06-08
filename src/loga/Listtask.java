package loga;
import java.util.*;

public class Listtask {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number of empl");
		int b=a.nextInt();
		List<String> c=new ArrayList<String>();
		List<Integer> e=new ArrayList<Integer>();
		for(int i=1;i<=b;i++)
		{
			System.out.println("enter the empl - "+i+" - Name");
			String d=a.next();
			c.add(d);	
			System.out.println("enter the empl -"+i+" - Experience");
			int f=a.nextInt();
			e.add(f);	
		}
		System.out.println(c);
		System.out.println(e);
		
		for(int i=0;i<b;i++)
		{
			if(e.get(i)>=2)
			{
				System.out.print("More then 2 year Experience : ");
				System.out.println(c.get(i));
			}
		}
		

	}

}
