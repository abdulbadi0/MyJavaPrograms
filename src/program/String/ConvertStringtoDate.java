package program.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringtoDate {
	public static void main(String[] args) {
		String string ="2022-12-17";
		LocalDate date= LocalDate.parse(string,DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		
		String string1 ="December 12, 2023";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH);
		LocalDate date1 = LocalDate.parse(string1,formatter);
		System.out.println(date1);
	}

}
