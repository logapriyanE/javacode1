package hari;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Register{
	String name;
	String mail;
	String PhoneNo;
	String Password;
	public Register(String name, String mail, String phoneNo, String password) {
		this.name = name;
		this.mail = mail;
		this.PhoneNo = phoneNo;
		this.Password = password;
	}
	public String toString() {
		return "Register [name=" + name + ", mail=" + mail + ", PhoneNo=" + PhoneNo + ", Password=" + Password + "]";
	}	
}
class Login{
	String mail;
	String password;
	public Login(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}
	public String toString() {
		return "Login [mail=" + mail + ", password=" + password + "]";
	}
}
class Admin{
	private String name;
	private String password;
	public Admin(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String toString() {
		return "Admin [name=" + name + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
class Phone {
	String phonename;
	int phid;
	double prise;
	String color;
	Phone(String phonename,int phid,double prise,String color){
		this.phonename=phonename;
		this.phid=phid;
		this.prise=prise;
		this.color=color;
		}
	public String toString() {
		return "BrandName="+phonename+" : PhoneID="+phid+" : RS="+prise+" : color="+color;
	}
}
class Watch{
	String watchname;
	int whid;
	double prise;
	String color;
	Watch(String watchname,int whid,double prise,String color){
		this.watchname=watchname;
		this.whid=whid;
		this.prise=prise;
		this.color=color;	
	}
	public String toString() {
		return "BrandName="+watchname+" : WhId="+whid+" : RS="+prise+" : color="+color;
	}
}
class Computer{
	String computername;
	int cmid;
	double prise;
	String color;
	Computer(String computername,int cmid,double prise,String color){
		this.computername=computername;
		this.cmid=cmid;
		this.prise=prise;
		this.color=color;	
	}
	public String toString() {
		return "BrandName="+computername+" : cmId="+cmid+" : Rs="+prise+" : color="+color;
	}
}
public class TodayTask2 {
	  @SuppressWarnings("unlikely-arg-type")
	public static void task() {
		
		  Scanner ab1=new Scanner(System.in);
		  String rec;
		  do {
		Scanner ab=new Scanner(System.in);
		System.out.println("Hi, I have Phone,Watch,Computer");
		System.out.println(" what do you want ?");
		System.out.println("Enter please....");
		String a=ab.next();
		if(("Phone").equals(a)||a.equals("phone")) {
		Map<Integer,Phone> ph=new HashMap<>();
		ph.put(1, new Phone("oppo",101,15000,"green"));
		ph.put(2, new Phone("vivo",102,25000,"blue"));
		ph.put(3, new Phone("redmi",103,35000,"red"));
		ph.put(4, new Phone("realme",104,20000,"gold"));
		 for(Map.Entry<Integer, Phone> s:ph.entrySet()) {
			   System.out.println("BrandName="+s.getValue().phonename);
		   }
		ConcurrentHashMap<Integer, Phone> ph1=new ConcurrentHashMap<>(ph);
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 for(Map.Entry<Integer, Phone> s1:ph1.entrySet()){
		 if(s1.getValue().phonename.equals(b)) {
		 System.out.println(s1.getValue());
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");
		 ph.remove(s1.getKey());
		}
		 }
		 
		 System.out.println(ph);
		// System.out.println("if want to continue..(yes ro no)");
		//  String rec=ab.next();
		}
		else if(a.equals("Watch")||a.equals("watch")) {
		Map<Integer,Watch> wh=new HashMap<>();
		wh.put(1, new Watch("sprots",101,15000,"green"));
		wh.put(2, new Watch("taitan",102,25000,"blue"));
		wh.put(3, new Watch("casio",103,35000,"red"));
		wh.put(4, new Watch("Fastrack",104,20000,"gold"));
		for(Map.Entry<Integer, Watch> s:wh.entrySet()) {
			   System.out.println("BrandName="+s.getValue().watchname);
		   }
		ConcurrentHashMap<Integer, Watch> wh1=new ConcurrentHashMap<>(wh);
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 for(Map.Entry<Integer, Watch> s1:wh1.entrySet()) {
		 if(s1.getValue().watchname.equals(b)) {
		 System.out.println(s1.getValue());
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");}
		 wh.remove(s1.getKey());
		 }
		 System.out.println(wh);
		 System.out.println("if want to continue..(yes ro no)");
		 // String rec=ab.next();
		}
		else if(a.equals("Computer")||a.equals("computer")) {
		Map<Integer,Computer> cm=new HashMap<>();
		cm.put(1, new Computer("hp",101,15000,"green"));
		cm.put(2, new Computer("lenovo",102,25000,"blue"));
		cm.put(3, new Computer("acar",103,35000,"red"));
		cm.put(4, new Computer("vivobook",104,20000,"gold"));
		for(Map.Entry<Integer, Computer> s:cm.entrySet()) {
			   System.out.println("BrandName="+s.getValue().computername);
		   }
		ConcurrentHashMap<Integer, Computer> cm1=new ConcurrentHashMap<>(cm);
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 for(Map.Entry<Integer, Computer> s1:cm1.entrySet()) {
		 if(s1.getValue().computername.equals(b)) {
		 System.out.println(s1.getValue());
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");}
		 cm.remove(s1.getKey());
		 }
		 System.out.println(cm);
		 
		}
		else
		{
			System.out.print(a);
			System.err.println("  = we don't have that......");
		}
		System.out.println("if want to continue..(yes ro no)");
		   rec=ab1.next();
	}
	  while(rec.equals("yes"));
	  {
		  
	  }
	  }
	  public static void recall(){
		  Scanner ab=new Scanner(System.in);
		  System.out.println("if want to continue..(yes ro no)");
		  String rec=ab.next();
		  if(rec.equals("yes")) {
			  task();
		  }
		  else {System.out.println("Thank you welcome");}
	  }
	  

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		System.out.println("If you are new or alradyhave or admin");
		String a=ab.next();
		if(a.equals("new")) {
			List<Register> list=new ArrayList<>();
			System.out.println("Enter the your name");
			String a1=ab.next();
			System.out.println("Enter the Mail id");
			String b1=ab.next();
			System.out.println("Enter the phone number");
			String c1=ab.next();
			System.out.println("Enter the password");
			String d1=ab.next();
			Register re=new Register(a1,b1,c1,d1);
			list.add(re);
			System.out.println(list);
			System.out.println("Register Successfuly");
			System.out.println("if you want to continue (yes or no)");
			String e1=ab.next();
			if(e1.equals("yes")) {
				System.out.println("Enter your mail id");
				String f1=ab.next();
				System.out.println("Enter the pasword");
				String g1=ab.next();
				if(f1.equals(re.mail)&&g1.equals(re.Password)) {
					task();
				}
				else {System.out.println("Enter the correct value");}
			}
			else if(e1.equals("no")) {
				System.out.println(" Thank you ");
			}
			else {}
		}
		else if(a.equals("alradyhave")) {
			List<Login> lo=new ArrayList<>();
			lo.add(new Login("loga@gamail.com","1234"));
			lo.add(new Login("hari@gamail.com","4321"));
			System.out.println("Enter the mail");
			String lm=ab.next();
			System.out.println("Enter the password");
			String lp=ab.next();
			for(Login li:lo) {
				if(li.mail.equals(lm)&&li.password.equals(lp)) {
					task();
				}
				else {System.out.println("entre the correct value");}
			}
		}
		else if(a.equals("admin")) {
			List<Login> ad=new ArrayList<>();
			ad.add(new Login("loga@gamail.com","1234"));
			ad.add(new Login("hari@gamail.com","4321"));
			System.out.println("Enter the mail");
			String am=ab.next();
			System.out.println("Enter the password");
			String ap=ab.next();
			for(Login li:ad) {
				if(li.mail.equals(am)&&li.password.equals(ap)) {
					System.out.println();
				}
				else {System.out.println("entre the correct value");}
			}
		}
		else {
			System.out.println("Enter the correct value");
		}

	}

}
 