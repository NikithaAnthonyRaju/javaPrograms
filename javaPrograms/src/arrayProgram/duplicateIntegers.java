package arrayProgram;

import java.util.*;

//Write a Java program to find the duplicate values of an array of integer values.

public class duplicateIntegers {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 11, 22 };
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Value: " + arr[i]);
				}
			}
		}
		
		
//		Set<Integer> set = new HashSet<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (!set.add(arr[i])) {
//				System.out.println("Duplicate Value: " + arr[i]);
//			} else {
//				set.add(arr[i]);
//				System.out.println("No Duplicates");
//			}
//		}
	}
}
