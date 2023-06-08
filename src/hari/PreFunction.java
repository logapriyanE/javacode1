package hari;
import java.util.function.*;

public class PreFunction {
	public static void main(String args[]) {
	Predicate<String> a=x->x.equals("java");
	System.out.println(a.test("java"));
	BiPredicate<String,String> b=(x,y)->x.equals(y);
	System.out.println(b.test("loga","java"));
	Function<String,Integer> c=s->s.length();
	System.out.println(c.apply("logAPRIYAN"));
	BiFunction<String,String,Integer> d=(x,y)->x.length()+y.length();
	System.out.println(d.apply("loga", "hari"));
	Consumer<String> e=s->System.out.println(s.concat("Priyan")); ;
	e.accept("LOGA");
	BiConsumer<String,Integer> f=(x,y)->System.out.println(x+":"+y);
	f.accept("Aravinth", 123);
	Supplier<Integer> g=()->{int a1=10,b1=20;return a1+b1;};
	System.out.println(g.get());
	UnaryOperator<String> h=x-> x+"void";
	System.out.println(h.apply("Static"));
	BinaryOperator<Integer> i=(x,y)->x/y;
	System.out.println(i.apply(40, 5));
	
	}
}
