package level6_BasicArrays.Pattern3_SearchingAndPresence;

public class Problem19_FirstOccurrence {
    public static int firstFrequency(int[] arr,int x){


        for (int i=0;i<arr.length;i++){
            if (arr[i]!=x){
                continue;
            }
            return i;
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 20, 40, 20};
        int x=20;
        int result=firstFrequency(arr,x);
        System.out.println("First occurrences = index "+result);
    }
}
