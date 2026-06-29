package level2_number_based_looping;/*
Level 2 - Number Based Looping Logic

Problem 1 : Count the number of digits in a given number.

Sample Input 1:
Enter Number : 12345

Sample Output 1:
5

Explanation:
The number 12345 has 5 digits.

--------------------------------------------------

Sample Input 2:
Enter Number : 7

Sample Output 2:
1

Explanation:
The number has only one digit.

--------------------------------------------------

Sample Input 3:
Enter Number : 9080

Sample Output 3:
4

Explanation:
Digits are 9, 0, 8, 0.

--------------------------------------------------

Topics Involved:
- while loop
- Digit Extraction
- Modulus operator (%)
- Integer division (/)
- Counter Pattern
- User input using Scanner
- Console output

--------------------------------------------------

Logic:

Step 1:
Read the number from the user.

Step 2:
Initialize digitCount = 0.

Step 3:
Run the loop while n > 0.

Step 4:
Extract the last digit using:

digit = n % 10

Step 5:
Increase digitCount by 1.

Step 6:
Remove the last digit using:

n = n / 10

Step 7:
Repeat until n becomes 0.

Step 8:
Print digitCount.

--------------------------------------------------

Time Complexity:
O(d)

Reason:
The loop executes once for each digit.

Here,
d = number of digits.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.

--------------------------------------------------

Reusable Pattern:
Digit Extraction + Counter Pattern

Pattern Template:

int count = 0;

while(number > 0){

    digit = number % 10;

    count++;

    number /= 10;
}

This pattern is used whenever we need to visit
each digit and count something.
*/
import  java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int digitsCount=0;
        while (n>0){
            int digits=n%10;
            digitsCount++;
            n=n/10;
        }
        System.out.println("Total Digits Of a given number : "+digitsCount);
    }
}
