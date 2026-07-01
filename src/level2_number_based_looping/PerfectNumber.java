/*
Problem 6: Check if a given number is a Perfect Number

Sample Input 1:
Enter Number : 6

Sample Output 1:
Perfect Number

Explanation:
Factors of 6:
1, 2, 3

Sum = 1 + 2 + 3 = 6

Since the sum of proper factors equals the number,
6 is a Perfect Number.

--------------------------------------------------

Sample Input 2:
Enter Number : 28

Sample Output 2:
Perfect Number

Explanation:
Factors:
1, 2, 4, 7, 14

Sum = 1 + 2 + 4 + 7 + 14 = 28

--------------------------------------------------

Sample Input 3:
Enter Number : 12

Sample Output 3:
Not Perfect Number

Explanation:
Factors:
1, 2, 3, 4, 6

Sum = 16

16 ≠ 12

--------------------------------------------------

Topics Involved:
- For loop
- Modulus operator (%)
- Conditional statements (if)
- Factor finding
- Accumulator pattern
- Number property checking

Logic:

Step 1:
Read the number.

Step 2:
Initialize sum = 0.

Step 3:
Loop from 1 to n-1.

Step 4:
If the current number divides n exactly,
add it to sum.

Step 5:
After the loop,
compare sum with n.

If both are equal,
print "Perfect Number".

Otherwise,
print "Not Perfect Number".

Time Complexity:
O(n)

Space Complexity:
O(1)

Reusable Pattern:
Factor Finding + Accumulator + Comparison
*/
package level2_number_based_looping;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (n==sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
