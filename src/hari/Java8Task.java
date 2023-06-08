package hari;
import java.util.*;
interface Java{
	String add(String a);
}
interface JavaP{
	void sud(String c);
}
public class Java8Task {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter The value");
		String a=obj.nextLine();
		Java oa=x->{String c=x+" Programming";return c;};
		System.out.println(oa.add(a));;
		JavaP ob=y->{String d[]=y.split("");System.out.println(d.length);};
		ob.sud(oa.add(a));
	}

}
