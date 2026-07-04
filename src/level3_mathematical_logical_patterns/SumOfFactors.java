/*
Problem 7: Find the sum of all factors of a given number

Sample Input 1:
Enter N : 12

Sample Output 1:
Sum of Factors of 12 : 28

Explanation:
Factors of 12 are:
1 2 3 4 6 12

Sum = 1 + 2 + 3 + 4 + 6 + 12 = 28

--------------------------------------------------

Sample Input 2:
Enter N : 15

Sample Output 2:
Sum of Factors of 15 : 24

Explanation:
Factors:
1 3 5 15

Sum = 24

--------------------------------------------------

Sample Input 3:
Enter N : 17

Sample Output 3:
Sum of Factors of 17 : 18

Explanation:
17 is prime.

Factors:
1 17

Sum = 18

--------------------------------------------------

Topics Involved:
- for loop
- Conditional statements (if)
- Modulus operator (%)
- Accumulator Pattern
- Factor Finding Pattern
- User input using Scanner

Logic:

Step 1:
Read the number n.

Step 2:
Initialize sum = 0.

Step 3:
Run a loop from 1 to n.

Step 4:
Check:

n % i == 0

Step 5:
If true,
add the factor to sum.

Step 6:
Continue until the loop finishes.

Step 7:
Print the sum.

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
- Accumulator Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum of Factors of "+n+" : "+sum);
    }
}
