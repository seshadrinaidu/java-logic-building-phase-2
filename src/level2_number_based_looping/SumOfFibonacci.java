/*
Problem 10: Print the Sum of the First n Terms of the Fibonacci Series

Sample Input 1:
Enter N : 6

Sample Output 1:
0 1 1 2 3 5

12

Explanation:
Fibonacci Series:
0 + 1 + 1 + 2 + 3 + 5 = 12

--------------------------------------------------

Sample Input 2:
Enter N : 1

Sample Output 2:
0

0

--------------------------------------------------

Sample Input 3:
Enter N : 2

Sample Output 3:
0 1

1

--------------------------------------------------

Sample Input 4:
Enter N : 0

Sample Output 4:
Invalid

--------------------------------------------------

Topics Involved:
- for loop
- Conditional statements (if)
- Variable shifting
- Accumulator pattern
- Fibonacci sequence
- User input using Scanner

Logic:

Step 1:
Read the number of terms (n).

Step 2:
If n <= 0,
print "Invalid" and stop.

Step 3:
Initialize:
a = 0
b = 1
sum = 0

Step 4:
Print the first term (0).

Step 5:
If n > 1:
- Print the second term (1).
- Add it to sum.

Step 6:
Loop from the 3rd term to the nth term.

Step 7:
Inside the loop:
- Calculate:
      c = a + b
- Print c.
- Add c to sum.
- Update:
      a = b
      b = c

Step 8:
Print the final sum.

Time Complexity:
O(n)

Reason:
The loop executes (n - 2) times.
Each iteration performs constant-time operations.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Variable Shifting Pattern
- Accumulator Pattern
- Sequence Generation Pattern
*/

package level2_number_based_looping;

import java.util.Scanner;

public class SumOfFibonacci {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=scanner.nextInt();
       int a=0;
       int b=1;
       int sum=0;

       if (n<=0){
           System.out.print("Invalid");
           return;
       }
       System.out.print(a);
       if (n>1){
           System.out.print(" "+b);
           sum+=b;
       }
       int c;
       for (int i=2;i<n;i++){
           c=a+b;
           System.out.print(" "+c);
           sum+=c;
           a=b;
           b=c;

       }
      System.out.println("\n"+sum);


    }
}
