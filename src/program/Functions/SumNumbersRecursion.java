package program.Functions;

public class SumNumbersRecursion {
//Sum of Natural Numbers using Recursion
	public static void main(String[] args) {
		int number = 20;
		int result = addNumber(number);
		System.out.println("Sum: "+ result);
	}

	public static int addNumber(int number) {

		if (number != 0) {
			return number + addNumber(number - 1);
		} else {
			return number;
		}
	}
}
