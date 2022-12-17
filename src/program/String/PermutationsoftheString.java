package program.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PermutationsoftheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String data = sc.nextLine();
		System.out.println("Permutations of entered String " + data + " is: \n" + getPermutations(data));
		sc.close();
	}

	public static Set<String> getPermutations(String str) {

		// create a set to avoid duplicate permutation
		Set<String> permutations = new HashSet<String>();
		// check if string is null
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			// terminating condition for recursion
			permutations.add("");
			return permutations;
		}
		// get the first character
		char first = str.charAt(0);
		// get the remaining substring
		String sub = str.substring(1);
		// make recursive call to getPermutation()
		Set<String> words = getPermutations(sub);
		// access each element from words
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				// insert the permutation to the set
				permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
			}
		}
		return permutations;
	}

}
