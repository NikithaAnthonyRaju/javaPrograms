package arrayProgram;

import java.util.Arrays;

//Reverse an array of integer values
public class reverseAnArray {
	
	public static void main(String[] args) {

		int[] arr = { 12, 13, 14, 15, 16, 17 };
		
		System.out.println(arr.length);

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

			System.out.println(Arrays.toString(arr));
		}
	}
}
