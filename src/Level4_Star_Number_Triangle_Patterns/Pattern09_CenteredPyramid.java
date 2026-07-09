/*
Problem 9: Print a Centered Pyramid of Stars

Understanding the Problem:
-> I need to print a centered pyramid of stars.
-> The number of rows is given by the user (N).
-> Each row consists of:
   - Leading spaces
   - Odd number of stars
-> As the row number increases:
   - Spaces decrease by one.
   - Stars increase by two.

Choosing the Loop:
-> I need an outer loop to print multiple rows.
-> Each row has two different sections:
   1. Spaces
   2. Stars
-> Therefore, I need two inner loops.
-> Nested for loops are the best choice.

Dry Run:

Suppose:
N = 5

Row 1:
Spaces = 4
Stars = 1

    *

Row 2:
Spaces = 3
Stars = 3

   ***

Row 3:
Spaces = 2
Stars = 5

  *****

Row 4:
Spaces = 1
Stars = 7

 *******

Row 5:
Spaces = 0
Stars = 9

*********

Loop terminates.

Edge Cases:
-> If N = 1, print one star.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Ensure spaces decrease by one in every row.
-> Ensure stars increase by two in every row.

Review Solution:
-> The outer loop controls the number of rows.
-> The first inner loop prints the leading spaces.
-> The second inner loop prints the stars.
-> This pattern combines two reusable patterns:
   - Space Pattern
   - Odd Formula Pattern
-> This logic is reused in diamonds, hollow pyramids, and many advanced star patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern09_CenteredPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        var number = scanner.nextInt();
        // Outer Loop runs 1 to numbers
        for (int i = 1; i <= number; i++){
            // Inner Loop for spaces left side only
            for (int j = 1;j<=number-i;j++){
                System.out.print(" ");
            }
            // Again Inner Loop for to print stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
