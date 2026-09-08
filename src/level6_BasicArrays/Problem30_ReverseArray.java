package level6_BasicArrays;

public class Problem30_ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];
        for (int i=0;i<arr.length;i++){
           result[arr.length-1-i]=arr[i];
        }
        for (int r:result){
            System.out.print(r+" ");
        }


    }
}
