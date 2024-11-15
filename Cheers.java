// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	
            String input = args[0].toUpperCase();
            int count = Integer.parseInt(args[1]);



            int i=0;
            while (i < input.length()) {
                if ("AEFHILMNORSX".contains(String.valueOf(input.charAt(i)))) {
                System.out.println("Give me an " + input.charAt(i)  +": " +input.charAt(i) + "!" );
                } 
                else {
                System.out.println("Give me a " + input.charAt(i)  +": " +input.charAt(i) + "!" );
                }

                i++;
                
            }
            
            int j=0;
            while (j < count) {
                System.out.println(input + "!!!");
                j++;
        }
}
}

