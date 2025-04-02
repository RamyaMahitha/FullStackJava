import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index of 3: " + index);
    }
}
