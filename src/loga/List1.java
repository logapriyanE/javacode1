package loga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		ArrayList<String> c=new ArrayList<String>();
		c.add("java");
		c.add("loga");
		for(String b:c)
		{
			System.out.println("enter your name");
			String d=a.next();
			c.add(d);
		}
			
					
	}

}
