/*
Problem 3 : Check if the given number is palindrome or not
Sample Input 1:
Enter Number : 121

Sample Output 1:
Reversed Number : 121
Palindrome

Explanation:
Original number = 121
Reversed number = 121
Both are equal.

--------------------------------------------------

Sample Input 2:
Enter Number : 123

Sample Output 2:
Reversed Number : 321
Not Palindrome

Explanation:
Original number = 123
Reversed number = 321
Both are not equal.

--------------------------------------------------

Sample Input 3:
Enter Number : 7

Sample Output 3:
Reversed Number : 7
Palindrome

--------------------------------------------------

Topics Involved:
- While loop
- Digit extraction
- Modulus operator (%)
- Division operator (/)
- Integer reversal
- Conditional statements (if-else)
- Number property checking

Logic:

Step 1:
Read the number.

Step 2:
Store a copy of the original number.

Step 3:
Initialize reversed = 0.

Step 4:
Repeat until the number becomes 0:
- Extract the last digit using n % 10.
- Append the digit to the reversed number.
- Remove the last digit using n / 10.

Step 5:
Compare the original number with the reversed number.

Step 6:
If both are equal,
print "Palindrome";
otherwise,
print "Not Palindrome".

Take Number
      │
      ▼
Extract Last Digit (n % 10)
      │
      ▼
Use the Digit
      │
      ▼
Remove Last Digit (n /= 10)
      │
      ▼
Repeat until n == 0

Time Complexity:
O(d)
where d is the number of digits.

Space Complexity:
O(1)

Reusable Pattern:
Digit Extraction + Number Reversal + Comparison

*/
package level2_number_based_looping;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int original=n;
        int reversed=0;

        while (n>0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;

        }
        System.out.println("Reversed Number : "+reversed);

        if (original==reversed){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
