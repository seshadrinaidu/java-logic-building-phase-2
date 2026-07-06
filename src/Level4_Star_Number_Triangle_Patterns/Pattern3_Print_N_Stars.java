/*
Problem 3: Print N Stars on the Same Line

Understanding the Problem:
-> I need to print N stars on the same line.
-> I have user input (N).
-> I know exactly how many times the star should be printed.
-> The number of iterations is fixed.

Choosing the Loop:
-> Since the number of iterations is known beforehand,
   a for loop is the best choice.
-> The loop will run exactly N times.

Dry Run:

Suppose:
N = 5

for(int i = 0; i < 5; i++)

Iteration 1:
i = 0
Print *

Iteration 2:
i = 1
Print *

Iteration 3:
i = 2
Print *

Iteration 4:
i = 3
Print *

Iteration 5:
i = 4
Print *

i = 5
Condition becomes false.
Loop terminates.

Edge Cases:
-> If N = 0, nothing is printed.
-> If N < 0, the loop will not execute.
-> If N = 1, exactly one star is printed.
-> Check that the loop condition is i < n.
   Using i <= n will print one extra star.

Review Solution:
-> This is the first pattern printing problem using a loop.
-> A single loop is sufficient because everything is printed on one line.
-> This pattern becomes the foundation for all upcoming nested loop patterns.
*/
package Level4_Star_Number_Triangle_Patterns;

import java.util.Scanner;

public class Pattern3_Print_N_Stars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}
