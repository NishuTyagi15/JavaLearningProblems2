import java.util.Scanner;

public class DayOfWeek {
	
	//main function to test the class

	public static void main(String[] args) {
		int d, m, y;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Date in Day Month Year Format : ");
		d = S.nextInt();
		m = S.nextInt();
		y = S.nextInt();
		System.out.println("day is " +Function.dayOfWeek(d, m, y));
		S.close();
		
	}
}