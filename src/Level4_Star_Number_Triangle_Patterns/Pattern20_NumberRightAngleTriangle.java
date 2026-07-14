/*
Problem 20: Print Number Right-Angled Triangle

Understanding the Problem:
-> Print numbers in a right-angled triangle.
-> Every row starts from 1.
-> Numbers increase from left to right.
-> Each row contains numbers from 1 to the current row number.

Example:

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Choosing the Loop:
-> Outer loop controls the rows.
-> Inner loop controls the columns.
-> Print the column number (j).

Dry Run:

rows = 5

Row 1
Print: 1

Row 2
Print: 1 2

Row 3
Print: 1 2 3

Row 4
Print: 1 2 3 4

Row 5
Print: 1 2 3 4 5

Loop terminates.

Edge Cases:
-> rows = 1 prints only 1.
-> rows = 0 prints nothing.
-> Numbers restart from 1 in every row.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Print the column number (j).
-> Since j starts from 1 every row, the sequence restarts automatically.
*/
package Level4_Star_Number_Triangle_Patterns;

public class Pattern20_NumberRightAngleTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
