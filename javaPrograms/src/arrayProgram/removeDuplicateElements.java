package arrayProgram;

import java.util.Arrays;

public class removeDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique_array(new int[] { 4, 4, 4, 5, 6, 6, 6 });
	}

	static void unique_array(int[] my_array) {
		System.out.println("Original Array : ");

		for (int i = 0; i < my_array.length; i++) {
			System.out.print(my_array[i] + "\t");
		}

		// Assuming all elements in input array are unique

		int no_unique_elements = my_array.length;

		// Comparing each element with all other elements

		for (int i = 0; i < no_unique_elements; i++) {
			for (int j = i + 1; j < no_unique_elements; j++) {
				// If any two elements are found equal

				if (my_array[i] == my_array[j]) {
					// Replace duplicate element with last unique element

					my_array[j] = my_array[no_unique_elements - 1];

					no_unique_elements--;

					j--;
				}

				System.out.println(Arrays.toString(my_array));
			}

			System.out.println(Arrays.toString(my_array));
		}

		// Copying only unique elements of my_array into array1

		int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

		// Printing arrayWithoutDuplicates

		System.out.println();

		System.out.println("Array with unique values : " + Arrays.toString(array1));

	}

}
