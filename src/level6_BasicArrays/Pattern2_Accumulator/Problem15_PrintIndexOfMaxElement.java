package level6_BasicArrays.Pattern2_Accumulator;

public class Problem15_PrintIndexOfMaxElement {
    public static void main(String[] args) {
        int[] arr={1,4,2,7,9,3,5};
        int max=arr[0];
        int maxIndex=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex=i;
            }
        }
           System.out.println("Index Of Max Element is : "+maxIndex);
        }

}
