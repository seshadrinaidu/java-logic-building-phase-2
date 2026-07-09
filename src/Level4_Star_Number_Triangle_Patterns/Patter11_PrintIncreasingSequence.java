/*
Problem 11: Print Numbers in an Increasing Sequence

Understanding the Problem:
-> I need to print numbers in increasing order for each row.
-> The number of rows is given by the user.
-> Every row starts from 1.
-> Each row prints numbers up to the current row number.

Example:
1
12
123
1234
12345

Choosing the Loop:
-> Multiple rows are required, so I need an outer loop.
-> Each row prints multiple numbers, so I need an inner loop.
-> Nested for loops are the best choice.

Dry Run:

Suppose:
N = 5

Row 1:
1

Row 2:
12

Row 3:
123

Row 4:
1234

Row 5:
12345

Loop terminates.

Edge Cases:
-> If N = 1, print only 1.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Ensure the inner loop always starts from 1.

Review Solution:
-> Outer loop controls the rows.
-> Inner loop prints numbers from 1 to the current row.
-> This is the Number Increasing Pattern.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Patter11_PrintIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
