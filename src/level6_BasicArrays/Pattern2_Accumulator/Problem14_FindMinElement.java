package level6_BasicArrays.Pattern2_Accumulator;

public class Problem14_FindMinElement {
    public static void main(String[] args) {
        int[] arr={1,4,2,7,9,3,5};
        int min=arr[0];
        for (int a:arr){
            if (a < min){
                min=a;
            }
        }
        System.out.println("Minimum Element : "+min);
    }
}
