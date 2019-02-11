package stringProgram;

//Write a Java program to check whether a given string ends with the contents of another string. 

public class stringEndsWith_StartsWith {

	public static void main(String[] args) {

			String ABC = "Alphbets";
			System.out.println(ABC.endsWith("et"));
			System.out.println(ABC.endsWith("ets"));
			
			System.out.println(ABC.startsWith("Al"));
			System.out.println(ABC.startsWith("al"));
			
	}

}
