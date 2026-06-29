package level1_basic_looping;/*
Problem 11 : Print the product of digits of a given number.

Sample Input 1:
Enter Number : 1234

Sample Output 1:
Product of Digits : 24

Explanation:
1 × 2 × 3 × 4 = 24

--------------------------------------------------

Sample Input 2:
Enter Number : 505

Sample Output 2:
Product of Digits : 0

Explanation:
5 × 0 × 5 = 0

--------------------------------------------------

Sample Input 3:
Enter Number : 7

Sample Output 3:
Product of Digits : 7

Explanation:
The number has only one digit.

--------------------------------------------------

Topics Involved:
- while loop
- Digit Extraction
- Modulus operator (%)
- Integer division (/)
- Running Product (Accumulator Pattern)
- User input using Scanner
- Console output

--------------------------------------------------

Logic:

Step 1:
Read the number from the user.

Step 2:
Initialize product = 1.

Step 3:
Run the loop while n > 0.

Step 4:
Extract the last digit using:

digit = n % 10

Step 5:
Multiply the digit with product.

product *= digit

Step 6:
Remove the last digit using:

n = n / 10

Step 7:
Repeat until n becomes 0.

Step 8:
Print the final product.

--------------------------------------------------

Time Complexity:
O(d)

Reason:
The loop executes once for each digit in the number.

Here,
d = number of digits.

--------------------------------------------------

Space Complexity:
O(1)

Reason:
Only a few integer variables are used.
No extra memory is required.

--------------------------------------------------

Reusable Pattern:
Digit Extraction + Running Product

Pattern Template:

int product = 1;

while(number > 0){

    digit = number % 10;

    product *= digit;

    number /= 10;
}

This pattern is used whenever we need to process
each digit of a number individually.
*/
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int product=1;
        while (n>0){
            int digit=n%10;
            product*=digit;
            n=n/10;
        }
        System.out.println("Product of Digits : "+product);
    }
}
