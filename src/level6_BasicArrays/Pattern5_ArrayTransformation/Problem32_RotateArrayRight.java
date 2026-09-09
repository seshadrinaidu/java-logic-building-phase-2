package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem32_RotateArrayRight {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];
        int n=arr.length;
        for (int i=0;i<arr.length;i++){
            result[(i+1+n)%n]=arr[i];
        }
        for (int r:result){
            System.out.print(r+" ");
        }
    }
}
