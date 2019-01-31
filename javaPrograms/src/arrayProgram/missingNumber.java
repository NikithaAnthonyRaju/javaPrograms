package arrayProgram;

//Write a Java program to find a missing number in an array
public class missingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };

		System.out.println(seriesNumber(arr));
		
//		Below function is still count 7
		int total_num;
		   int[] numbers = new int[]{1,2,3,5,6,7};
		   total_num = 7;
		   int expected_num_sum = total_num * ((total_num + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		       System.out.print( expected_num_sum - num_sum);
			   System.out.print("\n");

	}

	static int seriesNumber(int[] arr) {

		int i = 1;
		int missingNo = 0;

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != i) {

				missingNo = i;
				break;
			}

			i++;
		}

		return missingNo;
	}
	
	
}
