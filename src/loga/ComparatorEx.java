package loga;
import java.util.*;
class Student2 {
	
	
	int roll;
	String name;
	int age;
	Student2(int roll,String name, int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return roll+" : "+name+" : "+age;
	}
}
class Roll implements Comparator<Student2>{
 public int compare(Student2 o1, Student2 o2) {
	if(o1.roll>o2.roll) {
		//System.out.println(o1.roll+"--1---"+o2.roll);
		return 1;
	}
	else if(o1.roll<o2.roll) {
		//System.out.println(o1.roll+"---_1--"+o2.roll);
		return -1;
		
	}
	else {
		return 0;
	}
	}
	
}
class Name implements Comparator<Student2>{
	public int compare(Student2 o1, Student2 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class Age implements Comparator<Student2>{
     public int compare(Student2 o1, Student2 o2) {
		Integer i1=Integer.valueOf(o1.age);
		Integer i2=Integer.valueOf(o2.age);
		return i1.compareTo(i2);
	}
	
	
}
public class ComparatorEx {
	public static void main(String[] args) {
	List<Student2> list=new ArrayList<>();	
	list.add(new Student2(103,"naveen",23));
	list.add(new Student2(101,"praveen",21));
	list.add(new Student2(102,"kaveen",22));
	Collections.sort(list,new Age());
	System.out.println(list);
	Collections.sort(list,new Roll());
	System.out.println(list);
	Collections.sort(list,new Name());
	System.out.println(list);

	}

}
