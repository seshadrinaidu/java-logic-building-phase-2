/*
Problem 4: Print a Square of Stars (N × N)

Understanding the Problem:
-> I need to print a square consisting of N rows and N columns.
-> I have user input (N).
-> Every row contains exactly N stars.
-> The number of rows and columns are fixed.

Choosing the Loop:
-> Since I need to print multiple rows,
   I need an outer loop.
-> Since each row contains multiple columns,
   I need an inner loop.
-> Therefore, nested loops are the best choice.

Dry Run:

Suppose:
N = 3

Outer Loop (Rows)

Iteration 1:
Row = 1
Inner Loop prints:
***
Move to next line

Iteration 2:
Row = 2
Inner Loop prints:
***
Move to next line

Iteration 3:
Row = 3
Inner Loop prints:
***
Move to next line

Outer loop ends.

Output:
***
***
***

Edge Cases:
-> If N = 1, print a single star.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Ensure the inner loop runs exactly N times.

Review Solution:
-> This is the first problem that uses nested loops.
-> The outer loop controls the number of rows.
-> The inner loop controls the number of columns.
-> This pattern becomes the foundation for all remaining star, number, and triangle patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern04_PrintSquareOfStars {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){ // n Rows
            for (int j=0;j<n;j++){ // n columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
