package program.String;

public class ReverseString {
	public static void main(String[] args) {

		String input = "AZIZABitiya";
		String reverse = "";
		
		char ch[] = input.toCharArray();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		System.out.println(reverse);
		for (int i =ch.length-1;i>=0; i--) {
			System.out.print(ch[i]);
		}
		
	}
}
