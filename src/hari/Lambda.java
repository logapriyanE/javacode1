package hari;
interface Alambda{
	void add();
}
interface  Alambda1{
	void sub(int a);
}
interface  Alambda2{
	int mud();
}
interface  Alambda4{
	int div(int a,int b);
}

public class Lambda {
	
	public static void main(String args[]) {
		Alambda oa=()->{System.out.println("hi logapriyan");};
		oa.add();
		 Alambda1 ob=a->{System.out.println(a+10);};
		 ob.sub(40);
		 Alambda2 oc=()->10*20;
		 System.out.println(oc.mud());
		 Alambda4 od=(x,y)->{int c=x/y;return c;};
		 System.out.println(od.div(20,10));
	
		
	}

}
