package generalKnowledge;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTimeExample {
public static void main(String[] args) {
	//1st way
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	System.out.println(dtf.format(now));
	//2nd way
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	System.out.println(formatter.format(date));
	//3rd way
	System.out.println(java.time.LocalDate.now());
	System.out.println(java.time.LocalTime.now());
	System.out.println(java.time.LocalDateTime.now());
	//4th way
	System.out.println(java.time.Clock.systemUTC().instant());
	//5th way
	// creating a new object of the class Date  
    java.util.Date date1 = new java.util.Date();    
    System.out.println(date1);
    //6th way
    long millis=System.currentTimeMillis();  
    // creating a new object of the class Date  
    java.sql.Date date2 = new java.sql.Date(millis);       
    System.out.println(date2); 
    //7th way
    long milli = System.currentTimeMillis();  
    // creating a new object of the class Date  
    java.util.Date date3 = new java.util.Date(milli);      
    System.out.println(date3);   
    
}
}
