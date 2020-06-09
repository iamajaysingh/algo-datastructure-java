package hackRank_algo;

import java.math.*;
public class FIndDuplicate {
	
	//have to solve with 0(n) linear time  complexity or each index value should be less than size of array
	public static void findOutRepitition(int [] given) {
		
		
		/*if value is positive we have to flip value from positive to negative;*/
		for(int i= 0 ; i < given.length; i++)
			
			
			if(given[Math.abs(given[i])] > 0) {
		    
			given[Math.abs(given[i])] = -given[Math.abs(given[i])];
             }
			else {
				System.out.println("repitition value" + given[i]);
			}
		
	
	}

	
public static void findOutRepitition1(int [] given) {
	
	
		
		for(int i = 0 ; i< given.length ; i++) {
			
			for( int j = 0; i <given.length ; j++) {
				
				if(given[i]!=given[j])
					System.out.println("repitition value" + given[i]);
					break;
			}
			
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given[]= {1,2,3,3,2};
		
		//findOutRepitition(given);
		findOutRepitition1(given);

	}

}
