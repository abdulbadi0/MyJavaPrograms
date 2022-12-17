package program.String;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {
		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// create random string builder
		StringBuilder sb = new StringBuilder();
		// create an object of Random class
		Random rd = new Random();
		// specify length of random string
		int length = 5;

		for (int i = 0; i < length; i++) {
			// generate random index number
			int index = rd.nextInt(alphabet.length());
			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);
			// append the character to string builder
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		System.out.println("Random String is : " + randomString);
		System.out.println("Random String Lower case is : " + randomString.toLowerCase());

		// create a string of uppercase and lowercase characters and numbers
		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		// combine all strings
		String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

		StringBuilder sb1 = new StringBuilder();
		// create an object of Random class
		Random rd1 = new Random();
		// specify length of random string
		int alphaNumericlength = 10;

		for (int i = 0; i < alphaNumericlength; i++) {
			int index1 = rd1.nextInt(alphaNumeric.length());

			// get character specified by index
			// from the string
			char randomCharNumber = alphaNumeric.charAt(index1);
			// append the character to string builder
			sb1.append(randomCharNumber);
		}
		String randomalphaNumericString = sb1.toString();
		System.out.println("Random randomalphaNumericString is: " + randomalphaNumericString);
		System.out.println("Random randomalphaNumericString is: " + randomalphaNumericString.toLowerCase());

	}

}
