package arrayProgram;

import java.util.Arrays;

//Write a Java program to copy an array by iterating the array.

public class copyArrayAndIterate {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
