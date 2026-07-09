/*
Problem 12: Print Repeated Numbers per Row

Understanding the Problem:
-> I need to print the same number repeatedly in each row.
-> The number of rows is given by the user.
-> Each row prints the current row number.
-> The row number is printed as many times as the row number itself.

Example:
1
22
333
4444
55555

Choosing the Loop:
-> Multiple rows are required, so I need an outer loop.
-> Each row prints multiple values, so I need an inner loop.
-> Nested for loops are the best choice.

Dry Run:

Suppose:
N = 5

Row 1:
Print 1 one time
1

Row 2:
Print 2 two times
22

Row 3:
Print 3 three times
333

Row 4:
Print 4 four times
4444

Row 5:
Print 5 five times
55555

Loop terminates.

Edge Cases:
-> If N = 1, print only 1.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> The inner loop always runs equal to the current row number.

Review Solution:
-> The outer loop controls the rows.
-> The inner loop controls how many times to print.
-> Instead of printing the column number (j), print the row number (i).
-> This creates a repeated number pattern.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Patter12_PrintSameNumberRepeat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
