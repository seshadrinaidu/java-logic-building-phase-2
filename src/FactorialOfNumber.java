/*
Problem 10 : Print the factorial of a given number.

Sample Input 1:
Enter Number : 5

Sample Output 1:
120

Explanation:
5! = 1 × 2 × 3 × 4 × 5 = 120

--------------------------------------------------

Sample Input 2:
Enter Number : 1

Sample Output 2:
1

Explanation:
1! = 1

--------------------------------------------------

Sample Input 3:
Enter Number : 0

Sample Output 3:
1

Explanation:
By definition,
0! = 1

--------------------------------------------------

Topics Involved:
- for loop
- Running Product (Accumulator Pattern)
- Multiplication operator (*)
- Loop initialization
- Loop condition
- Loop increment
- User input using Scanner
- Console output

--------------------------------------------------

Logic:

Step 1:
Read the value of n.

Step 2:
Initialize fact = 1.

Step 3:
Run the loop from i = 1 to i <= n.

Step 4:
Multiply fact by the current value of i.

fact = fact * i

Step 5:
Repeat until the loop terminates.

Step 6:
Print the value of fact.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop executes n times.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only two integer variables (fact and i) are used.
No extra memory is required.

--------------------------------------------------

Reusable Pattern:
Running Product (Accumulator Pattern)

Pattern Template:

int product = 1;

for(...) {
    product *= value;
}

This pattern is used whenever we need to keep a cumulative
product while iterating through a sequence.
*/
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n= scanner.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
