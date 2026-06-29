/*
Problem 2 : Reverse a given number.

Sample Input 1:
Enter Number : 12345

Sample Output 1:
Reverse of a Number : 54321

Explanation:
Digits are extracted from right to left:
5 → 4 → 3 → 2 → 1
They are appended one by one to form 54321.

--------------------------------------------------

Sample Input 2:
Enter Number : 9070

Sample Output 2:
Reverse of a Number : 709

Explanation:
Leading zero in the reversed number is not stored.
0709 becomes 709.

--------------------------------------------------

Sample Input 3:
Enter Number : 8

Sample Output 3:
Reverse of a Number : 8

--------------------------------------------------

Topics Involved:
- While Loop
- Digit Extraction
- Modulus Operator (%)
- Integer Division (/)
- Number Manipulation
- Mathematical Logic

Logic:

Step 1:
Read the number from the user.

Step 2:
Initialize a variable:
reversed = 0

Step 3:
Repeat while the number is greater than 0.

Step 4:
Extract the last digit using:
digit = n % 10

Step 5:
Append the digit to the reversed number:
reversed = reversed * 10 + digit

Step 6:
Remove the last digit from the original number:
n = n / 10

Step 7:
Repeat until the number becomes 0.

Step 8:
Print the reversed number.

Time Complexity:
O(d)

where d = number of digits.

Space Complexity:
O(1)

Reusable Pattern:
Digit Extraction + Reverse Number Pattern
(Extract last digit → Process it → Remove last digit)
*/

package level2_number_based_looping;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int reversed=0;
        while (n>0){
            int digits=n%10;
            reversed=reversed*10+digits;
            n=n/10;
        }
        System.out.print("Reverse of a Number : "+reversed);
    }
}
