// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String dinnerBill = args[3];
		int finalBill = Integer.parseInt(dinnerBill);
		double divided = Math.ceil(finalBill/3);
		System.out.println("Dear "+ name1 + ", " + name2 + " and " + name3 + ": " + "pay " + divided+ " shekels each ");
	    // Replace this comment with the rest of your code   
		// System.out.println("hello world");
    }
}
