public class MinInArray {

    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element as the minimum

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update the minimum if a smaller element is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};

        int min = findMin(arr);

        System.out.println("The minimum element in the array is: " + min);
    }
}
