/*
Problem 5: Find the LCM (Least Common Multiple) of Two Numbers Using Loops

Sample Input 1:
Enter a : 12
Enter b : 18

Sample Output 1:
LCM = 36

Explanation:
Multiples of 12:
12, 24, 36, 48...

Multiples of 18:
18, 36, 54...

The first common multiple is 36.

--------------------------------------------------

Sample Input 2:
Enter a : 5
Enter b : 7

Sample Output 2:
LCM = 35

--------------------------------------------------

Sample Input 3:
Enter a : 10
Enter b : 20

Sample Output 3:
LCM = 20

Explanation:
20 is already a multiple of both numbers.

--------------------------------------------------

Topics Involved:
- while loop
- Modulus operator (%)
- Conditional statements (if)
- break statement
- Mathematical functions (Math.max())
- Multiple Finding

Logic:

Step 1:
Read two numbers (a and b).

Step 2:
Initialize:

lcm = larger of the two numbers.

Step 3:
Repeat until a common multiple is found.

Step 4:
Check:

lcm % a == 0
AND
lcm % b == 0

Step 5:
If both conditions are true,
stop the loop.

Step 6:
Otherwise,
increment lcm by 1.

Step 7:
Print the final lcm.

Time Complexity:
O(LCM - max(a, b))

Reason:
In the worst case,
the loop checks every number from the larger number up to the LCM.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Multiple Finding Pattern
- Unknown Iteration Pattern
- Search Until Condition Pattern
*/
package level3_mathematical_logical_patterns;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
