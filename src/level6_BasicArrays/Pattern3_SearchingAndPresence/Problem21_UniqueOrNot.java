package level6_BasicArrays.Pattern3_SearchingAndPresence;

public class Problem21_UniqueOrNot {
    public static void main(String[] args) {
        int[] arr={10,20,30,20,40,50};
       boolean isUnique=true;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                  isUnique=false;
                  break;
                }
            }
            if (!isUnique){
                break;
            }
        }
        System.out.print(isUnique);
    }
}
