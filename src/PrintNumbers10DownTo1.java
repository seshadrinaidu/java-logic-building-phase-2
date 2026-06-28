/*
Problem 5 : Print numbers from 10 down to 1.

Sample Input:
No Input

Sample Output:
10 9 8 7 6 5 4 3 2 1

--------------------------------------------------

Topics Involved:
- for loop
- Reverse iteration
- Loop initialization
- Loop condition
- Loop decrement (i--)
- Console output (System.out.print())

--------------------------------------------------

Logic:

Step 1:
Initialize the loop variable i with 10.

Step 2:
Run the loop while i >= 1.

Step 3:
Print the current value of i.

Step 4:
Decrement i by 1.

Step 5:
Repeat Steps 2–4 until i becomes 0.

Step 6:
When the condition becomes false,
terminate the loop.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop executes once for each number from 10 down to 1.
In general, for a range of n numbers, it performs n iterations.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only one loop variable is used.
No extra memory is required.

--------------------------------------------------

Reusable Pattern:
Reverse Counting Pattern

Pattern Template:

for(initialization; condition; decrement){
    // Work
}

This pattern is used whenever we need to iterate
backwards through a sequence or range.
*/
public class PrintNumbers10DownTo1  {
    public static void main(String[] args){
        for (int i=5;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
