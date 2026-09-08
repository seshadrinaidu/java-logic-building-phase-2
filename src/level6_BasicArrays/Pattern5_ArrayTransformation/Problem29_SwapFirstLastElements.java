package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem29_SwapFirstLastElements {
    public static void main(String[] args) {
        int[] arr={10,20};
        int[] result=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
        int temp=result[0];
        result[0]=result[result.length-1];
        result[result.length-1]=temp;

        for (int a:result){
            System.out.print(a+" ");
        }
    }
}
