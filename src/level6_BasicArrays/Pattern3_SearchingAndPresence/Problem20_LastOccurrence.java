package level6_BasicArrays.Pattern3_SearchingAndPresence;

public class Problem20_LastOccurrence {
    public static int lastOccurrence(int[] arr,int x){

        int lastOccurrence=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                lastOccurrence=i;
            }

        }
        return lastOccurrence;
    }
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 20, 40, 20};
        int x=20;
        int result=lastOccurrence(arr,x);
        System.out.println("last occurrences = index "+result);
    }
}
