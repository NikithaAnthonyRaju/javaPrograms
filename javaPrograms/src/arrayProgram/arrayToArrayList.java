package arrayProgram;

import java.util.*;

public class arrayToArrayList {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(arr));

		for(int[] ls: arrayList) {
			System.out.println(ls);
		}


		String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
		ArrayList<String> list = new ArrayList<>(Arrays.asList(my_array));

		System.out.println(list);

	}

}
