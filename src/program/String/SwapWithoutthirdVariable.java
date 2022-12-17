package program.String;

public class SwapWithoutthirdVariable {
	public static void main(String[] args) {
		String first = "One";
		String second = "Two";
		first = first + second;
		second = first.substring(0,first.length()-second.length());
		first = first.substring(second.length());
		
		System.out.println(first);//Two
		System.out.println(second);//One
	}

}
