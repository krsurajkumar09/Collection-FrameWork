package collections.UsefulforDSA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethods {

    public static void runHashSetMethodsDemo() {

        System.out.println("========== HASHSET METHODS DEMO ==========");

        // 1. Create HashSet
        Set<Integer> set = new HashSet<>();

        // 2. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(70);
        set.add(90);
        set.add(70);// duplicate ignored
        System.out.println("After add(): " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));

        // 5. remove()
        set.remove(20);
        System.out.println("After remove(20): " + set);

        // 6. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 7. iterator()
        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 8. for-each loop
        System.out.print("Iterating using for-each: ");
        for (Integer val : set) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 9. toArray()
        Object[] array = set.toArray();
        System.out.print("toArray(): ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 10. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 11. isEmpty() after clear
        System.out.println("Is Empty after clear? " + set.isEmpty());
    }
}
