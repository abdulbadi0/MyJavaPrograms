package program.Math;

public class Math_MAX_MIN {
	public static void main(String[] args) {
		// create an array of int type
	    int[] arr = {4, 2, 5, 3, 6};
	    int max= arr[0];
	    int min = arr[1];
	    
	    for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}System.out.println("Max is: "+max);
		
		for (int number : arr) {
			min = Math.min(min, number);
		}System.out.println("Min is: "+min);
	}

}
