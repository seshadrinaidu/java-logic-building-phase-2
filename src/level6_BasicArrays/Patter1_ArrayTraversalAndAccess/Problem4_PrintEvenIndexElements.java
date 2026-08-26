package level6_BasicArrays.Patter1_ArrayTraversalAndAccess;

public class Problem4_PrintEvenIndexElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
