/*
Problem 13: Print Incrementing Numbers

Understanding the Problem:
-> I need to print numbers continuously.
-> Numbers should not restart in each row.
-> After printing one number, print the next number.
-> A separate counter variable is required.

Example:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Choosing the Loop:
-> Multiple rows require an outer loop.
-> Each row contains multiple numbers, so an inner loop is required.
-> Since numbers continue across rows, use an external counter variable.

Dry Run:

Suppose:
N = 4

num = 1

Row 1
Print 1
num = 2

Row 2
Print 2 3
num = 4

Row 3
Print 4 5 6
num = 7

Row 4
Print 7 8 9 10
num = 11

Loop terminates.

Edge Cases:
-> If N = 1, print only 1.
-> If N = 0, nothing is printed.
-> If N < 0, loops do not execute.
-> Do not reset num inside the outer loop.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> num stores the next value to print.
-> num increments after every print.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern13_PrintIncrementingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int n=scanner.nextInt();
        int num=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
