package level6_BasicArrays.Pattern4_ConditionalPredicateBasedCounting;

public class Problem23_CountDivisibleBy3And5 {
    public static void main(String[] args) {
        int[] arr={10,15,30,22,45,60,7};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%3==0 && arr[i]%5==0){
                count++;
            }

        }
        System.out.print(count);
    }
}
