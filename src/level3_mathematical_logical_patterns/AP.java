/*
Problem 9: Print the first n terms of an Arithmetic Progression (AP)

Sample Input:
First term (a) : 2
Common difference (d) : 3
Number of terms (n) : 5

Sample Output:
2 5 8 11 14

Explanation:
Formula:

Term = a + (i × d)

where

a = First term

d = Common difference

i = Current position starting from 0

--------------------------------------------------

Sample Input:
a = 10
d = 5
n = 6

Sample Output:
10 15 20 25 30 35

--------------------------------------------------

Topics Involved:
- for loop
- Mathematical Formula
- Arithmetic Progression (AP)
- Sequence Generation
- User-defined variables

Logic:

Step 1:
Initialize the first term (a).

Step 2:
Initialize the common difference (d).

Step 3:
Initialize the number of terms (n).

Step 4:
Run a loop from 0 to n-1.

Step 5:
For every iteration,
calculate:

term = a + (i × d)

Step 6:
Print each term.

Time Complexity:
O(n)

Reason:
One iteration is performed for each term.

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

Reusable Pattern:
- Sequence Generation Pattern
- Formula-Based Computation Pattern
*/
package level3_mathematical_logical_patterns;

import java.util.Scanner;

public class AP {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a : ");
        int a=scanner.nextInt();
        System.out.print("enter d :");
        int d=scanner.nextInt();
        System.out.print("enter n :");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            System.out.print(a+i*d+" ");
        }
    }
}
