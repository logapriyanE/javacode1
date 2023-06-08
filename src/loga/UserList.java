package loga;
import java.util.*;
class Student{
	int roll;
	String name;
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	public String toString() {
		return roll+" "+name;
	}
}

public class UserList {
	public static void main(String[] args) {
       List<Student>  list=new ArrayList<>();
       Student s1=new Student(7,"Eash");
       Student s2=new Student(3,"java sundar");
       Student s3=new Student(1,"sarath");
       list.add(s1);
       list.add(s2);
       list.add(s3);
       System.out.println(s1.toString());
       System.out.println(s1.roll+" "+s1.name);
       System.out.println(list);//[7 Eash,3 java sundar,1 sarath]
	
	//for loop
       for(int i=0;i<list.size();i++) {
    	   System.out.println(list.get(i).roll);
       }
       
       //for each
       for(Student s:list) {
    	   System.out.println(s.name);
       }
       
       //iterator()
       Iterator<Student> i=list.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next().name);
       }
       //listIterator()
       ListIterator<Student> li=list.listIterator();
       while(li.hasNext()) {
    	   System.out.println(li.next());
       }
       while(li.hasPrevious()) {
    	   System.out.println(li.previous());
       }
       
       //listIterator(index)
       ListIterator<Student> l1=list.listIterator(1);
       while(l1.hasPrevious()) {
    	  System.out.println(l1.previousIndex()); 
    	  System.out.println(l1.previous());
       }
       
       
	}

}
