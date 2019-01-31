package arrayProgram;

//ArraySort
import java.util.*;

public class arraySort {
	public static void main(String args[]) {

		int intArray[] = { 4, 3, 1, 2, 5 };
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));

		String stringArray[] = { "B", "C", "A", "F", "D" };
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));

	}
}