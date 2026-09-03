package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem26_CreateArrayContainsEven {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 6, 7, 8};
        int evenCount=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                evenCount++;
            }
        }
        int[] result=new int[evenCount];
        int resultIndex=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                result[resultIndex]=arr[i];
                resultIndex++;
            }
        }
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
