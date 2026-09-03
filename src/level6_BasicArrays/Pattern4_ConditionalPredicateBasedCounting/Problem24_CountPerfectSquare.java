package level6_BasicArrays.Pattern4_ConditionalPredicateBasedCounting;

public class Problem24_CountPerfectSquare {
    public static void main(String[] args) {
        int[] arr={4,7,9,10,25,16,20};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                int sqrt=(int) Math.sqrt(arr[i]);
                if (sqrt*sqrt==arr[i]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
