package program.String;

public class CharacterCount {
	public static void main(String[] args) {
		
		String str = "Today is Interview day";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (c == ch[j]) {
					
					count++;
				}
			}
			if (count>0) {
				System.out.println(c + " times "+count);
			}
		}
		
	}

}
