/*
Problem 2: Count how many numbers between 1 and 500 are divisible by 7 but not by 5.

Understanding the Problem:
-> Traverse numbers from 1 to 500.
-> Check whether each number is divisible by 7.
-> Also check that it is NOT divisible by 5.
-> If both conditions are true, increase the count.
-> Finally print the total count.

Example:

14

14 % 7 == 0  -> true
14 % 5 != 0  -> true

Count++

-----------------------

35

35 % 7 == 0  -> true
35 % 5 != 0  -> false

Ignore

Choosing the Loop:
-> Start = 1
-> End = 500
-> Number of iterations is fixed.
-> for loop is suitable.

Dry Run:

count = 0

i = 1
Condition false

i = 7
Condition true
count = 1

i = 14
Condition true
count = 2

i = 21
Condition true
count = 3

...

Loop ends

Print count.

Edge Cases:
-> If no numbers satisfy the condition,
   count remains 0.
-> Count should be initialized before the loop.
-> Increment count only when both conditions are satisfied.

Review Solution:
-> Traverse numbers from 1 to 500.
-> Check multiple conditions using logical AND (&&).
-> Increase the counter whenever the condition is true.
-> Print the final count.
*/
package level5_LogicLoopCombination;

public class NumberDivisibleBy7NotBy5 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=500;i++){
            if (i%7==0 && i%5!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
