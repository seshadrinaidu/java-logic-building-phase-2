/*
Problem 3: Print all palindrome numbers between 1 and 500.

Understanding the Problem:
-> Traverse numbers from 1 to 500.
-> Reverse each number.
-> Compare the reversed number with the original number.
-> If both are equal, print the number.

Example:

121

Reverse = 121

121 == 121

Print 121

------------------------

142

Reverse = 241

142 != 241

Do not print.

Choosing the Loop:
-> Numbers range from 1 to 500.
-> Fixed number of iterations.
-> Use a for loop.
-> Use a while loop to reverse each number.

Dry Run:

i = 141

temp = 141
reversed = 0

digit = 1
reversed = 1
temp = 14

digit = 4
reversed = 14
temp = 1

digit = 1
reversed = 141
temp = 0

Compare:

141 == 141

Print 141

--------------------------------

i = 142

Reverse = 241

142 != 241

Do not print.

Edge Cases:
-> Single-digit numbers are also palindromes.
-> Use a temporary variable because reversing modifies the number.
-> Reset 'reversed' for every new number.

Review Solution:
-> Traverse numbers from 1 to 500.
-> Reverse each number using digit extraction.
-> Compare the original and reversed numbers.
-> Print only palindrome numbers.
*/
package level5_LogicLoopCombination;

public class PrintAllPalindromeNumbers {
    public static void main(String[] args) {
        for (int i=1;i<=500;i++){
            int temp=i;
            int reversed=0;
            while (temp>0){
                int digit=temp%10;
                reversed=reversed*10+digit;
                temp=temp/10;
            }
            if (i==reversed){
                System.out.print(i+" ");
            }
        }
    }
}
