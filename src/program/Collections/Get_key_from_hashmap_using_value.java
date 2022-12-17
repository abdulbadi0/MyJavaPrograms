package program.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Get_key_from_hashmap_using_value {
	public static void main(String[] args) {
		// create a hashmap
		HashMap<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Four", 3);
		numbers.put("Oe", 4);
		numbers.put("Two", 5);
		numbers.put("Three", 6);
		System.out.println("HashMap: " + numbers);

		Integer value = 4;
		String ke = "One";

		for (Map.Entry<String, Integer> element : numbers.entrySet()) {

			if (element.getKey() == ke) {
				System.out.println(element.getValue());
				break;
			}

		}
		for (Map.Entry<String, Integer> element : numbers.entrySet()) {

			if (element.getValue() == value) {
				System.out.println(element.getKey());
				break;
			}

		}

		// entry.getValue() - get value from the entry
		// entry.getKey() - get key from the entry

	}
}
