package level6_BasicArrays.Patter1_ArrayTraversalAndAccess;

import java.util.Scanner;

public class Problem2_PrintElementsWithIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input N : ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("Index "+i+" = "+arr[i]);
        }
    }

}
