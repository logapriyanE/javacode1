package hari;
import java.util.*;
class Hi{
	public Hi() {System.out.println("1");}
	public Hi(String movie, String actor) {
		System.out.println(movie+" 1"+actor);
	}
	
}
class Hi1 extends Hi{

	
	 public Hi1() {
		 super("ram","abi");
		System.out.println(" 2 ");
		//System.out.println(actor+" 2 ");
	}
	
	
}

public class MapTask {

	public static void main(String[] args) {
		Hi1 ob=new Hi1();
		


	}

}
