package level6_BasicArrays.Pattern2_Accumulator;

public class Problem8_AverageOfArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int n=arr.length;
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        int avg=sum/n;
        System.out.print("Average of Array : "+avg);
    }
}
