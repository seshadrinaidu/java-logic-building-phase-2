/*
Problem 8: Print Stars in Odd Numbers (1, 3, 5, 7, 9...)

Understanding the Problem:
-> I need to print stars in increasing odd numbers.
-> The number of rows is given by the user (N).
-> Each row prints an odd number of stars.
-> Row 1 prints 1 star.
-> Row 2 prints 3 stars.
-> Row 3 prints 5 stars.
-> Row 4 prints 7 stars.
-> ...
-> Row N prints (2 × Row - 1) stars.

Choosing the Loop:
-> Since multiple rows are required,
   I need an outer loop.
-> Since each row prints multiple stars,
   I need an inner loop.
-> The number of stars depends on the current row number.
-> Therefore, nested loops are the best choice.

Dry Run:

Suppose:
N = 4

Row 1:
Stars = 2×1 - 1 = 1
*

Row 2:
Stars = 2×2 - 1 = 3
***

Row 3:
Stars = 2×3 - 1 = 5
*****

Row 4:
Stars = 2×4 - 1 = 7
*******

Loop terminates.

Edge Cases:
-> If N = 1, print one star.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> The inner loop must always execute (2 × Row - 1) times.

Review Solution:
-> The outer loop controls the rows.
-> The inner loop controls the number of stars.
-> The number of stars follows the formula:
   Stars = (2 × Row - 1).
-> This formula is the foundation for centered pyramids and diamond patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern08_PrintOddNumberStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
