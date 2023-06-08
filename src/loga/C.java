package loga;

import java.util.Arrays;

public class C {
	public static void main(String args[])
	{
		String a="java is a progamming language java is simple language";
		String b[]=a.split(" ");
		int c[]=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
		   c[i]=b[i].length();
		}
		Arrays.sort(c);
		int n=c[c.length-2];
		for(int j=0;j<b.length;j++)
		{
			if(b[j].length()==n) {
			System.out.println(b[j]);}
		}
		
		
		}
			
		
	}


