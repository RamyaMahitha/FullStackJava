 import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));

        Collections.sort(numbers);  // Sort in ascending order
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers); // Reverse order
        System.out.println("Reversed: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Max: " + max + ", Min: " + min);
    }
}

