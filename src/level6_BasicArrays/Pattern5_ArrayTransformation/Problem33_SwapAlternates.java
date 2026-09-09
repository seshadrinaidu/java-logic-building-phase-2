package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem33_SwapAlternates {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                if (i+1<arr.length) {
                    result[i] = arr[i + 1];
                }else{
                    result[i]=arr[i];
                }
            }else{
                result[i]=arr[i-1];
            }
        }
        for (int r:result){
            System.out.print(r+" ");
        }
    }
}
