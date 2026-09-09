package level6_BasicArrays.Pattern5_ArrayTransformation;

public class Problem28_CopyOneArrayAnother {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Manual Allocation
        int[] result = new int[arr.length];

        // Manual Element Transfer
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}