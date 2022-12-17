package program.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArraytoSetHashSetandViceVersa {
public static void main(String[] args) {
	String[] array = {"a", "b", "c"};
    Set<String> set = new HashSet<>(Arrays.asList(array));

    System.out.println("Set: " + set);

    Set<String> set1 = new HashSet<>();
    set1.add("a");
    set1.add("b");
    set1.add("c");
   
    String s[] = new String[set1.size()];
    set1.toArray(s);
    for (String string : s) {
		System.out.print(string+ " ");
	}System.out.println();
}
}
