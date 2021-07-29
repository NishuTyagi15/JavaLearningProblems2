import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Principal Year Rate");
		double p = S.nextDouble();
		double y = S.nextDouble();
		double r = S.nextDouble();
		S.close();
		System.out.println("Mothly Payment is " + Function.monthlyPayment(p, y, r));
	}
}