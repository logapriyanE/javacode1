package loga;

//import java.util.*;
public class B {
	public static void main (String args[])
	{
		String a="java is a programminga lanuage java is simple lanuage";
		String b[]=a.split(" ");
		//String c=Arrays.toString(b);
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
		if(b[i].equals(b[j]))
		{
			//b[i]=b[j];
			System.out.println(b[i]);
		}
			}
		}
	}

}
