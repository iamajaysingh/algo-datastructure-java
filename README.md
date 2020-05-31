# algo-datastructure-java
/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0 */

anagram
margana


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
     String aLower     =   a.toLowerCase();
     String bLower     =   b.toLowerCase();
     boolean result = true;
     int count[] = new int[256];

        if(aLower.length()!=bLower.length())
        return result =false;

        for( int i=0; i< aLower.length(); i++){
            count[aLower.charAt(i)]++;
            count[bLower.charAt(i)]--;
           // System.out.println(count[a.charAt(i)]+"fsdf"+count[b.charAt(i)] );
        }

        for(int j=0; j <256; j++ ){
        if(count[j]!=0)
            return result = false;
    }

return result;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
