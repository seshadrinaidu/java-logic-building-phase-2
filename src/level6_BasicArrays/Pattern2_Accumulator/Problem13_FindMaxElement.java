package level6_BasicArrays.Pattern2_Accumulator;

public class Problem13_FindMaxElement {
    public static void main(String[] args) {
        int[] arr={1,4,2,7,9,3,5};
        int max=arr[0];
        for (int a:arr){
            if (a>max){
                max=a;
            }
        }
        System.out.println("Max Element : "+max);
    }
}
