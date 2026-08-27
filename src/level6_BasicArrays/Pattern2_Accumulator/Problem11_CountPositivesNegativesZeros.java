package level6_BasicArrays.Pattern2_Accumulator;

public class Problem11_CountPositivesNegativesZeros {
    public static void main(String[] args) {
        int[] arr={-1,2,0,-4,5,-1,0,7,-9};
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        for (int a:arr){
            if (a>0){
                positiveCount++;
            } else if (a<0) {
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println("Positive Elements Count : "+positiveCount);
        System.out.println("Negative Elements Count : "+negativeCount);
        System.out.println("Zero Elements Count : "+zeroCount);
    }
}
