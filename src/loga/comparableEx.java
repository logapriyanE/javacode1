package loga;
import java.util.*;
class Student1 implements Comparable<Student1>{
	int roll;
	String name;
	int age;
	Student1(int roll,String name, int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return roll+" : "+name+" : "+age;
	}
	public int compareTo(Student1 s) {
		return name.compareTo(s.name);
	/*	
	if(roll>s.roll) {
		return 1;
	}
	else if(roll<s.roll) {
		return -1;
	}
	else {
		return 0;
	}
	*/
	}
}
public class comparableEx {
	public static void main(String[] args) {
    ArrayList<Student1> li=new ArrayList<>();
    Student1 s1 = new Student1(101, "fg",34);
    li.add(new Student1(101,"naveen",23));
    li.add(new Student1(100,"praveen", 21));
    li.add(new Student1(102,"sundar",22));
    System.out.println();
   Collections.sort(li);
       System.out.println(li);
	}

}
