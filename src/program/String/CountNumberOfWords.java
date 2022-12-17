package program.String;

import java.util.StringTokenizer;

public class CountNumberOfWords {
	public static void main(String[] args) {
		String inputString = "Arise! Awake! and stop not until the goal is reached.";
		System.out.println("Original String length: " + inputString.length());
		System.out.println("countsWordusingSplit: " + countsWordusingSplit(inputString));
		System.out.println("countsWordusingStringTokenizer:" + countsWordusingStringTokenizer(inputString));
		System.out.println("Custom menthod used:" + countWords(inputString));
	}

	public static int countsWordusingStringTokenizer(String inputString) {
		StringTokenizer st = new StringTokenizer(inputString);
		return st.countTokens();
	}

	public static int countsWordusingSplit(String inputString) {
		String[] strArray = inputString.split("\\s+");
		return strArray.length;
	}

	// custom method to count the words from the string
	public static int countWords(String inputString) {

		int wordCount = 0;
		int endOfString = inputString.length() - 1;

		String str = inputString.trim(); // making sure that string should not have any spaces at the starting and
											// ending
		for (int i = 0; i < inputString.length(); i++) {

			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {

				wordCount++;

			} else if (str.charAt(i) == ' ' && str.charAt(i++) == ' ') { // if there is more than one space in between
																			// string

				i++;

			} else if (i == endOfString) { // matching the first missing word

				wordCount++;
			}
		}
		return wordCount;

	}

}
