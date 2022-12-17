package program.String;

public class CleartheStringBuffer {
	public static void main(String[] args) {
		// create a string buffer
		StringBuffer str = new StringBuffer();

		// add string to string buffer
		str.append("Java");
		str.append(" is");
		str.append(" popular.");
		System.out.println("StringBuffer: " + str);
		// clear the string
		// using delete()
		// str.delete(0, str.length());
		// clear the string
		// using setLength()
		// str.setLength(0);
		// clear the string
		// using new
		// here new object is created and assigned to str
		str = new StringBuffer();
		System.out.println("Updated StringBuffer: " + str);
}
}
