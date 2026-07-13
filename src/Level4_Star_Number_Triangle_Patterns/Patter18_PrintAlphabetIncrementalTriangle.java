
/*
Problem 18: Print Incrementing Alphabet Triangle

Understanding the Problem:
-> Print alphabets in a triangle.
-> Every row starts from A.
-> Characters increase within the same row.
-> Character sequence restarts from A in every new row.

Example:

A
A B
A B C
A B C D
A B C D E

Choosing the Loop:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Character depends on the current column.
-> Character is calculated using:
   ('A' + columnIndex)

Dry Run:

rows = 5

Row 1
A

Row 2
A B

Row 3
A B C

Row 4
A B C D

Row 5
A B C D E

Loop terminates.

Edge Cases:
-> rows = 1 prints only A.
-> rows = 0 prints nothing.
-> Characters restart from A every row.
-> Large rows continue to ASCII values after Z.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Character is calculated from the column index.
-> No counter variable is required.
*/
package Level4_Star_Number_Triangle_Patterns;

public class Patter18_PrintAlphabetIncrementalTriangle {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            for (int j=0;j<i;j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
