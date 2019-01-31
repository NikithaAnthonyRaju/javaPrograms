package arrayProgram;

import java.util.*;

public class arrayListToArray {
	
	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		Object[] array = ls.toArray();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		  List<String> list = new LinkedList<String>();
		  list.add("Python");		 
		  list.add("Java");		 
		  list.add("PHP");		  
		  list.add("C#");		 
		  list.add("C++");		  
		  list.add("Perl");
		 
		  String[]  my_array = new String[list.size()];
		  
		  list.toArray(my_array);
		  
		  for (String  string : my_array)
		  {
		  System.out.println(string);
		  }
	}

}
