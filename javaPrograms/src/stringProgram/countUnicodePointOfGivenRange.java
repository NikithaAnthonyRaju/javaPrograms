package stringProgram;

//Write a java program to count a number of Unicode code points in the specified text range of a String.

public class countUnicodePointOfGivenRange {

	public static void main(String[] args) {

		String word = "java.com";

		System.out.println(word.codePointCount(0, 1));
		System.out.println(word.codePointCount(0, word.length()));

	}

}
