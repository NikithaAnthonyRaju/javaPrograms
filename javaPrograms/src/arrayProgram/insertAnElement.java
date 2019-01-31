package arrayProgram;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array

public class insertAnElement {

	public static void main(String[] args) {
		
		int indexNo = 5;
		int elementToInsert = 9;
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1; i>indexNo; i--) {
			arr[i] = arr[i-1];
		}
				
		arr[indexNo] = elementToInsert;
		System.out.println(Arrays.toString(arr));
	}

}
