package hari;
import java.util.*;
import java.util.stream.Collectors;
class StudentEx{
	int roll;
	String name;
	int mark;
	StudentEx(int roll,String name,int mark){
		this.roll=roll;
		this.name=name;
		this.mark=mark;
	}
	public String toString() {
		return name+roll;
	}
}

public class PreFunctionTask {
   public static void main(String[] args) {
	   
	StudentEx s1=new StudentEx(102,"saravanan",45);
	StudentEx s2=new StudentEx(100,"praveen",39);
	StudentEx s3=new StudentEx(101,"raja arun",23);
	StudentEx s4=new StudentEx(103,"pooja",78);
	List<StudentEx> list= new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s4);
   list.stream().filter(s->s.mark>=40).map(m->m.name.concat(" pass"))
   .forEach(System.out::println);
	//s1,s2,s3,s4..>s1,s4..>s1.name+pass,s4.name+pass-->
   list.stream().sorted((c1,c2)->{
	   if(c1.roll>c2.roll)
	   return 1;
	   else if (c1.roll<c2.roll)
		   return -1;
	   else
		   return 0;
   }).forEach(c->System.out.println(c.roll));
   
  List<StudentEx> li= list.stream().distinct().collect(Collectors.toList());
  System.out.println(li); 
  
  
  
  
  
   
   
   
   
   
   
   
   
   
   
   
   
   }

}
