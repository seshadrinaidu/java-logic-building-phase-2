package level6_BasicArrays.Pattern2_Accumulator;

public class Problem9_SumOfEven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,7};
        int evenSum=0;
        for (int a:arr){
            if (a%2==0){
                evenSum+=a;
            }
        }
        System.out.print("Even Sum : "+evenSum);
    }
}
