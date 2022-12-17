package program.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate_over_set {
public static void main(String[] args) {
	// Creating an set
    Set<String> languages = new HashSet<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("Set: " + languages);
 // Using forEach loop
    System.out.println("Iterating over Set using for-each loop:");
   
    for (String string : languages) {
		System.out.print(string);
		System.out.print(" ,");
	}
    
 // Creating an instance of Iterator
    Iterator<String> iterate = languages.iterator();
    System.out.println("\nIterating over Set:");
    while(iterate.hasNext()) {
      System.out.print(iterate.next() + ", ");
    }
    
}
}
