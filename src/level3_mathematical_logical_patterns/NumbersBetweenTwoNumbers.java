/*
Problem 3: Print all numbers between a and b divisible by 7

Sample Input 1:
Enter a : 10
Enter b : 35

Sample Output 1:
14
21
28
35

Explanation:
The numbers divisible by 7 between 10 and 35 are:
14, 21, 28 and 35.

--------------------------------------------------

Sample Input 2:
Enter a : 1
Enter b : 20

Sample Output 2:
7
14

--------------------------------------------------

Sample Input 3:
Enter a : 49
Enter b : 49

Sample Output 3:
49

--------------------------------------------------

Sample Input 4:
Enter a : 30
Enter b : 10

Sample Output 4:
Invalid range

--------------------------------------------------

Topics Involved:
- for loop
- User input using Scanner
- Modulus operator (%)
- Conditional statements (if)
- Range traversal

Logic:

Step 1:
Read the starting number (a).

Step 2:
Read the ending number (b).

Step 3:
If a > b,
print "Invalid range".

Step 4:
Run a loop from a to b.

Step 5:
For every number,
check:

number % 7 == 0

Step 6:
If true,
print the number.

Step 7:
Continue until the loop reaches b.

Time Complexity:
O(b - a + 1)

Reason:
The loop checks every number once in the given range.

Space Complexity:
O(1)

Reason:
Only a few variables are used.

Reusable Pattern:
- Range Traversal Pattern
- Divisibility Filtering Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class NumbersBetweenTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a :");
        int a=scanner.nextInt();
        System.out.print("Enter b : ");
        int b=scanner.nextInt();
        if (a > b) {
            System.out.println("Invalid range");
            return;
        }
        for (int i=a;i<=b;i++){
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}
