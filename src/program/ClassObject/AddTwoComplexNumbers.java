package program.ClassObject;

public class AddTwoComplexNumbers {
	//Java Program to Add Two Complex Numbers by Passing Class to a Function
	
	double real;
	double imag;
	public AddTwoComplexNumbers(double r, double i) {
		this.real =r;
		this.imag = i;
		
	}
public static void main(String[] args) {
	AddTwoComplexNumbers obj1 = new AddTwoComplexNumbers(23.01, 45.43),
	obj2 = new AddTwoComplexNumbers(23.01, 45.43);
	AddTwoComplexNumbers temp;
	temp = add(obj1,obj2);
	System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
}
public static AddTwoComplexNumbers add(AddTwoComplexNumbers obj1,
		AddTwoComplexNumbers obj2) {
	
	AddTwoComplexNumbers temp = new AddTwoComplexNumbers(0.0,0.0);
	temp.real = obj1.real + obj2.real;
	temp.imag = obj1.imag + obj2.imag;
	return (temp);
}
}
