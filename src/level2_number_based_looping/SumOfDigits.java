/*
Problem 4: Find the sum of digits of a given number

Sample Input 1:
Enter Number : 1234

Sample Output 1:
Sum of Digits of a Number is : 10

Explanation:
Digits are:
1 + 2 + 3 + 4 = 10

--------------------------------------------------

Sample Input 2:
Enter Number : 987

Sample Output 2:
Sum of Digits of a Number is : 24

Explanation:
9 + 8 + 7 = 24

--------------------------------------------------

Sample Input 3:
Enter Number : 5

Sample Output 3:
Sum of Digits of a Number is : 5

--------------------------------------------------

Topics Involved:
- While loop
- Digit extraction
- Modulus operator (%)
- Division operator (/)
- Accumulator pattern
- User input using Scanner

Logic:

Step 1:
Read the number.

Step 2:
Initialize sum = 0.

Step 3:
Repeat until the number becomes 0:
- Extract the last digit using n % 10.
- Add the digit to sum.
- Remove the last digit using n / 10.

Step 4:
Print the final sum.

Time Complexity:
O(d)

where d = number of digits.

Space Complexity:
O(1)

Reusable Pattern:
Digit Extraction + Accumulator Pattern


Pattern 1 (Digit Extraction) :

Take Number
      │
      ▼
digit = n % 10
      │
      ▼
Use digit
      │
      ▼
n = n / 10
      │
      ▼
Repeat

*/
package level2_number_based_looping;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("Sum of Digits of a Number is : "+sum);
    }
}
