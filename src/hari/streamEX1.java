package hari;
import java.util.*;
import java.util.stream.Collectors;
public class streamEX1 {
    public static void main(String[] args) {
		List<String> list=Arrays.asList("java","python","c","Android","jsp");
        list.stream().reduce((k1,k2)->k1.concat(k2)).ifPresent(c->System.out.println(c));
       String s= list.stream().reduce((k,kk)->k.concat(kk)).get();
      String s2= list.stream().max((s1,ss)->s1.compareTo(ss)).get();
       //java p p p p
       System.out.println(s);
       System.out.println(s2);
       
     Map<String,String> m= list.stream().distinct().collect(Collectors.toMap(a->a, a->a+" program"));
       Optional op=Optional.of(list);
       op.ifPresent(c->System.out.println(c+ " program"));
       
       
       Optional<String> op1=Optional.ofNullable("java");
       System.out.println(op1.isPresent());;
       op1.ifPresent(S->System.out.println(S.length()));
       System.out.println(m);
       
	}

}
