package loga;
import java.util.*;
class Book{
	String bookname;
	String authorname;
	Book(String bookname,String authorname){
		this.bookname=bookname;
		this.authorname=authorname;
	}
	public String toString() {
		return "Book [bookname=" + bookname + ", authorname=" + authorname + "]";
	}
}

public class MapTask2 {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		HashMap<Integer,Book> bn=new HashMap<>();
		bn.put(1, new Book("Adventures of Tom Sawyer","Mark Twain"));
		bn.put(2,new Book("Alice in Wonderland","Lewis Carrol"));
		bn.put(3, new Book("Lord of the Rings","J.R.R. Tolkien"));
		bn.put(4, new Book("Harry Potter and the Sorcerer's Stone","J.K. Rowling"));
		bn.put(5, new Book("Rich Dad Poor Dad","Robert T. Kiyosaki "));
		System.out.println("Wlecom to Library");
		System.out.println("your are Student or Staff");
		String b=ab.next();
		if(b.equals("Student")||b.equals("student")) {
		for(Map.Entry<Integer,Book> s:bn.entrySet()){
			System.out.println(s.getKey()+ " : "+s.getValue().bookname);
		}
		System.out.println("Enter the book key to purchase");
		int c=ab.nextInt();
		System.out.println(bn.get(c));
		System.err.println(" purchase is success");
		System.out.println("Thank you");
	    }
		else if(b.equals("Staff")||b.equals("staff")){
			System.out.println("Enter you oldstaff or newstaff");
			String c=ab.next();
			if(c.equals("oldstaff")) {
				System.out.println("Enter the Adminid (Logapriyan12)");
				String d=ab.next();
				if(d.equals("Logapriyan12")) {
					System.out.println("Enter the password(Loga7200)");
					String e=ab.next();
					if(e.equals("Loga7200")) {
						System.out.println("Enter the Add bookkey");
						int f=ab.nextInt();
						System.out.println("Enter the Added Book Name");
						String g=ab.next();
						System.out.println("Enter the Added Book Author name");
						String h=ab.next();
						bn.putIfAbsent(f,new Book(g,h));
						for(Map.Entry<Integer,Book> s:bn.entrySet()){
							System.out.println(s.getKey()+ " : "+s.getValue());}
						System.err.println("---Book added successfuly---");
						System.out.println("Thank you");
						
					}
					else {System.err.println("--worng password--");}
				}
				else {System.err.println("---worng adminid---");}
			}
			else if(c.equals("newstaff")) {
				System.out.println("Create a new Acount");
				System.out.println("Create new Adminid");
				String i=ab.next();
				System.out.println("Create new password");
				String j=ab.next();
				System.out.println("Acount Created successfull");
				System.out.println("Enter the Adminid ");
				String d=ab.next();
				if(d.equals(i)) {
					System.out.println("Enter the password");
					String e=ab.next();
					if(e.equals(j)) {
						System.out.println("Enter the Add bookkey");
						int f=ab.nextInt();
						System.out.println("Enter the Added Book Name");
						String g=ab.next();
						System.out.println("Enter the Added Book Author name");
						String h=ab.next();
						bn.putIfAbsent(f,new Book(g,h));
						for(Map.Entry<Integer,Book> s:bn.entrySet()){
							System.out.println(s.getKey()+ " : "+s.getValue());}
						System.err.println("---Book added successfuly---");
						System.out.println("Thank you");
						
					}
					else {System.err.println("--worng password--");}
				}
				else {System.err.println("---worng adminid---");}
			}
			else {System.out.println("Enter the corret valve");}
			
			
		}

}
}
