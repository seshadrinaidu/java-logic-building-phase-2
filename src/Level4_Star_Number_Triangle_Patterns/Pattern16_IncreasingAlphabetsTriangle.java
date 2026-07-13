/*
Problem 16: Print Increasing Alphabets Triangle

Understanding the Problem:
-> I need to print alphabets instead of numbers.
-> Alphabets should continue across all rows.
-> Each alphabet should be printed only once.
-> After printing a character, move to the next alphabet.

Example:

A
B C
D E F
G H I J
K L M N O

Choosing the Loop:
-> Multiple rows require an outer loop.
-> Each row contains multiple characters, so an inner loop is required.
-> Use an external character variable to store the current alphabet.
-> Increment the character after every print.

Dry Run:

rows = 4

ch = 'A'

Row 1
Print A
ch = 'B'

Row 2
Print B C
ch = 'D'

Row 3
Print D E F
ch = 'G'

Row 4
Print G H I J
ch = 'K'

Loop terminates.

Edge Cases:
-> If rows = 1, print only A.
-> If rows = 0, nothing is printed.
-> If rows are too large (greater than about 26), characters continue to ASCII values after 'Z' (such as [, \, ], ^, etc.).
-> Do not reset ch inside the outer loop.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> ch stores the current alphabet.
-> ch++ automatically moves to the next alphabet.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern16_IncreasingAlphabetsTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row=scanner.nextInt();
        char ch='A';
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
