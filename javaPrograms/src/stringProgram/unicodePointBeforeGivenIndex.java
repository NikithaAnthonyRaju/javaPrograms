package stringProgram;

//Write a Java program to get the character (Unicode code point) before the specified index within the String.

public class unicodePointBeforeGivenIndex {

	public static void main(String[] args) {

		String word = "java.com";


		System.out.println(word.codePointBefore(1));
		System.out.println(word.codePointBefore(5));

	}

}
