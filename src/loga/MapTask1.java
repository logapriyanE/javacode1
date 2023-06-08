package loga;
import java.util.*;
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
class PhoneMap extends HashMap<Integer,Phone>{}
public class MapTask1 {

	public static void main(String[] args) {
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
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 if("oppo".equals(b)) {
		 System.out.println(ph.get(1).phonename+"\n"+ph.get(1).phid+"\n"+ph.get(1).prise+"\n"+ph.get(1).color);
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");}
		 else if("vivo".equals(b)) {
			 System.out.println(ph.get(2));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("redmi".equals(b)) {
			 System.out.println(ph.get(3));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("realme".equals(b)) {
			 System.out.println(ph.get(4));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else {System.out.println("Enter the corrct name");
		 System.out.println("Your Order is not Placed");
		 System.err.println("Thankyou");}
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
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 if("sprots".equals(b)) {
		 System.out.println(wh.get(1));
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");}
		 else if("taitan".equals(b)) {
			 System.out.println(wh.get(2));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("casio".equals(b)) {
			 System.out.println(wh.get(3));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("fastrack".equals(b)) {
			 System.out.println(wh.get(4));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else {System.out.println("Enter the corrct name");
		 System.out.println("Your Order is not Placed");
		 System.err.println("Thankyou");}
		
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
		 System.out.println("Enter you Brand");
		 String b=ab.next();
		 if("hp".equals(b)) {
		 System.out.println(cm.get(1));
		 System.out.println("Your Order is Placed");
		 System.err.println("Thankyou");}
		 else if("lenovo".equals(b)) {
			 System.out.println(cm.get(2));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("acre".equals(b)) {
			 System.out.println(cm.get(3));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else if("vivobook".equals(b)) {
			 System.out.println(cm.get(4));
			 System.out.println("Your Order is Placed");
			 System.err.println("Thankyou");}
		 else {System.out.println("Enter the corrct name");
		 System.out.println("Your Order is not Placed");
		 System.err.println("Thankyou");}
		}
		else
		{
			System.out.print(a);
			System.err.println("  = we don't have that......");
		}

	}

}
