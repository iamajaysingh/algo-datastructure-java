package comparable_comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie arg0, Movie arg1) {
		// TODO Auto-generated method stub
		
		if(arg0.getRatng() > arg1.getRatng()) return 1;
		
		else if(arg0.getRatng() < arg1.getRatng()) return -1;
		
		else
		return 0;
	}
	
	

}
