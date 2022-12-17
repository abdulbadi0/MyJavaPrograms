package program.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayViceVersa {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("ABDUL");
	l1.add("Badi");
	l1.add("AlMuzahid");
	l1.add("Noorain");
	
	System.out.println(l1);
	
	String str[] = new String[l1.size()];
	l1.toArray(str);
	
	for (String string : str) {
		System.out.print(string + " ");
	}System.out.println();
	
	String[] array = {"Java", "Python", "C"};
    System.out.println("Array: " + Arrays.toString(array));
    
    List<String> languages = new ArrayList<>(Arrays.asList(array));
	System.out.println(languages);
}
}
