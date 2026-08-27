package level6_BasicArrays.Pattern2_Accumulator;

public class Problem12_CountEvenOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int evenCount=0;
        int oddCount=0;
        for (int a:arr){
            if (a%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Count : "+evenCount);
        System.out.println("Odd Count : "+oddCount);
    }
}
