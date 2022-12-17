package program.String;

public class ReverseWordsfromSentence {
	public static void main(String[] args) {
		String inputString = "Arise! Awake! and stop not until the goal is reached";
		String outputString = reverseWordsFromString(inputString);
		System.out.println("The string with the original word is : \n" + inputString);
		System.out.println("The string with the reversed word is : \n" + outputString);
	}

	public static String reverseWordsFromString(String inputString) {
		String array[] = inputString.split("\\s+");
		String reverse = "";
		for (String string : array) {
			reverse = reverse + reverseWord(string) + " ";
		}
		return reverse.trim();
	}

	public static String reverseWord(String string) {

		String reverseWord = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + string.charAt(i);
		}
		return reverseWord;
	}

}
