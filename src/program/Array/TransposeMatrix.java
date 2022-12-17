package program.Array;

public class TransposeMatrix {
public static void main(String[] args) {
	int row=2,column=3;
	int matrix[][] = {{2,3,4},{5,6,7}};
	
	System.out.println("It is given Matrix");
	displayMatrix(matrix);
	
	int transpose[][]= new int[column][row];
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			transpose[j][i] = matrix[i][j];
		}
		
	}
	System.out.println("It is Transpose now");
	displayMatrix(transpose);
}

public static void displayMatrix(int[][] matrix) {
	for (int[] row : matrix) {
		for (int column : row) {
			System.out.print(column + " ");
		}System.out.println();
	}
	
}
}
