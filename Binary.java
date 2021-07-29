import java.util.Scanner;

public class Binary {

	// Function to print array
	static void arr1(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	// Function to check if no is power of 2
	static boolean powerOf2(int n) {
		// calculate power of 2 
		// check if equal to given no.
		// stop if pow is greater than given number
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			i++;
		}
		return false;
	}

	// Function to swap nibbles in array
	static int[] swapNibbles(int[] arr) {
		// swap nibbles at first and last of the array
		// j is used to save last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) { // loop runs 4 times and swap first four element with the last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	// main function/method to test Binary class
	public static void main(String[] args) {

		try {
			Scanner S = new Scanner(System.in);
			System.out.println("Enter a No : ");
			int[] binary = Function.toBinary(S.nextInt());
			System.out.println("Binary of this no is : ");
			arr1(binary);
			S.close();
			swapNibbles(binary);
			System.out.println("After Swapping binary is : ");
			arr1(binary);
			int swapDec = Function.toDecimal(binary);
			System.out.println("Decimal of Swapped Binary is " + swapDec);

			if (powerOf2(swapDec))
				System.out.println("Its Power of 2");
			else
				System.out.println("Not Power of 2");

		} catch (Exception e) {
			System.out.println(" Enter a Valid Integer Value!");
		}

	}
}