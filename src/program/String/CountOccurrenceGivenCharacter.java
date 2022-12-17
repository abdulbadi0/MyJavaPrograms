package program.String;

public class CountOccurrenceGivenCharacter {
	public static void main(String[] args) {
		
		String str ="I am feeling happieeee.";
		char c= 'e';
		int count =0;
		for (int i = 0; i < str.length(); i++) {
		
			if (c != str.charAt(i)) {
				continue;
			}
			count++;
		}
		if (count>0) {
			System.out.println("Character c present "+count + " times.");
		}
	}

}
