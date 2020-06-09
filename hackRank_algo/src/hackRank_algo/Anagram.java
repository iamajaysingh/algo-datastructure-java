package hackRank_algo;
import java.util.regex.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Pattern pss = Pattern.compile(arg0);
		    pss.flags();

		String A = "ajay";
		String B = "atya";
		/*here we are replacing white space */
		String aOP = A.replaceAll("\\s+", "").toLowerCase();
		String bOP = B.replaceAll("\\s+", "").toLowerCase();
		System.out.println("result" + aOP);
		boolean result = false;
		int sizeA = aOP.length();
		int sizeB = bOP.length();
		// char[] temp = new char[sizeA-1];
		if (sizeA == sizeB) {

			for (int i = 0; i < sizeA; i++)
				for (int j = 0; j < sizeB; j++) {
					if (aOP.charAt(i) == bOP.charAt(j))
						result = true;
				}
		}

		System.out.println("result" + result);

	}

}
