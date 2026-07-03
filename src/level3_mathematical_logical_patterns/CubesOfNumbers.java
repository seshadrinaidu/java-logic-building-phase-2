/*
Problem 2: Print the Cubes of Numbers from 1 to n

Sample Input 1:
Enter N : 5

Sample Output 1:
1 8 27 64 125

Explanation:
Cube of 1 = 1
Cube of 2 = 8
Cube of 3 = 27
Cube of 4 = 64
Cube of 5 = 125

--------------------------------------------------

Sample Input 2:
Enter N : 3

Sample Output 2:
1 8 27

--------------------------------------------------

Sample Input 3:
Enter N : 1

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
calculate its cube using:

cube = i * i * i

Step 4:
Print the cube.

Step 5:
Repeat until all numbers are processed.

Time Complexity:
O(n)

Reason:
The loop executes exactly n times.

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

public class CubesOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i*i*i+" ");
        }
    }
}
