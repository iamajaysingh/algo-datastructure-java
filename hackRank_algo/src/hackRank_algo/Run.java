/**
 * 
 */
package hackRank_algo;

import java.util.Arrays;
import java.util.*;

/**
 * @author iamaj
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String subString ="";
		String lowest ="";
		String higher ="";
		int k = 3;
		String s = "fgwelcometojava";
		for(int i = 1 ; i < s.length()-k ; i++) {
			
			 subString = s.substring(i,i+k);//1,4# 2,5
			 System.out.println("===higg=="+subString);
			 //System.out.println(subString);
			 if(i==1) {
				 lowest =subString;
			 }
			 if(subString.compareTo(lowest) < 0) {
				 lowest = subString ;
				
			 }else if(subString.compareTo(higher) > 0) {
				 higher = subString ;
				
				
			 }
			
			
		}
		 System.out.println("===higg=="+higher);*/
		
		String s ="hello ajay singh";
		      
		  char[] charArray =s.toCharArray();
		  
		  Arrays.sort(charArray);
		  
System.out.println(new String(charArray)  );

String inputString = "I am ajay singh";



// convert input string to Character array 
Character tempArray[] = new Character[inputString.length()]; 
for (int i = 0; i < inputString.length(); i++) { 
    tempArray[i] = inputString.charAt(i); 
} 
  
  
// Sort, ignoring case during sorting 
Arrays.sort(tempArray, new Comparator<Character>(){ 

    @Override
    public int compare(Character c1, Character c2) 
    { 
        // ignoring case 
        return Character.compare(Character.toLowerCase(c1), 
                                Character.toLowerCase(c2)); 
    } 
}); 
  
// using StringBuilder to convert Character array to String 
StringBuilder sb = new StringBuilder(tempArray.length); 
for (Character c : tempArray) 
    sb.append(c.charValue()); 

  
	}

}
