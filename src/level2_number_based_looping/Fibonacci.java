/*
Problem 9: Print Fibonacci Series up to n Terms

Sample Input 1:
Enter Number : 7

Sample Output 1:
0 1 1 2 3 5 8

Explanation:
The Fibonacci series starts with 0 and 1.
Each next term is obtained by adding the previous two terms.

0 + 1 = 1
1 + 1 = 2
1 + 2 = 3
2 + 3 = 5
3 + 5 = 8

--------------------------------------------------

Sample Input 2:
Enter Number : 5

Sample Output 2:
0 1 1 2 3

--------------------------------------------------

Sample Input 3:
Enter Number : 2

Sample Output 3:
0 1

--------------------------------------------------

Sample Input 4:
Enter Number : 1

Sample Output 4:
0

--------------------------------------------------

Sample Input 5:
Enter Number : 0

Sample Output 5:
Invalid input

--------------------------------------------------

Topics Involved:
- for loop
- Conditional statements (if-else)
- Variable updating
- Mathematical sequence (Fibonacci Series)
- User input using Scanner

Logic:

Step 1:
Read the number of terms (n).

Step 2:
If n <= 0,
print "Invalid input".

Step 3:
If n == 1,
print only 0.

Step 4:
Otherwise,
initialize:
a = 0
b = 1

Step 5:
Print the first two terms:
0 1

Step 6:
Run a loop from i = 2 to i < n.

Step 7:
Inside the loop:
- Calculate the next term:
      c = a + b
- Print c.
- Update:
      a = b
      b = c

Step 8:
Continue until all n terms are printed.

Time Complexity:
O(n)

Reason:
The loop runs exactly (n - 2) times.
Each iteration performs constant-time operations.

Space Complexity:
O(1)

Reason:
Only three integer variables (a, b, c) are used,
regardless of the input size.

Reusable Pattern:
- Variable Shifting Pattern
- Sequence Generation Pattern
- Iterative Computation Pattern
*/
package level2_number_based_looping;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
