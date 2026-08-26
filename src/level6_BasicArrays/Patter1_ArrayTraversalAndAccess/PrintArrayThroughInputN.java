/*
Problem 1 : Take an user Input N and print the array elements scanner
problem understanding :
 -> take an user input
 -> create an array and pass the user input to the array
 -> use for or enhanced for loop for traversal and enter the elements to the array
 -> to print array in console use for or enhanced for loop print the elements

 step by step logic :
 Algorithm:
 1.take a user input
   i.e., int n=scanner.nextInt()
 2.initialize an array and pass the input value to the array
 3.use for loop for n iterations to store elements in the array
 4.print the array using traversal

 Example :
 1. Input  N = 5
    Output:
    Enter Array Elements:1
    Enter Array Elements:2
    Enter Array Elements:4
    Enter Array Elements:5
    Enter Array Elements:10
 2. Input  N = 10
    Output:
    Enter Array Elements:1
    Enter Array Elements:2
    Enter Array Elements:4
    Enter Array Elements:5
    Enter Array Elements:10
    Enter Array Elements:1
    Enter Array Elements:90
    Enter Array Elements:43
    Enter Array Elements:51
    Enter Array Elements:1

Time and Space Complexity : O(n)
why? ->
  -> first loop n  times to read the input values into the array
  -> then loop again n times to print array
  total work = 2n
  ->but  constants are ignored in Big -O -> O(n)
 Space Complexity :
  -> created an array of size n
  -> that requires memory proportional to n
  -> Apart from the array,  I used a few variables (scanner, n, i, etc.),
     which are constant space → O(1).
  -> the dominant space usage is the array itself -> O(n)


 */
package level6_BasicArrays.Patter1_ArrayTraversalAndAccess;

import java.util.Scanner;

public class PrintArrayThroughInputN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input N : ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
       for (int i=0;i<arr.length;i++){
           System.out.print("Enter Array Elements: ");
           arr[i]= scanner.nextInt();

       }
       for (int a:arr){
           System.out.print(a+" ");
       }
       scanner.close();
    }
}
