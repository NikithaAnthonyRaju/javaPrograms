package arrayProgram;

import java.util.Arrays;

public class removeAnElement {

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
		String[] arr = {"A", "B", "C", "D"};
		int indexNo = 0;
		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == 1) {
			if(arr[i] == "A") {
				indexNo = i;
			}
		}
		System.out.println(indexNo);
		
		// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice

		for(int j=indexNo; j<arr.length-1; j++) {
			arr[j] = arr[j+1];
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

	}

}
