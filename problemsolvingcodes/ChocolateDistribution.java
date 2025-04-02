import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = {10, 3, 12, 3, 1};  
        int n = arr.length;
        int m = 3;  // Number of students
        if (m > n) {
            System.out.println("Not enough chocolates to distribute.");
            return;
        }

        Arrays.sort(arr); // Sort the array

        int minv = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int r = i + m - 1;  // Correct index for r
            int mindiff = arr[r] - arr[i]; // Correct calculation
            if (mindiff < minv) {
                minv = mindiff;
            }
        }

        System.out.println("Minimum difference: " + minv);
    }
}
