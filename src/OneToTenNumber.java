/*
Problem 1 : Print numbers from 1 to 10.

Sample Input:
No Input

Sample Output:
1
2
3
4
5
6
7
8
9
10

--------------------------------------------------

Topics Involved:
- for loop
- Loop initialization
- Loop condition
- Loop increment (i++)
- Iteration
- Console output (System.out.println())

Logic:

Step 1:
Initialize the loop variable i with 1.

Step 2:
Check the condition:
i <= 10

Step 3:
If the condition is true,
print the current value of i.

Step 4:
Increment i by 1.

Step 5:
Repeat Steps 2–4 until i becomes 11.

Step 6:
When the condition becomes false,
terminate the loop.

Time Complexity:
O(n)

Space Complexity:
O(1)
*/
public class OneToTenNumber {
    public static void main(String[] args){
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
