package level1_basic_looping;

/*
Problem 3 : Print all even numbers from 1 to 100.

Sample Input:
No Input

Sample Output:
2
4
6
8
10
...
100

--------------------------------------------------

Topics Involved:
- for loop
- if statement
- Modulus operator (%)
- Conditional checking
- Iteration
- Console output

--------------------------------------------------

Logic:

Step 1:
Initialize the loop variable i with 1.

Step 2:
Run the loop while i <= 100.

Step 3:
Check whether i is even using:

i % 2 == 0

Step 4:
If the condition is true,
print the value of i.

Step 5:
Increment i by 1.

Step 6:
Repeat until i becomes 101.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop runs once for every number from 1 to 100.
In general, for a range from 1 to n, it performs n iterations.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only the loop variable (i) is used.
No extra memory or data structures are required.

--------------------------------------------------

Reusable Pattern:
Filtering Pattern

Pattern Template:

for(initialization; condition; update){
    if(condition){
        // Work
    }
}

This pattern is used when we need to iterate through a range
and process only the values that satisfy a condition.
*/
public class PrintEvenNumbers {
    public static void main(String[] args){
        for (int i=1;i<=100;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
