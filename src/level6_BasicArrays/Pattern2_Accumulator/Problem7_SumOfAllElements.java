package level6_BasicArrays.Pattern2_Accumulator;

public class Problem7_SumOfAllElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        System.out.print("Total Sum Of Elements : "+sum);
    }
}
