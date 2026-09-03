package level6_BasicArrays.Pattern4_ConditionalPredicateBasedCounting;

public class Problem22_CountPrimeNumbers {

    public static void main(String[] args) {
        int[] arr={10,7,4,13,20,17};
        int primeCount=0;
        for (int i=0;i<arr.length;i++){
            int current=arr[i];
            boolean isPrime=true;
            if (current<=1){
                isPrime=false;
            }else{
                for (int j=2;j<=Math.sqrt(current);j++){
                    if (current%j==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if (isPrime){
                primeCount++;
            }
        }
        System.out.print(primeCount);
    }
}
