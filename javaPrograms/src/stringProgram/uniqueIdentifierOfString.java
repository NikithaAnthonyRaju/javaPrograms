package stringProgram;

public class uniqueIdentifierOfString {

	public static void main(String[] args) {

		String str = "Java Exercises.";

		// Get the hash code for the above string.
		int hash_code = str.hashCode();

		// Display the hash code.
		System.out.println("The hash for " + str + " is " + hash_code);

	}

}
