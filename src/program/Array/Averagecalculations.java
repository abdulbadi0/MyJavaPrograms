package program.Array;

public class Averagecalculations {
public static void main(String[] args) {
	double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
    double sum = 0.0;
    for (double d : numArray) {
		sum = sum +d;
	}
    System.out.println("Total Sum is: " + sum);
    double average = sum/numArray.length;
    System.out.println("Average is: " +average);
}
}
