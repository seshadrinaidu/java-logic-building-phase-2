/*
Problem 9 : Print the sum of all odd numbers up to n.

Sample Input 1:
Enter N : 10

Sample Output 1:
Sum of Odd Numbers : 25

Explanation:
1 + 3 + 5 + 7 + 9 = 25

--------------------------------------------------

Sample Input 2:
Enter N : 7

Sample Output 2:
Sum of Odd Numbers : 16

Explanation:
1 + 3 + 5 + 7 = 16

--------------------------------------------------

Sample Input 3:
Enter N : 1

Sample Output 3:
Sum of Odd Numbers : 1

Explanation:
Only one odd number exists between 1 and 1.

--------------------------------------------------

Topics Involved:
- for loop
- if statement
- Modulus operator (%)
- Running Sum (Accumulator Pattern)
- Filtering Pattern
- User input using Scanner
- Console output

--------------------------------------------------

Logic:

Step 1:
Read the value of n.

Step 2:
Initialize sum = 0.

Step 3:
Run the loop from i = 1 to i <= n.

Step 4:
Check whether i is odd using:

i % 2 != 0

Step 5:
If the condition is true,
add i to sum.

Step 6:
Repeat until the loop terminates.

Step 7:
Print the final value of sum.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop iterates from 1 to n and checks every number once.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only two integer variables (sum and i) are used.
No extra memory is required.

--------------------------------------------------

Reusable Pattern:
Filtering + Running Sum (Accumulator Pattern)

Pattern Template:

int sum = 0;

for(...) {
    if(condition) {
        sum += value;
    }
}

This pattern is used when we need to iterate through a range,
filter values based on a condition,
and accumulate their sum.
*/
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of Odd Numbers : "+sum);
    }
}
