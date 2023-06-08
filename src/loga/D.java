package loga;
import java.util.*;

public class D {

	public static void main(String[] args) {
		String a="abc#effhh#kkf";
		String b[]=a.split("");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].equals("#"))
			{
				b[i]="hi";
				b[i-1]="hi";
				//System.out.print(b[i]);
			}
			
		}
		//System.out.print(Arrays.toString(b));
		for(int i=0;i<b.length;i++)
		{
			if(!b[i].equals("hi"))
			{
				System.out.print(b[i]+",");
			}
		}
				

	}

}
