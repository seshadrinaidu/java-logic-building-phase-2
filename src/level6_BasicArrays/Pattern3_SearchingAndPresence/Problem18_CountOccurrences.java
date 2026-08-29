package level6_BasicArrays.Pattern3_SearchingAndPresence;

public class Problem18_CountOccurrences {
    public static int countFrequency(int[] arr,int x){
        int count=0;
        for (int a:arr){
            if (a!=x){
                continue;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={10, 20, 10, 30, 10, 40};
        int x=10;
        int result=countFrequency(arr,x);
        System.out.println(x+" Appears "+result+" times");
    }
}
