package stringProgram;

//Write a Java program to get the character at the given index within the String.

public class characterAtGivenIndex {

	public static void main(String[] args) {

		String word = "StringProgram";

		System.out.println(characterAtGivenIndexProgram(word, 16));

	}

	static char characterAtGivenIndexProgram(String word, int length) {

		char charAt = 0;

		if (word.length() > 0 && length < word.length()) {
			charAt = word.charAt(length);
		} else {
			System.out.println("condition is not satisfied");
		}

		return charAt;
	}

}
