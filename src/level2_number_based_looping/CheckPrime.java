/*
Problem 8: Check whether a given number is Prime or Not

Sample Input 1:
Enter Number : 17

Sample Output 1:
Prime

Explanation:
17 is divisible only by
1 and 17.

--------------------------------------------------

Sample Input 2:
Enter Number : 12

Sample Output 2:
Not Prime

Explanation:
12 is divisible by
2, 3, 4 and 6.

--------------------------------------------------

Sample Input 3:
Enter Number : 1

Sample Output 3:
Not Prime

Explanation:
Prime numbers are greater than 1.

--------------------------------------------------

Topics Involved:

- For loop
- Conditional statements (if-else)
- Boolean flag
- Modulus operator (%)
- Break statement
- Mathematical optimization (√n)

Logic:

Step 1:
Read the number.

Step 2:
If the number is less than or equal to 1,
it is not prime.

Step 3:
Assume the number is prime.

Step 4:
Check divisibility from 2 up to √n.

Step 5:
If any divisor is found,
mark it as not prime
and stop checking further.

Step 6:
Print the result.

Time Complexity:

O(√n)

Space Complexity:

O(1)

Reusable Pattern:

Optimized Factor Checking + Boolean Flag + Break
*/
package level2_number_based_looping;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        boolean isPrime=true;
        if (n<=1){
            isPrime=false;
        }else {
            for (int i=2;i*i<=n;i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
