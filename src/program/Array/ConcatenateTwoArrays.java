package program.Array;

import java.util.Arrays;

public class ConcatenateTwoArrays {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int length = array1.length + array2.length;
		int result[] = new int[length];

		int position = 0;
		for (int element : array1) {
			result[position] = element;
			position++;
		}
		for (int element : array2) {
			result[position] = element;
			position++;
		}
		/*
		 * for (int element = 0; element < array2.length; element++) { result[position]
		 * = element; position++; }
		 */
		System.out.println(Arrays.toString(result));
	}
}
