/*
Problem 1: Print all numbers whose sum of digits is even (1–100)

Understanding the Problem:
-> Traverse numbers from 1 to 100.
-> Find the sum of digits for each number.
-> Check whether the digit sum is even.
-> If the sum is even, print the original number along with its digit sum.

Example:

35
Digits: 3 + 5 = 8
8 is even
Output:
35 = 8

47
Digits: 4 + 7 = 11
11 is odd
Do not print.

Choosing the Loop:
-> Use a for loop to traverse numbers from 1 to 100.
-> Use a while loop to extract digits of each number.
-> Use an accumulator variable to calculate the digit sum.
-> Use an if condition to check whether the sum is even.

Dry Run:

i = 35

temp = 35
sum = 0

Iteration 1:
digit = 5
sum = 5
temp = 3

Iteration 2:
digit = 3
sum = 8
temp = 0

Loop ends.

sum % 2 == 0
Yes

Print:
35 = 8

------------------------------------------------

i = 47

temp = 47
sum = 0

digit = 7
sum = 7

digit = 4
sum = 11

11 % 2 != 0

Do not print.

Edge Cases:
-> Numbers having only one digit.
-> Number 100 (digit sum = 1).
-> Sum variable must be reset for every new number.
-> Use a temporary variable because digit extraction modifies the original number.

Review Solution:
-> Traverse every number from 1 to 100.
-> Copy the current number into a temporary variable.
-> Extract every digit using %10.
-> Accumulate the digit sum.
-> Check whether the sum is even.
-> Print the original number and its digit sum.
*/
package level5_LogicLoopCombination;

public class SumOfDigitsEven {
    public static void main(String[] args) {


       for(int i=1;i<=100;i++) {
           int sum=0;
           int temp=i;
           while (temp>0) {
               int digit = temp % 10;
               sum += digit;

               temp = temp / 10;
           }
           if (sum%2==0) {
               System.out.println(i + "=" + sum);
           }
       }
    }
}
