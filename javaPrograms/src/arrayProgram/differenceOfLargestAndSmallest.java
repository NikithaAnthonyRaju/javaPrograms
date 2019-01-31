package arrayProgram;

import java.util.Arrays;

//Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.

public class differenceOfLargestAndSmallest {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 89, 99, 89 };

		if (arr.length > 1) {
			Arrays.sort(arr);

			System.out.println("Array after sorted: " + Arrays.toString(arr));

			int differences = arr[arr.length - 1] - arr[0];

			System.out.println("Difference between the largest and smallest values = " + differences + " or "
					+ (arr[arr.length - 1] - arr[0]));
		} else {
			
			System.out.println("Array length is lesser than 1.");
		}
	}

}
