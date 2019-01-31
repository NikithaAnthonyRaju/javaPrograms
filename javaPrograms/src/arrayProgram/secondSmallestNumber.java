package arrayProgram;

import java.util.Arrays;

public class secondSmallestNumber {

	public static void main(String[] args) {

		double arr[] = { 0, 0.1, 2, 3, 4, 88, 77 };

		Arrays.sort(arr);
		System.out.println("Using Array: " + arr[arr.length - (arr.length - 1)]);

	}

}
