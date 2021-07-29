import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in); {
            int n, count = 0, a[] = new int[10];
            System.out.print("Enter any Decimal number : ");
            n = S.nextInt();

            while(n > 0) {
                a[count] = n % 2;
                count++;
                n = n / 2;
            }
            System.out.print("The Binary Number is : ");
            for (int i = count-1; i>=0; i--) { //To Reverse the Array
                System.out.print(a[i]);
            }
            System.out.print("      The Number of 1s : " +count);
        }
    }  
}
