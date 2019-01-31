package arrayProgram;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.

public class forwardReplicationOfAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(arr));

		int temp = 0;
		int i=0;
		

		while (i < arr.length-1) {
			int j = 0;
			temp = arr[j];
			while (j < arr.length-1) {
				arr[j] = arr[j + 1];
//				System.out.println(Arrays.toString(arr));
				j++;
			}
			System.out.println("Before - " + arr[arr.length-1]);
			arr[arr.length-1] = temp;
			System.out.println("After - " + arr[arr.length-1]);
			
			i++;

			System.out.println(Arrays.toString(arr));
		}

		System.out.println(Arrays.toString(arr));

	}

}
