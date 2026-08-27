package level6_BasicArrays.Pattern2_Accumulator;

public class Problem10_SumOFOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int oddSum=0;
        for (int a:arr){
            if (a%2!=0){
                oddSum+=a;
            }
        }
        System.out.print("Odd Elements sum : "+oddSum);
    }
}
