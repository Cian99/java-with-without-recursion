package Assignment;

import java.util.Scanner;

public class WithRecursion {

	public static void main(String[] args) {
		
		System.out.println("This program generates a Pascal's Triangle with n rows (as entered by the user), with the use of recursion");
		
		// get n from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = input.nextInt();
		System.out.println("\n"); // move couple of lines down
		
		// nested for loop to traverse the elements on each row
		for(int i=0; i<n; i++) {
			
			// space on left to format the triangle appropriately
			// depending on the number of rows (n) that there will be
			for(int s=0; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				// use the recursion method to do the calculation and add a space after each number
				System.out.print(recursion(i, j) + " "); 
				
			}
			
			System.out.println(); // next line
			
		}

		input.close(); // close the scanner to prevent resource leak
		
	}
	
	private static int recursion(int row, int col) {
		
		// as per Pascal's Triange the first element and last element in a row are equal to 1
		// also, the number of columns in a row is the same as the number of that row in the sequence
		// i.e. row 4 has 4 columns and row 11 has 11 columns etc.
		if(col == 0 || col == row) {
			return 1;
		}
		// also in Pascal's Triangle the values are calculated by adding the values of the row above
		else {
			return recursion(row-1, col-1) + recursion(row-1, col);
		}
		
	}

}
