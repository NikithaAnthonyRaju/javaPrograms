package arrayProgram;

import java.util.Arrays;

//Write a Java program to compute the average value of an array of integers except the largest and smallest values.

public class averageValueExpectLargestAndSmallestValues {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 89, 99, 89 };

		Arrays.sort(arr);

		System.out.println("Array after sorted: " + Arrays.toString(arr));
		
		int sum = 0;
		for(int i=1; i<arr.length-1; i++) {
			sum = sum + arr[i];
		}

		int length = arr.length - 2;

		System.out.println("Average value expect largest and smallest values = " + sum/length);
		
		
		System.out.println("****************** 2nd method *********************");
		
		int[] array_nums = {5, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max = array_nums[0];
		int min = array_nums[0];
		float sum1 = array_nums[0];
		for(int i = 1; i < array_nums.length; i++)
		{
			sum1  += array_nums[i];
			if(array_nums[i] > max)
				max = array_nums[i];
			else if(array_nums[i] < min)
				min = array_nums[i];
		}
		float x = ((sum1-max-min) / (array_nums.length - 2));
		System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f",x);
		System.out.print("\n");	
		
		
	}

}
