package loga;
import java.util.Scanner;

public class E {
	 void main()throws InvalidNameException,WorngNumberException,InvalidEmailException
	 {
			    Scanner oa = new Scanner(System.in);
				System.out.println("Enter your name");
				String a=oa.nextLine();
				System.out.println("Enter your phoneNumber");
				String b=oa.nextLine();
				System.out.println("Enter your Email");
				String c=oa.nextLine();
				if(a.length()>=20)
				{
					throw new InvalidNameException("Enter the corrct name");
				}
				else if(b.length()!=10)
				{
					throw new WorngNumberException("Enter the corrct number");
				}
				else if(!c.contains("@"))
				{
					throw new InvalidEmailException("Enter the corrct number");
				}
				else {
					System.out.println("welcome");
				}
			}
	 

	public static void main(String[] args)throws InvalidNameException,WorngNumberException,InvalidEmailException
	{
	
		E ob=new E();
		ob.main();
			//System.out.println(e);
		
		

	}

}
 class InvalidNameException extends Exception {
	public InvalidNameException(String b)
	 {
		 super(b);
	 }
 }
 class WorngNumberException extends Exception {
	public WorngNumberException(String a)
	 {
		 super(a);
	 }
 }
 class InvalidEmailException extends Exception {
	public InvalidEmailException(String a)
	 {
		 super(a);
	 }
 }
