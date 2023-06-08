package hari;
import java.util.*;
class user{
	private String name;
	private String AcNo;
	private String passward;
	private int Amount;
	public user(String name, String acNo, String passward, int amount) {
		this.name = name;
		this.AcNo = acNo;
		this.passward = passward;
		this.Amount = amount;
	}
	
	public String toString() {
		return "user [name=" + name + ", AcNo=" + AcNo + ", passward=" + passward + ", Amount=" + Amount + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcNo() {
		return AcNo;
	}

	public void setAcNo(String acNo) {
		AcNo = acNo;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}


	
}
public class ToadayTask1 {
	public static void main(String args[]) {
		Scanner ab=new Scanner(System.in);
		List<user> list=new ArrayList<>();
		user ba=new user("Sathish","123456789012","3434",135000);
		user bb=new user("Abishake","123456789013","8880",1000000);
		user bc=new user("Aravinth","123456789014","3435",167000);
		user bd=new user("Vasanth","123456789015","3436",185000);
		list.add(ba);
		list.add(bb);
		list.add(bc);
		list.add(bd);
		System.out.println("welcom to bank");
		System.out.println("if have a acount or not (yes or no)");
		String a=ab.nextLine();
		if(a.equals("yes")) {
			System.out.println("Enter your AcNo");
			String b=ab.nextLine();
			System.out.println("Enter your Password");
			String c=ab.nextLine();
			if((b.equals(ba.getAcNo()))&&(c.equals(ba.getPassward()))) {
				System.out.println(list.get(0));
				System.out.println("if want to continue...(yes or no)");
				String d=ab.nextLine();
				if(d.equals("yes")) {
					System.out.println("if you want to ( withdraw or deposit)");
					String e=ab.nextLine();
					if(e.equals("withdraw")) {
						System.out.println("Enter the withdraw Amount..");
						int f=ab.nextInt();
						ba.setAmount(ba.getAmount()-f);
						System.out.println("Amount waithdraw sussccusfuly");
						System.out.println("if want to check the balance or not (yes1 or no1)");
						String g=ab.next();
						if(g.equals("yes")) {
							System.out.println("your balance is ="+ba.getAmount());
						}
						else if(g.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else if(e.equals("deposit")) {
						System.out.println("Enter the deposit Amount..");
						int h=ab.nextInt();
						ba.setAmount(ba.getAmount()+h);
						System.out.println("Amount Deposit sussccusfuly");
						System.out.println("if want to check the balance or not (yes or no)");
						String i=ab.next();
						if(i.equals("yes")) {
							System.out.println("your balance is ="+ba.getAmount());
						}
						else if(i.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else {System.err.println("Enter the corrcet value...");}
				}
				else if(d.equals("no")) {
					System.out.println(" Thank you ...");
				}
				else
				{System.err.println(" Enter the corrct value...");}
			}
			else if((b.equals(bb.getAcNo()))&&(c.equals(bb.getPassward()))) {
				System.out.println(list.get(1));
				System.out.println("if want to continue...(yes or no)");
				String d=ab.nextLine();
				if(d.equals("yes")) {
					System.out.println("if you want to ( withdraw or deposit)");
					String e=ab.nextLine();
					if(e.equals("withdraw")) {
						System.out.println("Enter the withdraw Amount..");
						int f=ab.nextInt();
						bb.setAmount(bb.getAmount()-f);
						System.out.println("Amount waithdraw sussccusfuly");
						System.out.println("if want to check the balance or not (yes1 or no1)");
						String g=ab.next();
						if(g.equals("yes")) {
							System.out.println("your balance is ="+bb.getAmount());
						}
						else if(g.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else if(e.equals("deposit")) {
						System.out.println("Enter the deposit Amount..");
						int h=ab.nextInt();
						bb.setAmount(bb.getAmount()+h);
						System.out.println("Amount Deposit sussccusfuly");
						System.out.println("if want to check the balance or not (yes or no)");
						String i=ab.next();
						if(i.equals("yes")) {
							System.out.println("your balance is ="+bb.getAmount());
						}
						else if(i.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else {System.err.println("Enter the corrcet value...");}
				}
				else if(d.equals("no")) {
					System.out.println(" Thank you ...");
				}
				else
				{System.err.println(" Enter the corrct value...");}
			}
			else if((b.equals(bc.getAcNo()))&&(c.equals(bc.getPassward()))) {
				System.out.println(list.get(2));
				System.out.println("if want to continue...(yes or no)");
				String d=ab.nextLine();
				if(d.equals("yes")) {
					System.out.println("if you want to ( withdraw or deposit)");
					String e=ab.nextLine();
					if(e.equals("withdraw")) {
						System.out.println("Enter the withdraw Amount..");
						int f=ab.nextInt();
						bc.setAmount(bc.getAmount()-f);
						System.out.println("Amount waithdraw sussccusfuly");
						System.out.println("if want to check the balance or not (yes1 or no1)");
						String g=ab.next();
						if(g.equals("yes")) {
							System.out.println("your balance is ="+bc.getAmount());
						}
						else if(g.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else if(e.equals("deposit")) {
						System.out.println("Enter the deposit Amount..");
						int h=ab.nextInt();
						bc.setAmount(bc.getAmount()+h);
						System.out.println("Amount Deposit sussccusfuly");
						System.out.println("if want to check the balance or not (yes or no)");
						String i=ab.next();
						if(i.equals("yes")) {
							System.out.println("your balance is ="+bc.getAmount());
						}
						else if(i.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else {System.err.println("Enter the corrcet value...");}
				}
				else if(d.equals("no")) {
					System.out.println(" Thank you ...");
				}
				else
				{System.err.println(" Enter the corrct value...");}
			}
			else if((b.equals(bd.getAcNo()))&&(c.equals(bd.getPassward()))) {
				System.out.println(list.get(3));
				System.out.println("if want to continue...(yes or no)");
				String d=ab.nextLine();
				if(d.equals("yes")) {
					System.out.println("if you want to ( withdraw or deposit)");
					String e=ab.nextLine();
					if(e.equals("withdraw")) {
						System.out.println("Enter the withdraw Amount..");
						int f=ab.nextInt();
						bd.setAmount(bd.getAmount()-f);
						System.out.println("Amount waithdraw sussccusfuly");
						System.out.println("if want to check the balance or not (yes1 or no1)");
						String g=ab.next();
						if(g.equals("yes")) {
							System.out.println("your balance is ="+bd.getAmount());
						}
						else if(g.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else if(e.equals("deposit")) {
						System.out.println("Enter the deposit Amount..");
						int h=ab.nextInt();
						bd.setAmount(bd.getAmount()+h);
						System.out.println("Amount Deposit sussccusfuly");
						System.out.println("if want to check the balance or not (yes or no)");
						String i=ab.next();
						if(i.equals("yes")) {
							System.out.println("your balance is ="+bd.getAmount());
						}
						else if(i.equals("no")) {
							System.out.println("Thank you....");
						}
						else {System.err.println("Enter the correct value");}
						
					}
					else {System.err.println("Enter the corrcet value...");}
				}
				else if(d.equals("no")) {
					System.out.println(" Thank you ...");
				}
				else
				{System.err.println(" Enter the corrct value...");}
			}
			
		}
		else if(a.equals("no")) {
			System.out.println("create a new acount");
			System.out.println("Enter your name");
			String a1=ab.nextLine();
			System.out.println("Enter the anount NO");
			String b1=ab.nextLine();
			System.out.println("Enter the 4 digit pin");
			String c1=ab.nextLine();
			System.out.println("Enter the depoist Amount");
			int d1=ab.nextInt();
			user be=new user(a1,b1,c1,d1);
			list.add(be);
			System.out.println(list.get(list.size()-1));
			System.out.println("Acount created sucessfuly");
			System.out.println("if want to continu (yes or no)");
			String e1=ab.next();
			if(e1.equals("yes")) {
				System.out.println("Enter your AcNo");
				String bz=ab.next();
				System.out.println("Enter your Password");
				String cz=ab.next();
				if((bz.equals(be.getAcNo()))&&(cz.equals(be.getPassward()))) {
					System.out.println(list.get(list.size()-1));
					System.out.println("if want to continue...(yes or no)");
					String dz=ab.next();
					if(dz.equals("yes")) {
						System.out.println("if you want to ( withdraw or deposit)");
						String ez=ab.next();
						if(ez.equals("withdraw")) {
							System.out.println("Enter the withdraw Amount..");
							int f=ab.nextInt();
							be.setAmount(be.getAmount()-f);
							System.out.println("Amount waithdraw sussccusfuly");
							System.out.println("if want to check the balance or not (yes1 or no1)");
							String g=ab.next();
							if(g.equals("yes")) {
								System.out.println("your balance is ="+be.getAmount());
							}
							else if(g.equals("no")) {
								System.out.println("Thank you....");
							}
							else {System.err.println("Enter the correct value");}
							
						}
						else if(ez.equals("deposit")) {
							System.out.println("Enter the deposit Amount..");
							int h=ab.nextInt();
							be.setAmount(be.getAmount()+h);
							System.out.println("Amount Deposit sussccusfuly");
							System.out.println("if want to check the balance or not (yes or no)");
							String i=ab.next();
							if(i.equals("yes")) {
								System.out.println("your balance is ="+be.getAmount());
							}
							else if(i.equals("no")) {
								System.out.println("Thank you....");
							}
							else {System.err.println("Enter the correct value");}
							
						}
						else {System.err.println("Enter the corrcet value...");}
					}
					else if(dz.equals("no")) {
						System.out.println(" Thank you ...");
					}
					else
					{System.err.println(" Enter the corrct value...");}
				}
				
			}
			else if(e1.equals("no")) {System.out.println("Thank you....");}
			else {System.err.println("enter the corrcet value");}
		}
		else {System.err.println("Enter the correct value.......");}
		
		
		
	}

}
