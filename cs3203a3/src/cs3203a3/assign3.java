package cs3203a3;
import java.util.Arrays;
import java.util.Scanner;

public class assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers:");
		
		int num;
		int ar[] = new int[5];
		for(int i = 0; i < 5; i++) {
			
			num = scanner.nextInt();
			ar[i] = num;
		}
		
		int theSum;
		theSum = sumOfArray(ar);
		System.out.println("Sum of array: " + theSum);
		
		int theProduct;
		theProduct = productOfArray(ar);
		System.out.println("Product of array: " + theProduct);
		
		int rev[] = reverseArray(ar);
		
		System.out.println(Arrays.toString(rev));
		
		scanner.close();
		
	}

	public static int sumOfArray(int[] a) {
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			sum = sum + a[i];
			
		}
		
		return sum;
	}
	
	public static int productOfArray(int[] b) {
		
		int product = 1;
		
		for(int i = 0; i < b.length; i++) {
			
			product = product * b[i];
		}
		
		return product;
		
	}
	
	public static int[] reverseArray(int[] c) {
		
		int[] reverse = new int[c.length];
		
		for(int i = 0; i < c.length; i++) {
			
			reverse[i] = c[c.length - 1 - i];
			
		}
	
		
		return reverse;
	}
}
