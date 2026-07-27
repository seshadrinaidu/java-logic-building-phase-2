/*
Problem 4: Print numbers between 1 and 100 whose sum of digits is a multiple of 3.

Understanding the Problem:
-> Traverse numbers from 1 to 100.
-> Find the sum of digits of each number.
-> Check whether the digit sum is divisible by 3.
-> If true, print the original number.

Example:

24

Digits:
2 + 4 = 6

6 % 3 == 0

Print 24

------------------------

35

Digits:
3 + 5 = 8

8 % 3 != 0

Do not print.

Choosing the Loop:
-> Start = 1
-> End = 100
-> Number of iterations is fixed.
-> Use a for loop to traverse.
-> Use a while loop for digit extraction.

Dry Run:

i = 24

temp = 24
sum = 0

digit = 4
sum = 4
temp = 2

digit = 2
sum = 6
temp = 0

6 % 3 == 0

Print 24

--------------------------------

i = 35

sum = 8

8 % 3 != 0

Do not print.

Edge Cases:
-> Single-digit numbers.
-> Number 100 (digit sum = 1).
-> Reset sum for every new number.
-> Use a temporary variable because digit extraction modifies the number.

Review Solution:
-> Traverse numbers from 1 to 100.
-> Find the digit sum using digit extraction.
-> Check whether the sum is divisible by 3.
-> Print the original number if the condition is satisfied.
*/
package level5_LogicLoopCombination;

public class SumOfDigitsMultipleOf3 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            int temp=i;
            int sum=0;
            while (temp>0){
                int digit=temp%10;
                sum+=digit;
                temp=temp/10;
            }
            if (sum%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
