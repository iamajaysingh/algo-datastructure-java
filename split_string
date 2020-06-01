/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        //System.out.println(s.length()+"ddd");
        // Write your code here.
      if(! (s.trim().length()==0 || s.trim().isEmpty())){

         
        String[] arrOfStr = s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+");
        System.out.println(arrOfStr.length);
      
         for(int i=0 ; i < arrOfStr.length; i++){
             System.out.println(arrOfStr[i]);
         }

    }else {
    System.out.println(0);
    }
        scan.close();
    }
}

