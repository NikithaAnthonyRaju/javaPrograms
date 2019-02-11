package stringProgram;

//Write a Java program to check whether two String objects contain the same data. 

public class stringEquals {

	public static void main(String[] args) {

		String A = "Java";
		String B = "java";
		
		System.out.println("Using equals - " + A.equals(B));
		System.out.println("Using equalsIgnoreCase - " + A.equalsIgnoreCase(B));

	}

}
