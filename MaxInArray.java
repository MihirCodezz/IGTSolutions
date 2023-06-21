public class MaxInArray {

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element as the maximum

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update the maximum if a larger element is found
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};

        int max = findMax(arr);

        System.out.println("The maximum element in the array is: " + max);
    }
}
