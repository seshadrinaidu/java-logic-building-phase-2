package level1_basic_looping;/*
/*
Understanding of the Problem

Problem 2 : Print numbers from 1 to 100.

--------------------------------------------------

Understanding

-> The program should print numbers from 1 to 100.

-> There is no user input.

-> The starting value is 1.

-> The ending value is 100.

--------------------------------------------------

Choosing the Loop

-> I know both the starting point and the ending point.

-> The number of iterations is fixed.

-> Therefore, a for loop is the best choice.

--------------------------------------------------

Dry Run

Example:

for(int i = 1; i <= 5; i++)

Iteration 1:
i = 1
Print 1

Iteration 2:
i = 2
Print 2

Iteration 3:
i = 3
Print 3

Iteration 4:
i = 4
Print 4

Iteration 5:
i = 5
Print 5

Iteration 6:
i = 6

Condition becomes false.

Loop terminates.

--------------------------------------------------

Edge Case Testing

Case 1:
Start from 0

Output:
0 1 2 ... 100

Case 2:
End at 99

Output:
1 2 3 ... 99

Case 3:
Wrong condition

Example:

i < 100

Output:
1 to 99 only.

This reminds me to always check the boundary condition carefully.

--------------------------------------------------

Review

✓ Code is simple.

✓ No user input is required.

✓ No extra variables are required.

✓ A while loop can also solve this problem.

✓ Since the number of iterations is known beforehand, a for loop is the better choice.
*/

/**
 *          STEP BY CODE UNDERSTANDING
 */
/*
/*
Problem 2 : Print numbers from 1 to 100.

Sample Input:
No Input

Sample Output:
1 2 3 4 5 6 7 8 9 10 ... 100

--------------------------------------------------

Topics Involved:
- for loop
- Loop Initialization
- Loop Condition
- Loop Increment (i++)
- Iteration
- Console Output (System.out.print())

--------------------------------------------------

Logic:

Step 1:
Initialize the loop variable i with 1.

Step 2:
Check the condition:
i <= 100

Step 3:
If the condition is true,
print the current value of i.

Step 4:
Increment i by 1.

Step 5:
Repeat Steps 2–4 until i becomes 101.

Step 6:
When the condition becomes false,
terminate the loop.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop executes once for every number from 1 to 100.
In general, if the range is from 1 to n, the loop runs n times.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only one loop variable (i) is used.
No extra memory or data structures are required.

--------------------------------------------------

Reusable Pattern:
Counting Loop

Pattern Template:

for(initialization; condition; update){
    // Work
}

This pattern is used whenever we need to iterate through
a fixed range of numbers.
*/
public class Print1To100 {
     public static void main(String[] args){
         for (int i=1;i<=100;i++){
             System.out.print(i+" ");
         }
     }
}
