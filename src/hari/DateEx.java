package hari;

import java.util.*;
import java.time.*;
public class DateEx {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("jsp","java","spring","android");
  String s=   list.stream().reduce((k1,k2)->k1+k2).get();
  System.out.println(s);
  
  LocalDate d=LocalDate.now();
  System.out.println(d);
  
  LocalDate dd=LocalDate.of(2023, 6, 1);
  
 int day= Period.between(d, dd).getDays();
 
  System.out.println(day);
  LocalTime d1=LocalTime.now();
  
  System.out.println(d1);
  
  LocalDateTime d2=LocalDateTime.now();
  System.out.println(d2);
	}

}
