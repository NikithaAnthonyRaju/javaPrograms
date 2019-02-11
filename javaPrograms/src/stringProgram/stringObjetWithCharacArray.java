package stringProgram;

//Write a Java program to create a new String object with the contents of a character array.

public class stringObjetWithCharacArray {

	public static void main(String[] args) {

		// Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("The book contains " + str +" pages.\n");
        
//        This method returns a String that represents the character sequence in the array specified.
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("Returned String: " + Str2);

		 

	}

}
