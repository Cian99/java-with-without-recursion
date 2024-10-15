package Assignment;

import java.util.Scanner;

public class NoRecursion {

	public static void main(String[] args) {
		
		System.out.println("This program generates a Pascal's Triangle with n rows (as entered by the user), without using recursion");
		
		// get n from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = input.nextInt();
		System.out.println("\n"); // move couple of lines down
		
		// nested for loop
		// loop the number of times entered by the user (number of rows)
		for(int i=0; i<n; i++) {
			
			// space on left to format the triangle appropriately
			// depending on the number of rows (n) that there will be
			for(int s=0; s<=n-i; s++) {
				System.out.print(" ");
			}
			
			int number = 1; // the sequence begins with the number 1
			
			// nested loop (element in the current row)
			for(int j=0; j<=i; j++) {
				
				System.out.print(number + " "); // print the number and a space after
				// calculate the next number as per binomial coefficient (i choose j)
				number = number * (i-j)/(j+1); 
				
			}
			
			System.out.println(); // move to the next line
			
		}
		
		input.close(); // close scanner to prevent resource leak

	}

}
