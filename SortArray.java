import java.util.Arrays;

public class SortArray {

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};

        // Sort in ascending order
        sortAscending(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        // Sort in descending order
        sortDescending(arr);
        System.out.println("Descending order: " + Arrays.toString(arr));
    }
}
