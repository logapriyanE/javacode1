package loga;

import java.util.Arrays;

public class F {

	public static void main(String[] args) {
		int a[]= {3,5,6,1};
		int b[]= {2,3,4,5};
		int c[]=new int[a.length*4];
		int d[]=new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			int s=0;
			for(int j=0;j<b.length;j++)
			{
				//System.out.println((b[i]));
				c[count]=(a[i])*(b[j]);
				s=s+c[count];
			    count++;
			}
			d[i]=s;
			
			
		}
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(d[0]);
	}

}


