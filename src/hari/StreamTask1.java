package hari;
import java.util.*;
import java.util.stream.*;
class Employe{
	int id;
	String name;
	int ex;
	double salary;
	Employe(int id,String name,int ex,double salary){
		this.id=id;
		this.name=name;
		this.ex=ex;
		this.salary=salary;
	}
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", ex=" + ex + ", salary=" + salary + "]";
	}
}

public class StreamTask1 {

	public static void main(String[] args) {
		List<Employe> ep= new ArrayList<Employe>();
		ep.add(new Employe(101,"Aravinth",3,40000));
		ep.add(new Employe(103,"Vasanth",2,27000));
		ep.add(new Employe(102,"Anith",1,20000));
		ep.add(new Employe(105,"Tharun",5,50000));
		ep.add(new Employe(104,"Binson",4,45000));
		Stream<Employe> s=ep.stream();
		System.out.println("Print id and Name for Above 30k Salary");
		ep.stream().filter(s1->s1.salary>=30000).forEach(c->System.out.println(c.id+" : "+c.name));
		ep.stream().filter(s3->s3.ex>=2).forEach(c1->System.out.println(c1.name+":"+c1.id+":"+(c1.salary+10000)+":"+c1.ex));

	}

}
