/*
Problem 5: Check whether a number is an Armstrong Number

Sample Input 1:
Enter Number : 153

Sample Output 1:
Armstrong Number

Explanation:
Digits = 3

1³ + 5³ + 3³
= 1 + 125 + 27
= 153

--------------------------------------------------

Sample Input 2:
Enter Number : 9474

Sample Output 2:
Armstrong Number

Explanation:
Digits = 4

9⁴ + 4⁴ + 7⁴ + 4⁴
= 6561 + 256 + 2401 + 256
= 9474

--------------------------------------------------

Sample Input 3:
Enter Number : 123

Sample Output 3:
Not an Armstrong Number

Explanation:
Digits = 3

1³ + 2³ + 3³
= 1 + 8 + 27
= 36

36 ≠ 123

--------------------------------------------------

Topics Involved:
- While loop
- Digit extraction
- Modulus operator (%)
- Division operator (/)
- Mathematical functions (Math.pow)
- Conditional statements (if-else)
- Number property checking

Logic:

Step 1:
Read the number.

Step 2:
Store a copy of the original number.

Step 3:
Find the total number of digits.

Step 4:
Initialize sum = 0.

Step 5:
Repeat until the number becomes 0:
- Extract the last digit.
- Raise it to the power of the total number of digits.
- Add the result to sum.
- Remove the last digit.

Step 6:
Compare the calculated sum with the original number.

If both are equal,
print "Armstrong Number".

Otherwise,
print "Not an Armstrong Number".

Time Complexity:
O(d)

where d = number of digits.

Space Complexity:
O(1)

Reusable Pattern:
Digit Extraction + Power Calculation + Accumulator + Comparison
*/
package level2_number_based_looping;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int original=n;
        int sum=0;
        int digits=String.valueOf(n).length();
        while (n>0){
            int digit=n%10;
            sum+=Math.pow(digit,digits);
            n=n/10;
        }
        if (original==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
