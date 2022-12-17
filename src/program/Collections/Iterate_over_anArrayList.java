package program.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterate_over_anArrayList {
	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Python");
		System.out.println("ArrayList: " + languages);

		System.out.println("Iterating through for Loop: ");
		for (int i = 0; i < languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		System.out.println("Iterating through forEach Loop: ");
		for (String element : languages) {
			System.out.print(element);
			System.out.print(", ");
		}System.out.println();
		System.out.println("Iterating through ListIterator: ");

		ListIterator<String> litr = languages.listIterator();

		while (litr.hasNext()) {
			System.out.print(litr.next() + ", ");
		}

	}
}
