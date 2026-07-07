/*
Problem 6: Print a Right-Aligned Triangle of Stars

Understanding the Problem:
-> I need to print a right-aligned triangle of stars.
-> The number of rows is given by the user (N).
-> Each row contains leading spaces followed by stars.
-> As the row number increases:
   - Spaces decrease.
   - Stars increase.

Choosing the Loop:
-> Since I need multiple rows, I need an outer loop.
-> Since each row has two different parts (spaces and stars),
   I need two inner loops.
-> The first inner loop prints spaces.
-> The second inner loop prints stars.

Dry Run:

Suppose:
N = 4

Row 1:
Spaces = 3
Stars = 1
   *

Row 2:
Spaces = 2
Stars = 2
  **

Row 3:
Spaces = 1
Stars = 3
 ***

Row 4:
Spaces = 0
Stars = 4
****

Loop terminates.

Edge Cases:
-> If N = 1, print one star.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Ensure spaces decrease while stars increase.

Review Solution:
-> This is the first pattern that combines two nested-loop patterns.
-> The outer loop controls the rows.
-> The first inner loop prints leading spaces.
-> The second inner loop prints stars.
-> This logic becomes the foundation for pyramid and diamond patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern06_PrintRightAlignedTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
