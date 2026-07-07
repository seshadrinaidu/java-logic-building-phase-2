/*
Problem 7: Print Stars in Even Numbers (2, 4, 6, 8, ...)

Understanding the Problem:
-> I need to print stars in increasing even numbers.
-> The number of rows is given by the user (N).
-> Each row prints twice the row number of stars.
-> Row 1 prints 2 stars.
-> Row 2 prints 4 stars.
-> Row 3 prints 6 stars.
-> ...
-> Row N prints 2 × N stars.

Choosing the Loop:
-> Since I need multiple rows, I need an outer loop.
-> Since each row prints multiple stars,
   I need an inner loop.
-> The number of stars depends on the current row number.
-> Therefore, nested loops are the best choice.

Dry Run:

Suppose:
N = 4

Row 1:
Stars = 2 × 1 = 2
**

Row 2:
Stars = 2 × 2 = 4
****

Row 3:
Stars = 2 × 3 = 6
******

Row 4:
Stars = 2 × 4 = 8
********

Loop terminates.

Edge Cases:
-> If N = 1, print 2 stars.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> The inner loop should always run 2 × Row times.

Review Solution:
-> The outer loop controls the rows.
-> The inner loop controls the number of stars.
-> The number of stars follows the formula:
   Stars = 2 × Row.
-> This pattern teaches how to derive formulas for column counts.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern07_PrintStarsInEvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
