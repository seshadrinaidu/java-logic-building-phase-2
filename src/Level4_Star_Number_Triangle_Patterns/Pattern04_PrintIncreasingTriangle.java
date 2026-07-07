/*
Problem 5: Print an Increasing Triangle of Stars

Understanding the Problem:
-> I need to print a triangle of stars.
-> The number of rows is given by the user (N).
-> The number of stars increases by one in each row.
-> Row 1 prints 1 star.
-> Row 2 prints 2 stars.
-> Row 3 prints 3 stars.
-> ...
-> Row N prints N stars.

Choosing the Loop:
-> Since I need multiple rows, I need an outer loop.
-> Since each row contains a different number of stars,
   I need an inner loop.
-> The inner loop depends on the current row number.
-> Therefore, nested loops are the best choice.

Dry Run:

Suppose:
N = 4

Row 1:
Column runs from 1 to 1
*

Row 2:
Column runs from 1 to 2
* *

Row 3:
Column runs from 1 to 3
* * *

Row 4:
Column runs from 1 to 4
* * * *

Loop terminates.

Edge Cases:
-> If N = 1, only one star is printed.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> The inner loop must always run from 1 to row.

Review Solution:
-> This is the first dynamic nested loop pattern.
-> The outer loop controls the rows.
-> The inner loop controls the number of stars.
-> Unlike the square pattern, the number of columns changes in every row.
-> This pattern is the foundation for many triangle, number, and alphabet patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern04_PrintIncreasingTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        // Outer Loop
        for (int row=1;row<=n;row++){
            // Inner Loop
            for (int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
