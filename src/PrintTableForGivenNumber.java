/*
Problem 6 : Print the multiplication table of a given number (n × 1 to n × 10).

Sample Input:
Enter Number : 5

Sample Output:
5 × 1 = 5
5 × 2 = 10
5 × 3 = 15
5 × 4 = 20
5 × 5 = 25
5 × 6 = 30
5 × 7 = 35
5 × 8 = 40
5 × 9 = 45
5 × 10 = 50

--------------------------------------------------

Topics Involved:
- while loop
- Loop initialization
- Loop condition
- Loop increment
- Multiplication operator
- User input using Scanner
- Console output

--------------------------------------------------

Logic:

Step 1:
Read the number from the user.

Step 2:
Initialize i = 1.

Step 3:
Run the loop while i <= 10.

Step 4:
Print

number × i = number * i

Step 5:
Increment i by 1.

Step 6:
Repeat until i becomes 11.

--------------------------------------------------

Time Complexity:
O(n)

Reason:
The loop executes 10 times.
In general, if the table is printed up to n multiples,
the loop runs n times.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only two integer variables are used.

--------------------------------------------------

Reusable Pattern:
Counter-Controlled Loop

Template:

initialize

while(condition)
{
    work
    update
}

This pattern is used whenever we repeatedly perform
an operation a fixed number of times.
*/

public class PrintTableForGivenNumber {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
/**
 *     OTHER POSSIBLE WAYS TO PRINT TABLE OF A GIVEN NUMBER
 */
/*
import java.util.Scanner;
public class PrintTableForGivenNumber {
    static void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Given Number is : ");
        int n=scanner.nextInt();
        printTable(n);
    }
}
*//*
import java.util.Scanner;
public class PrintTableForGivenNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
}*/