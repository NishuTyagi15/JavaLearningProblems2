import java.util.Scanner;  

public class LearningProblems {  
    public static void main (String[] args) {

        //PROBLEM 1 FIBONACCI SERIES
        int n1=0,n2=1,n3,i,count=20;    
        System.out.print(n1+" "+n2); 
        
        for(i=2;i<count;++i) {
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }

        // PROBLEM 2 PERFECT NUMBER
        long l, sum=0;  
        Scanner S1 =new Scanner(System.in);         
        System.out.println(" Enter the number: ");  
        l=S1.nextLong();  
        int j=1;  
        while(j <= l/2) { 
            if(l % j == 0) {
                sum = sum + j;
            }   
            j++;  
        }   
  
        if(sum==l) {
            System.out.println(l+" is a Perfect Number.");  
        } 
        else {
            System.out.println(l+" is not a Perfect Number.");   
        }
        
        // PROBLEM 3 PRIME NUMBER
        long m = 0;
        Scanner S2 =new Scanner(System.in);         
        System.out.println(" Enter the number: ");  
        m=S2.nextLong();
        boolean flag = false;
        for (int k = 2; k <= m / 2; k++) {
            if (m % k == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(m + " is a prime number.");
        }
        else {
            System.out.println(m + " is not a prime number.");
        }

        // PROBLEM 4 REVERSE A NUMBER
        long rev = 0, number = 0;
        Scanner S3 = new Scanner(System.in);         
        System.out.println(" Enter the number: ");  
        number =S3.nextLong();

        for(;number != 0; number /= 10) {
            long digit = number % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("Reversed Number is : " + rev);

        // PROBLEM 5 COUPON NUMBERS
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer S4=new StringBuffer();
		
		while (random>0)
		{
			S4.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=S4.toString();
		System.out.println("Coupon Code : "+couponCode);
        
    }
}