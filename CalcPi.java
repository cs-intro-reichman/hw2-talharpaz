// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

	 int input = Integer.parseInt(args[0]);
	 if (input <= 1) {
		System.out.println("Value not valid");
		return;	
	 }

	 double sum = 1;
	 double denominator = 3;
	 
	 
	 for ( int i=1; i < input; i++){

		
		if (i%2 == 0) {
			sum = sum + 1.0/denominator;
			denominator = denominator + 2;
		} 
		else {
			sum = sum - 1.0/denominator;
			denominator = denominator + 2;
		}
	 }
	 System.out.println("pi according to Java: 3.141592653589793");
	 System.out.println("pi, approximated: " + sum * 4.0);
	}
}
/* % java CalcPi 10
pi according to Java: 3.141592653589793
pi, approximated: 3.0418396189294032
% java CalcPi 1000
pi according to Java: 3.141592653589793
pi, approximated: 3.140592653839794 */