interface Arithmetic{
	double operation(int a,int b);
}
public class Assignment4Q1 {
	
	
    public static void main(String[] args) {
    	
       	Arithmetic addition = (int a, int b) -> (a + b);
		System.out.println("Addition = " + addition.operation(15, 16));

		Arithmetic subtraction = (int a, int b) -> (a - b);
		System.out.println("Subtraction = " + subtraction.operation(25, 33));

		Arithmetic multiplication = (int a, int b) -> (a * b);
		System.out.println("Multiplication = " + multiplication.operation(44, 56));
		
		Arithmetic division = (int a, int b) -> (a / b);
		System.out.println("Division = " + division.operation(1, 6));
    	
    }
}
