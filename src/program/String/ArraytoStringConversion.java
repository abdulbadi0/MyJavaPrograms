package program.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraytoStringConversion {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 4;
		arr[1] = 49;
		arr[2] = 94;
		arr[3] = 40;
		arr[4] = 14;

		String[] stringArray = { "My", "name", "is", "ABD", "!" };

		String result = covertArrayToString_using_toString(arr);
		System.out.println("covertArrayToString_usingt_oString: " + result);
		String result1 = covertArrayToString_using_StringBuilderAppend(arr);
		System.out.println("covertArrayToString_using_StringBuilderAppend: " + result1);
		String result2 = covertArrayToString_using_StringJoin(stringArray);
		System.out.println("covertArrayToString_using_StringJoin: " + result2);
		String result3 = covertArrayToString_using_Cllectorsjoining(stringArray);
		System.out.println("covertArrayToString_using_Cllectorsjoining: " + result3);

	}

	static String covertArrayToString_using_toString(int[] arr) {
		return Arrays.toString(arr);
	}

	static String covertArrayToString_using_StringBuilderAppend(int[] arr) {
		StringBuilder strbuild = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			strbuild.append(arr[i] + " ");
		}
		return strbuild.toString();
	}

	static String covertArrayToString_using_StringJoin(CharSequence[] arr) {
		String str = String.join(" ", arr);
		return str;
	}

	static String covertArrayToString_using_Cllectorsjoining(String[] StringArray) {
		String str = Arrays.stream(StringArray).collect(Collectors.joining());
		return str;
	}

}
