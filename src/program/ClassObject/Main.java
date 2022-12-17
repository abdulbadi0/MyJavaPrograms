package program.ClassObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
	// check the exception condition
	public void checkLanguage(String language) throws CustomCheckedException {
		// throw exception if language already present in ArrayList
		if (languages.contains(language)) {
			throw new CustomCheckedException(language + " Already Exist.");
		}   
		else {
			// insert language to ArrayList
		      languages.add(language);
		      System.out.println(language + " is added to the ArrayList");
		    }
		}
	
	public static void main(String[] args) {
		Main obj = new Main();
		System.out.println(languages);
		try {
		
			obj.checkLanguage("Swift");
			obj.checkLanguage("Java");
			
		} catch (CustomCheckedException e) {
			e.printStackTrace();
		}finally {
			System.out.println(languages);
		}
		
	}
	

}
