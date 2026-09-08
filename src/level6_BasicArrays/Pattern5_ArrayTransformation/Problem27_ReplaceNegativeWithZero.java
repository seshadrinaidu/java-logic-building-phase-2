package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem27_ReplaceNegativeWithZero {
    public static void main(String[] args) {
     int[] arr={1, -2, 3, -4, 5};
     int[] result=new int[arr.length];

     for (int i=0;i<arr.length;i++){
         result[i] = Math.max(arr[i], 0);
     }
     for (int a:result){
         System.out.print(a+" ");
     }
    }
}
