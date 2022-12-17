package program.Array;

public class LargestElementArray {
public static void main(String[] args) {
	double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
    
	double largest = numArray[0];
	double smallest = numArray[1];
	for (double d : numArray) {
		if (d>largest) {
			largest = d;
		}
	}
	System.out.println("The largest is: "+largest);
	for (int i = 0; i < numArray.length; i++) {
		if (numArray[i]<smallest) {
			smallest=numArray[i];
		}
	}
	System.out.println("The smallest is: "+smallest);
}
}
