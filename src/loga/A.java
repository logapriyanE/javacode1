package loga;

import java.util.Arrays;

public class A {
	public static void main(String args[])
	{
		int b=0;
		int a[]= {2,3,0,4,1,0,0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[b]=a[i];
				b++;
			}
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==0)
			{
				a[b]=a[j];
				b++;
			}
		}
		int c[]=Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
	}

}
