package stringProgram;

//Write a Java program to get the character (Unicode code point) at the given index within the String.

public class unicodePointAtGivenIndex {

	public static void main(String[] args) {

		String word = "java.com";

//		The java.lang.String.codePointAt() method returns the character (Unicode code point) at the specified index. 
		System.out.println(word.codePointAt(0));
		System.out.println(word.codePointAt(5));

	}

}
