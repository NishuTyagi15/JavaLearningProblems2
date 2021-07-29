import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		double f,c;
        Scanner S = new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int temp = S.nextInt();
	    switch(temp) {
			case 1: {
			    System.out.println("Enter  Fahrenheit temperature : ");
		        f=S.nextDouble();
	            c=(f-32)*5/9;
	            System.out.println("Enter Celsius temperature :  "+c);
		        break;
		    }
	        case 2: {
			    System.out.println("Enter  Celsius temperature");
                c=S.nextDouble();
	            f=((9*c)/5)+32;
	            System.out.println("Fahrenheit temperature is = "+f);
		        break;
		    }
	        default: {
			    System.out.println("please choose valid choice");
	        }
		}
	}
}