/*
Problem 4 : Print all odd numbers from 1 to 100.

Sample Input:
No Input

Sample Output:
1 3 5 7 9 11 13 ... 99

--------------------------------------------------

Topics Involved:
- for loop
- Loop increment (i += 2)
- if statement
- Modulus operator (%)
- Iteration
- Console output (System.out.print())

--------------------------------------------------

Logic:

Method 1:

Step 1:
Initialize the loop variable i with 1.

Step 2:
Run the loop while i <= 100.

Step 3:
Print the current value of i.

Step 4:
Increment i by 2 so that only odd numbers are visited.

Step 5:
Repeat until the condition becomes false.

--------------------------------------------------

Method 2:

Step 1:
Initialize the loop variable i with 1.

Step 2:
Run the loop while i <= 100.

Step 3:
Check if the number is odd using:

i % 2 != 0

Step 4:
If true, print the number.

Step 5:
Increment i by 1.

Step 6:
Repeat until i becomes 101.

--------------------------------------------------

Time Complexity:

Method 1:
O(n)

Reason:
The loop runs approximately n/2 times.

Method 2:
O(n)

Reason:
The loop checks every number from 1 to n.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only the loop variable is used.
No extra memory is required.

--------------------------------------------------

Reusable Patterns:

Pattern 1:
Stepping Loop

Template:

for(initialization; condition; update by 2){
    // Work
}

Used when only every second value (odd/even) needs to be processed.

------------------------------------------

Pattern 2:
Filtering Pattern

Template:

for(initialization; condition; update){
    if(condition){
        // Work
    }
}

Used when iterating through a range and selecting only values that satisfy a condition.
*/

public class PrintOddNumbers {
    public static void main(String[] args){
        System.out.print("Method 1: ");
        for (int i=1;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Method 2: ");
        for(int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }

}
