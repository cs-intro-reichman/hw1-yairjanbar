// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int money = Integer.parseInt(args[0]);
		double percent = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double firstPow = money * Math.pow((1 + (percent / 100)), years);
		int futureValue = (int) firstPow;
		
		System.out.println("After " + years + " years, a $" + money + " saved at " + percent + "% will yield $" + futureValue);
		//int finalValue = (int)money*(Math.pow(((percent/100.0)+1),years));

	}
}