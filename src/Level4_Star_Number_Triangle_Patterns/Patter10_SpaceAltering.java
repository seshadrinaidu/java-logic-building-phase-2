/*
Problem 10: Print Alternating Stars and Spaces

Understanding the Problem:
-> I need to print a centered pattern.
-> Every row contains:
   - Leading blank spaces
   - Alternating stars (*) and blank spaces (represented by 'b')
-> The number of printable characters follows the odd-number pattern.

Choosing the Loop:
-> Use one outer loop for rows.
-> First inner loop prints leading spaces.
-> Second inner loop prints alternating '*' and 'b'.
-> Nested loops are the best choice.

Dry Run:

Suppose:
N = 5

Row 1
Spaces = 4
Characters = *

Row 2
Spaces = 3
Characters = *b*

Row 3
Spaces = 2
Characters = *b*b*

Row 4
Spaces = 1
Characters = *b*b*b*

Row 5
Spaces = 0
Characters = *b*b*b*b*

Loop terminates.

Edge Cases:
-> If N = 1, print one star.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Even indexes print '*'.
-> Odd indexes print blank spaces ('b').

Review Solution:
-> Outer loop controls rows.
-> First inner loop prints leading spaces.
-> Second inner loop alternates characters using j % 2.
-> This combines the Space Pattern, Odd Formula Pattern, and Alternating Pattern.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Patter10_SpaceAltering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("b");
            }
            // Print alternating * and space
            for (int j = 0; j <= 2*i+1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
    }
}
