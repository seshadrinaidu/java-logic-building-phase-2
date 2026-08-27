package level6_BasicArrays.Patter1_ArrayTraversalAndAccess;

public class Problem6_PrintGreaterThanK {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int k=25;
        for (int a:arr){
            if (a>k){
                System.out.print(a+" ");
            }
        }
    }
}
