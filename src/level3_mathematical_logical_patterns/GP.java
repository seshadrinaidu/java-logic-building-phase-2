/*
Problem 10: Print the first n terms of a Geometric Progression (GP)

Sample Input 1:
Enter a : 2
Enter r : 3
Enter n : 5

Sample Output 1:
2 6 18 54 162

Explanation:
GP Formula:

Term = a × r^i

where

a = First term

r = Common ratio

i = Current position starting from 0

--------------------------------------------------

Sample Input 2:
Enter a : 5
Enter r : 2
Enter n : 6

Sample Output 2:
5 10 20 40 80 160

--------------------------------------------------

Topics Involved:
- for loop
- Sequence Generation Pattern
- Multiplication Pattern
- Variable Updating Pattern
- User input using Scanner

Logic:

Step 1:
Read first term (a).

Step 2:
Read common ratio (r).

Step 3:
Read number of terms (n).

Step 4:
Initialize:

term = a

Step 5:
Run the loop n times.

Step 6:
Print the current term.

Step 7:
Update:

term = term × r

Step 8:
Repeat until all terms are printed.

Time Complexity:
O(n)

Reason:
One iteration is performed for each term.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Sequence Generation Pattern
- Variable Updating Pattern
- Multiplication Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = scanner.nextInt();
        System.out.print("enter r :");
        int r = scanner.nextInt();
        System.out.print("enter n :");
        int n = scanner.nextInt();
        int term = a;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term *= r;
        }

    }
}
