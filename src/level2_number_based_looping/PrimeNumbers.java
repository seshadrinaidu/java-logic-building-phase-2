/*
Problem 7: Print all Prime Numbers between 1 and 100

Sample Output:

2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97

--------------------------------------------------

Explanation:

A prime number is a number that has exactly
two factors:

1 and itself.

Examples:

2 → Prime

Factors:
1, 2

--------------------

9 → Not Prime

Factors:
1, 3, 9

--------------------

17 → Prime

Factors:
1, 17

--------------------------------------------------

Topics Involved:

- Nested for loops
- Conditional statements (if)
- Boolean flag
- Modulus operator (%)
- Break statement
- Prime number logic

Logic:

Step 1:
Loop from 2 to 100.

Step 2:
Assume the current number is prime.

Step 3:
Check every number from 2 to (current number - 1).

Step 4:
If any number divides it exactly,
mark it as not prime
and stop checking further.

Step 5:
If it remains prime,
print it.

Time Complexity:

Outer Loop = 99 iterations

Inner Loop = up to n iterations

Overall:

O(n²)

For this problem,
n = 100.

Space Complexity:

O(1)

Reusable Pattern:

Nested Loop + Flag Variable + Break

 */

package level2_number_based_looping;

public class PrimeNumbers {
    public static void main(String[] args){
        for (int i=2;i<=100;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
