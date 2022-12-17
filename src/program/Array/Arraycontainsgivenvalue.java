package program.Array;

public class Arraycontainsgivenvalue {
public static void main(String[] args) {
	int[] num = {1, 2, 3, 4, 5};
    int khojo = 3;
    boolean mila = false;
    
    for (int i = 0; i < num.length; i++) {
		if (khojo == num[i]) {
			mila = true;
			break;
		}
	}
    if (mila) {
		System.out.println("khoj liya: "+khojo);
	}
    
}
}
