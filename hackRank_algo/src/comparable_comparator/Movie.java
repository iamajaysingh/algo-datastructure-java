package comparable_comparator;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/* jAVA PROVIDE TO INTERFACE comparable or comparator. or
 *  A comparable object able to comparing itself with one another object means me can compare tow object of 
 * same class with the help of that we can sort multiple object as per name, rating */
public class Movie implements Comparable<Movie> {

	private double ratng;
	private String name;
	private int year;

	public Movie(double ratng, String name, int year) {
		super();
		this.ratng = ratng;
		this.name = name;
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = new ArrayList<Movie>();
		list.add( new  Movie(3.5,"m1",5)) ;
		list.add( new  Movie(9.6,"m4",4)) ;
		list.add( new  Movie(3.2,"m6",57)) ;
		list.add(new  Movie(3.5,"m1",5)) ;
		
		list.add(new  Movie(3.5,"m7",8)) ;
		list.add(new  Movie(2.5,"m9",10)) ;
		list.add(new  Movie(4.8,"m8",3)) ;
		list.add( new  Movie(4.5,"m2",6)) ;
		
		
		
		//Collections.sort(list);
		RatingCompare rc =new RatingCompare();
		Collections.sort(list,rc);
		
		for(Movie sortMovie : list)
			System.out.println(sortMovie.getName()+"++"+sortMovie.getYear());

	}

	public double getRatng() {
		return ratng;
	}

	public void setRatng(double ratng) {
		this.ratng = ratng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub

		return this.year - o.year;
	}

}
