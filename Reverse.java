/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		if (args.length != 1) { // input validation
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }
		String str = args[0]; 
		int len = str.length();
		for(int i = len - 1; i >= 0; i--){ // Prints the input string in reverse
			System.out.print(str.charAt(i));
		}
		System.out.println();
		char midChar = str.charAt(len / 2); // Gets the middle char
		if(len % 2 == 0) // Deals with even length String input
			midChar = str.charAt((len / 2) - 1);
		System.out.println("The middle character is " + midChar);
	}
}
