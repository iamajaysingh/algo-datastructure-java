# algo-datastructure-java
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        boolean result = true;

        int count[] = new int[256];

        for( int i=0; i< a.length(); i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for(int j=0; j <256; j++ ){
        if(count[j]!=0){
        result = false;
        }
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
