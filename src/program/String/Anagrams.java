package program.String;

import java.util.Arrays;

public class Anagrams {
public static void main(String[] args) {
	String str1 ="Listen";
	String str2 = "Silent";
	System.out.println(checkAnagrams(str1,str2));
	
}
public static boolean checkAnagrams(String str1, String str2) {
	char ch1[] = str1.toLowerCase().toCharArray();
	char ch2[] = str2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	return Arrays.equals(ch1, ch2);
}
}
