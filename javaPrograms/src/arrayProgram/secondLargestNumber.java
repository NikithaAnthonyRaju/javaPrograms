package arrayProgram;

import java.util.Arrays;

public class secondLargestNumber {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 88, 77 };

		Arrays.sort(arr);
		System.out.println("Using Array; " + arr[arr.length - 2]);

	}

}
