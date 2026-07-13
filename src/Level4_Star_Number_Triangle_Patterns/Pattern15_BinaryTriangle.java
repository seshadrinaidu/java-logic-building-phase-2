/*
Problem 15: Print Binary Triangle

Understanding the Problem:
-> I need to print a triangle consisting of only 0s and 1s.
-> The number printed depends on the position of the element.
-> Adjacent numbers should alternate between 0 and 1.
-> The value is calculated using a mathematical formula.

Example:

0
1 0
0 1 0
1 0 1 0
0 1 0 1 0

Choosing the Loop:
-> Use an outer loop to print rows.
-> Use an inner loop to print columns.
-> Instead of printing i or j, calculate the value using:
   (row + column) % 2

Dry Run:

rows = 4

Row 1
(1+1)%2 = 0

Row 2
(2+1)%2 = 1
(2+2)%2 = 0

Row 3
(3+1)%2 = 0
(3+2)%2 = 1
(3+3)%2 = 0

Row 4
(4+1)%2 = 1
(4+2)%2 = 0
(4+3)%2 = 1
(4+4)%2 = 0

Loop terminates.

Edge Cases:
-> If rows = 1, print only one value.
-> If rows = 0, nothing is printed.
-> Formula determines the printed value.
-> No extra variables are required.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Value is computed using (i + j) % 2.
-> The modulus operator automatically creates the alternating pattern.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern15_BinaryTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row=scanner.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                int val=(i+j)%2;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
