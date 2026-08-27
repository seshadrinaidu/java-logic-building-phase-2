package level6_BasicArrays.Patter1_ArrayTraversalAndAccess;

public class Problem5_PrintOddIndexElements {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        for (int i=0;i<arr.length;i++){
            if (i%2!=0){
                System.out.println("Index : "+i+" "+"Elements: "+arr[i]);
            }
        }
    }
}
