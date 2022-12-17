package program.String;

import java.util.ArrayList;

public class DuplicateCharactersString {
	public static void main(String[] args) {
		String inputString = "Today is Satarday!";
		printDuplicates(inputString);
	}
	public static void printDuplicates(String inputString) {
		int count = 0;
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0 ; i<inputString.length() ; i++) {
			char ch = inputString.charAt(i);
			// count the number of occurrences of the char ch in inputString
			for(int j =0; j<inputString.length();j++) {
				if(inputString.charAt(j) != ch) {
					continue;
				}
				count++;
			}
			 // check if we have already printed for ch
            if (!charList.contains(ch)) {
                // check if count is more than 1 i.e. duplicate and char should not be space
                if (count > 1 && ch != ' ') {
 
                    System.out.println("Char: " + ch + ", Count: " + count + " times.");
                    charList.add(ch);
                }
            }
 
            // set counter to zero for next ch
            count = 0;
        }
		
		
		
	}

}
