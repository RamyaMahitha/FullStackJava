import java.util.*;

public class setexample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // Duplicate won't be added
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(16);
        hashSet.add(15);
        hashSet.add(23);
        hashSet.add(22); // Duplicate won't be added
        hashSet.add(50);
        hashSet.add(61);
        hashSet.add(71);

        Set<Integer> treeSet = new TreeSet<>(hashSet); // Sorted set

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
