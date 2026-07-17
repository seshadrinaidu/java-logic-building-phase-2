/*
Problem 21: Print Hollow Square

Understanding the Problem:
-> Print an N × N square.
-> Print '*' only on the boundary.
-> Print spaces inside the square.

Example (N = 5):

*****
*   *
*   *
*   *
*****

Choosing the Loop:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> Print '*' only if the current position lies on the boundary.
-> Otherwise print space.

Dry Run:

N = 5

Row 1
*****
(All boundary)

Row 2
*   *
(First and last column)

Row 3
*   *

Row 4
*   *

Row 5
*****
(All boundary)

Loop terminates.

Edge Cases:
-> N = 1
*

-> N = 2
**
**

-> N <= 0
Nothing is printed.

Review Solution:
-> Outer loop prints rows.
-> Inner loop prints columns.
-> Check whether the current cell is on the boundary.
-> Print '*' for boundary cells and space for inner cells.
*/

package Level4_Star_Number_Triangle_Patterns;


import java.util.Scanner;

public class Pattern21_HallowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
