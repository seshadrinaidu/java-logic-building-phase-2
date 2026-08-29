package level6_BasicArrays.Pattern3_SearchingAndPresence;
 class Problem17_SearchingElement {
     public static boolean found(int[] arr,int x){
         for (int a:arr){
             if (a==x){
                 return true;
             }
         }
         return false;
     }
     public static void main(String[] args) {
         int[] arr = {10, 25, 7, 40, 15};
         int x = 40;
         boolean result=found(arr,x);
         System.out.println("Element Found? "+x+" -> "+result);

     }
}
