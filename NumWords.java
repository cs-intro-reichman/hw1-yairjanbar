// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num1 = Integer.parseInt(args[0]);
		int hundreds = num1/100;
		int tens = (num1 - (hundreds*100))/10;
		int ones = (num1-(hundreds*100))-(tens*10);
		System.out.println(hundreds + " hundreds, " + tens + " tens, and "+ ones + " ones.");
	}
}
