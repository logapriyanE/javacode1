package hari;
import java.util.*;
import java.util.stream.*;

class Employe1 implements Comparable<Employe1>{
	int id;
	String name;
	int ex;
	int salary;
	Employe1(int id,String name,int ex,int salary){
		this.id=id;
		this.name=name;
		this.ex=ex;
		this.salary=salary;
	}
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", ex=" + ex + ", salary=" + salary + "]";
	}
	public int compareTo(Employe1 s) {
		//return s.name.compareTo(name);
		
	if(salary>s.salary) {
		return 1;
	}
	else if(salary<s.salary) {
		return -1;
	}
	else {
		return 0;
	}
	
	}
}

public class OptinalTask {

	public static void main(String[] args) {
		List<Employe1> ep= new ArrayList<Employe1>();
		ep.add(new Employe1(101,"Aravinth",3,40000));
		ep.add(new Employe1(103,"Vasanth",2,27000));
		ep.add(new Employe1(102,"Anith",1,20000));
		ep.add(new Employe1(105,"Tharun",5,50000));
		ep.add(new Employe1(104,"Binson",4,45000));
		System.out.println("Above 2 year experiences");
		Map<Integer,String> map=ep.stream().filter(s1->s1.ex>2).collect(Collectors.toMap(p1->p1.id,p2->p2.name));
        for(Map.Entry<Integer, String> a:map.entrySet()){
		System.out.println(a);}
        System.err.println("<------------------------------------->");
        System.out.println(" Max Salary");
        ep.stream().max((c1,c2)->c1.compareTo(c2)).ifPresent(System.out::println);
	}

}
