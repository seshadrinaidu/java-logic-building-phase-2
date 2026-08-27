package level6_BasicArrays.Pattern2_Accumulator;

public class Problem16_IndexOfMinElement {
    public static void main(String[] args) {
        int[] arr={4,2,7,9,3,5};
        int min=arr[0];
        int minIndex=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("Index of Minimum Element : "+minIndex);
    }
}
