/*
Problem 8: Check whether a given number is a Strong Number

Sample Input 1:
Enter N : 145

Sample Output 1:
145 is a Strong Number

Explanation:
1! + 4! + 5!
=
1 + 24 + 120
=
145

--------------------------------------------------

Sample Input 2:
Enter N : 2

Sample Output 2:
2 is a Strong Number

Explanation:
2! = 2

--------------------------------------------------

Sample Input 3:
Enter N : 123

Sample Output 3:
123 is NOT a Strong Number

Explanation:
1! + 2! + 3!
=
1 + 2 + 6
=
9

9 != 123

--------------------------------------------------

Topics Involved:
- while loop
- for loop
- Nested loops
- Digit Extraction Pattern
- Factorial Pattern
- Accumulator Pattern
- Number Comparison
- User input using Scanner

Logic:

Step 1:
Read the number.

Step 2:
Store a copy of the original number.

Step 3:
Extract one digit at a time.

Step 4:
Find the factorial of that digit.

Step 5:
Add the factorial to sum.

Step 6:
Repeat until all digits are processed.

Step 7:
Compare sum with the original number.

If equal:
Strong Number

Otherwise:
Not a Strong Number.

Time Complexity:
O(d × 9)

where
d = number of digits.

Reason:
For every digit,
factorial is calculated.

Since the largest digit is 9,
the factorial loop runs at most 9 times.

This simplifies to:

O(d)

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Patterns:
- Digit Extraction Pattern
- Nested Loop Pattern
- Factorial Pattern
- Accumulator Pattern
- Number Comparison Pattern
*/

package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");

        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;


            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;   // add factorial of digit
            temp /= 10;    // remove last digit
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is NOT a Strong Number");
        }
    }
}
