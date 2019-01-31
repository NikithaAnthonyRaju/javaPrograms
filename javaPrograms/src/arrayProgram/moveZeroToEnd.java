package arrayProgram;

import java.util.Arrays;

//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

public class moveZeroToEnd {

	public static void main(String[] args) {

		int[] arr = { 0, 55, 0, 1, 0, 0, 2, 0, 3, 4, 6, 0, 8, 9 };

		int length = arr.length;
		int count = 0;
		System.out.println(Arrays.toString(arr));
		
//		assign values to right
		for (int i = 0; i < length; i++) {
			System.out.println("Count value: " + count);
			System.out.println("arr[" + i + "]: " + arr[i]);
			if (arr[i] != 0) {
				arr[count++] = arr[i];
				System.out.println(Arrays.toString(arr));
			}
		}

//		assigning 0 to right
		while (count < length) {
			System.out.println("Count value:------- " + count);
			arr[count++] = 0;
			System.out.println(Arrays.toString(arr));

		}

		System.out.println(Arrays.toString(arr));

	}

}
