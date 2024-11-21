// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int i = 1; i <= N; i++) {
            int num = i;
            int steps = 1;

			if (num == 1) {
				System.out.print(1 + " ");
				num =4;
				steps++;
			}


            if (mode.equals("v")) {
                System.out.print(num + " "); 
            }
			
        
            while (num != 1) {
				
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }

                steps++;

                if (mode.equals("v")) {
                    System.out.print(num + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.print("(" + steps + ")");
            }


            if (mode.equals("v")) {
                System.out.println();
            }
        }

        System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
    }
}

/*% java Collatz 7 v
1 4 2 1 (4)
2 1 (2)
3 10 5 16 8 4 2 1 (8)
4 2 1 (3)
5 16 8 4 2 1 (6)
6 3 10 5 16 8 4 2 1 (9)
7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
Every one of the first 7 hailstone sequences reached 1. */
