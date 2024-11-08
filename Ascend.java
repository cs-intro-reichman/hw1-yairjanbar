// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		//int num1 = Integer.parseInt(args[1]);
		//int num2 = Integer.parseInt(args[2]);
		//int num3 = Integer.parseInt(args[3]);
		int num1 = (int)(Math.random()*range + 1);
		int num2 = (int)(Math.random()*range + 1);
		int num3 = (int)(Math.random()*range + 1);
		int max1 = Math.max(num1, num2);
		int min1 = Math.max(num1, num2);
		int finalMax = Math.max(max1, num3);
		System.out.println("for this range" + range + "here is the random numbers" + finalMax + max1 + min1);
	}
}
