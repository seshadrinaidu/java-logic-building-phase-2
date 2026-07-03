/*
Problem 4: Find the HCF (GCD) of Two Numbers Using Loops

Sample Input 1:
Enter a : 12
Enter b : 18

Sample Output 1:
HCF = 6

Explanation:
Factors of 12:
1, 2, 3, 4, 6, 12

Factors of 18:
1, 2, 3, 6, 9, 18

Greatest Common Factor = 6

--------------------------------------------------

Sample Input 2:
Enter a : 20
Enter b : 30

Sample Output 2:
HCF = 10

--------------------------------------------------

Sample Input 3:
Enter a : 17
Enter b : 19

Sample Output 3:
HCF = 1

Explanation:
17 and 19 have no common factors other than 1.

--------------------------------------------------

Topics Involved:
- for loop
- Conditional statements (if)
- Modulus operator (%)
- Logical AND (&&)
- Mathematical functions (Math.min())
- Factor Finding

Logic:

Step 1:
Read two numbers (a and b).

Step 2:
Find the smaller number using Math.min().

Step 3:
Run a loop from 1 to the smaller number.

Step 4:
For every number,
check:

a % i == 0
AND
b % i == 0

Step 5:
If both conditions are true,
update:

hcf = i

Step 6:
After the loop,
print hcf.

Time Complexity:
O(min(a, b))

Reason:
The loop runs from 1 to the smaller of the two numbers.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Factor Enumeration Pattern
- Greatest Common Factor Pattern
*/
package level3_mathematical_logical_patterns;
import java.util.*;
public class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int hcf = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);
        sc.close();
    }
}
