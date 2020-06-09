package hackRank_algo;

import java.util.Arrays;
import java.util.Random;

/*Interview Question #4:

Our task is to design an algorithm thats capable of selecting k items 
from an array! The problem is that the n size of the array is unknown (or infinitely large)!

Solution: we can solve this problem with the so-called reservoir sampling algoirthm! Check it out!*/

public class Question4 {

	public static void reservoir(int given[], int n, int k) {

		int reservoir[] = new int[k];
		for (int i = 0; i < k; i++)
			reservoir[i] = given[i];

	
		
		for (int j = k + 1; j < n; j++) {

			Random rans = new Random();
			int m = rans.nextInt(j + 1);
			if (m < k) {
				System.out.println("reservoir string" + m + "ajay singh" + k);
				reservoir[m] = given[j];

			}
		}

		System.out.println("reservoir string" + Arrays.toString(reservoir));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		int k = 5;
		int n = num.length;

		reservoir(num, n, k);

	}

}
