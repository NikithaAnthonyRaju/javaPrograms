package stringProgram;

//Write a Java program to test if a given string contains the specified sequence of char values.

public class containsSequenceOfChar {

	public static void main(String[] args) {

		String original = "Java Program and exercises.";

		System.out.println("First Method: " + original.contains("and"));
		System.out.println("Second Metho: " + containSequenceOfCharProgram(original, "and"));
	}

	static boolean containSequenceOfCharProgram(String original, String word) {

		String[] split = original.split(" ");
		boolean yesOrNo = false;

		for (String a : split) {
			if (a.equals(word)) {
				yesOrNo = true;
			}
		}

		return yesOrNo;

	}

}
