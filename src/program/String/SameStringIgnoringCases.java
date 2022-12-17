package program.String;

public class SameStringIgnoringCases {
	public static void main(String[] args) {
		String firstString = "Today is Satrday!";
		String secondString = "today Is satrDay!";
		
		System.out.println(firstString.equals(secondString));// false
		System.out.println(firstString.equalsIgnoreCase(secondString));//true
		
	}

}
