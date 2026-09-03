package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem25_CreateArrayOfSquare {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] sqr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
           sqr[i]=arr[i]*arr[i];
        }
        for (int s:sqr){
            System.out.print(s+" ");
        }
    }
}
