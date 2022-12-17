package program.Functions;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int number = 10;
		int result = findFactorials(number);
		System.out.println("Factorial is : " + result);
	}

	public static int findFactorials(int number) {
		if (number == 0) {
			return 1;
		}else {
			return number * findFactorials(number - 1);
		}
	}

}
