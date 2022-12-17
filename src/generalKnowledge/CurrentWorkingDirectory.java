package generalKnowledge;

public class CurrentWorkingDirectory {
	public static void main(String[] args) {
		
		String str = System.getProperty("user.dir");
		System.out.println(str);
		
		System.out.println(System.getProperty("user.dir"));
		
	}

}
