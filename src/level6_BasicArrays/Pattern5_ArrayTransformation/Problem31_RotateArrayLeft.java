package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem31_RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        int n=arr.length;
        int[] result=new int[arr.length];
        for (int i=0;i<arr.length;i++){

            result[(i - 1 + n) % n] = arr[i];
        }
        for (int r:result){
            System.out.print(r+" ");
        }
    }
}
