/*
Problem 7 : Print the sum of the first n natural numbers.

Sample Input 1:
Enter the Number : 5

Sample Output 1:
15

Explanation:
1 + 2 + 3 + 4 + 5 = 15

--------------------------------------------------

Sample Input 2:
Enter the Number : 1

Sample Output 2:
1

--------------------------------------------------

Sample Input 3:
Enter the Number : 0

Sample Output 3:
0

--------------------------------------------------

Topics Involved:
- for loop
- Loop initialization
- Loop condition
- Loop increment
- Running sum (Accumulator Pattern)
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
Add the current value of i to sum.

Step 5:
Repeat until the loop ends.

Step 6:
Print the final value of sum.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop executes n times.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only two integer variables (sum and i) are used.
No extra memory is required.

--------------------------------------------------

Reusable Pattern:
Running Sum (Accumulator Pattern)

Pattern Template:

int sum = 0;

for(...) {
    sum += value;
}

This pattern is used whenever we need to keep a cumulative total while iterating.
*/
import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
