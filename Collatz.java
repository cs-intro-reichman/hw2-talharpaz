// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	     int N = Integer.parseInt(args[0]);
		 String mode = args[1];
		 
		 if (N == 1 && mode.equals("v")) {
			System.out.print("1 ");
			N = 4;
		}
			for (int i = 1 ; i <= N; i++) {
				
			}
		

		 if (mode.equals("v")) {
			System.out.print(N + " ");
		} 

		 while (N != 1) {
			
			if ( N%2 ==0) {
				N= N/2;
			}
			else{
			N = N*3 +1;	
			}
			if (mode.equals("v")) {
				System.out.print(N + " ");
			} 
		 }
		       if (mode.equals("v")) System.out.println();
		    
		 System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");

	}
}

