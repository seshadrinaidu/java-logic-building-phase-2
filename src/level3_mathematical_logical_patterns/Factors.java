/*
Problem 6: Print all factors of a given number

Sample Input 1:
Enter N : 12

Sample Output 1:
1 2 3 4 6 12

Explanation:
Factors of 12 are numbers that divide 12 exactly without leaving a remainder.

--------------------------------------------------

Sample Input 2:
Enter N : 15

Sample Output 2:
1 3 5 15

--------------------------------------------------

Sample Input 3:
Enter N : 17

Sample Output 3:
1 17

Explanation:
17 is a prime number, so it has only two factors.

--------------------------------------------------

Topics Involved:
- for loop
- Conditional statements (if)
- Modulus operator (%)
- Factor Finding Pattern
- User input using Scanner

Logic:

Step 1:
Read the number n.

Step 2:
Run a loop from 1 to n.

Step 3:
For each number,
check:

n % i == 0

Step 4:
If true,
print i because it is a factor.

Step 5:
Continue until the loop finishes.

Time Complexity:
O(n)

Reason:
The loop checks every number from 1 to n.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Factor Finding Pattern
- Divisibility Checking Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
