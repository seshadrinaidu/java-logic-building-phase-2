/*
Problem 1: Print the Squares of Numbers from 1 to n

Sample Input 1:
Enter Number : 5

Sample Output 1:
1 4 9 16 25

Explanation:
Square of 1 = 1
Square of 2 = 4
Square of 3 = 9
Square of 4 = 16
Square of 5 = 25

--------------------------------------------------

Sample Input 2:
Enter Number : 3

Sample Output 2:
1 4 9

--------------------------------------------------

Sample Input 3:
Enter Number : 1

Sample Output 3:
1

--------------------------------------------------

Topics Involved:
- for loop
- User input using Scanner
- Mathematical formula
- Iteration

Logic:

Step 1:
Read the value of n.

Step 2:
Run a loop from 1 to n.

Step 3:
For each number,
calculate its square using:

square = i * i

Step 4:
Print the square.

Step 5:
Repeat until all numbers are processed.

Time Complexity:
O(n)

Reason:
The loop executes n times.

Space Complexity:
O(1)

Reason:
Only one loop variable is used.

Reusable Pattern:
- Loop + Mathematical Formula
- Sequence Generation Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class SquaresOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
    }
}
