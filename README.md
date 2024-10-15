# Java Pascal's Triangle with and without Recursion
This repository contains two Java programs that generate Pascal's Triangle. One program uses recursion, and the other does not. Pascal's Triangle is a triangular array where each element is the sum of the two elements directly above it.
### Input: The user is prompted to enter the number of rows (n) for Pascal's Triangle.
### Output: Pascal's Triangle with the specified number of rows is printed.
## No Recursion
Algorithm: Uses nested loops to generate each element of Pascal’s Triangle. The value of each element is calculated based on the binomial coefficient formula, without recursion.
## With Recursion
Algorithm: Recursively calculates the values of Pascal's Triangle using the formula:
Pascal(row, col) = Pascal(row-1, col-1) + Pascal(row-1, col).
The base case is when the element is the first or last in a row, which is always 1.