/*
Problem 14: Print Floyd's Triangle (Numbers Wrapping After 9)

Understanding the Problem:
-> I need to print numbers continuously in a triangle.
-> Numbers should not restart in each row.
-> After 9, the next number should become 0.
-> I need an external counter variable.

Example:
1
2 3
4 5 6
7 8 9 0
1 2 3 4 5

Choosing the Loop:
-> Use an outer loop to print rows.
-> Use an inner loop to print numbers in each row.
-> Use an external counter (num) to keep track of the next number.
-> Use num % 10 so numbers wrap after 9.

Dry Run:

rows = 4
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
Print 7 8 9 0
num = 11

Loop terminates.

Edge Cases:
-> If rows = 1, print only 1.
-> If rows = 0, nothing is printed.
-> Do not reset num inside the loop.
-> num % 10 keeps only the last digit.

Review Solution:
-> Outer loop controls rows.
-> Inner loop controls columns.
-> num stores the current number.
-> num % 10 wraps numbers after 9.
-> num increments after every print.
*/
package Level4_Star_Number_Triangle_Patterns;

public class Pattern14_PrintFloydTriangle {
    public static void main(String[] args) {
        int rows=7;
        int num=1;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num%10+" ");
                num++;
            }
            System.out.println();
        }
    }
}
