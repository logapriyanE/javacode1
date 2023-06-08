package hari;
import java.util.*;
import java.util.stream.*;
class Movie{
	private String movie;
	private String actorname;
	private int releaseyear;
	private int rating;
	public Movie(String movie, String actorname, int releaseyear,int rating) {
		this.movie = movie;
		this.actorname = actorname;
		this.releaseyear = releaseyear;
		this.rating=rating;
	}
	public String toString() {
		return "Movie [movie=" + movie + ", actorname=" + actorname + ", releaseyear=" + releaseyear + ", rating=" + rating+"]";
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating=rating;
	}
	
}
public class PreFunctionTask2 {

	public static void main(String[] args) {
		List<Movie> list=new ArrayList<>();
		list.add(new Movie("singam","suriya",2007,7));
		list.add(new Movie("varisu","vijay",2023,6));
		list.add(new Movie("Maveeran","ramcharan",2009,9));
		list.add(new Movie("vikram","kamal",2022,8));
		list.add(new Movie("doctor","sivakarthigayan",2021,10));
		list.stream().filter(c->c.getReleaseyear()==2021).forEach(System.out::println);
		list.stream().filter(c1->c1.getReleaseyear()==2021).map(Movie::getMovie).forEach(System.out::println);
		// collect 
		list.stream().map(Movie::getMovie).collect(Collectors.toList()).forEach(System.out::println);
		String allMovie=list.stream().map(Movie::getMovie).collect(Collectors.joining(","));
		System.out.println(allMovie);
		list.stream().collect(Collectors.groupingBy(Movie::getActorname)).forEach((k,v)->System.out.println("key="+k+"  {---}value="+v));
		Double av=list.stream().collect(Collectors.averagingInt(Movie::getRating));
		System.out.println(av);
		list.stream().collect(Collectors.partitioningBy(m->m.getRating()>=8)).forEach((k1,v1)->System.out.println(k1+" "+" "+v1));
		
	}

}
