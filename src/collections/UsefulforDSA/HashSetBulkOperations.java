package collections.UsefulforDSA;

import java.util.HashSet;
import java.util.Set;

public class HashSetBulkOperations {

    public static void runBulkOperationsDemo() {

        System.out.println("\n========== HASHSET BULK OPERATIONS ==========");

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // addAll() -> UNION
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union (addAll): " + union);

        // retainAll() -> INTERSECTION
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection (retainAll): " + intersection);

        // removeAll() -> DIFFERENCE
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (removeAll): " + difference);

        // containsAll()
        System.out.println("set1 containsAll intersection? " +
                set1.containsAll(intersection));
    }
}
