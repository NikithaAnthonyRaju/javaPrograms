package stringProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

//Write a java program to print current date and time in the specified format.

public class printCurrentDate_Time {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, YYYY");
		SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("h:m a");
		
		Date date = new Date();
		
		System.out.println(simpleDateFormat.format(date));
		System.out.println(simpleTimeFormat.format(date));
	}

}
