/*
Problem 17: Print Character Triangle (Same Alphabet Per Row)

Understanding the Problem:
-> Print alphabets instead of numbers.
-> Every row contains only one alphabet.
-> The alphabet changes only after the row is completed.
-> Row 1 prints A.
-> Row 2 prints B twice.
-> Row 3 prints C three times.

Example:

A
B B
C C C
D D D D
E E E E E

Choosing the Loop:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Character depends only on the row number.
-> Character can be calculated using:
   ('A' + rowIndex)

Dry Run:

rows = 5

Row 0
ch = 'A'
Print A

Row 1
ch = 'B'
Print B B

Row 2
ch = 'C'
Print C C C

Row 3
ch = 'D'
Print D D D D

Row 4
ch = 'E'
Print E E E E E

Loop terminates.

Edge Cases:
-> rows = 1 prints only A.
-> rows = 0 prints nothing.
-> Very large rows continue into ASCII characters after Z.

Review Solution:
-> Outer loop controls rows.
-> Inner loop prints current row's character.
-> Character is calculated directly using row index.
-> No external counter is required.
*/
package Level4_Star_Number_Triangle_Patterns;

public class Pattern17_PrintCharacterPyramid {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            char ch=(char) ('A'+i);
            for (int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
