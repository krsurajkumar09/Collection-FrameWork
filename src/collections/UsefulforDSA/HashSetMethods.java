package collections.UsefulforDSA;

import java.util.*;

public class HashSetMethods{

    /*
     =============================================================
     HASHSET FOR DSA – COMPLETE GUIDE
     =============================================================
     Internal Structure:
     - Backed by HashMap (since Java 1.2)
     - Uses hashing for O(1) average operations
     - No duplicates allowed

     Java Version Notes:
     - Java 1.2 → Core HashSet
     - Java 8   → removeIf(), spliterator()
     - Java 11+ → No major API additions
     =============================================================
    */

    // ============================================================
    // 🥇 MUST-KNOW METHODS (Used in 80% of DSA Problems)
    // ============================================================

    public static void mustKnowMethods() {

        Set<Integer> set = new HashSet<>();

        // ✅ add(E e) → Java 1.2
        // Time: O(1) avg, O(n) worst (rehash/collision)
        // Space: O(1)
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        // ✅ contains(Object o) → Java 1.2
        // Time: O(1) avg
        System.out.println("Contains 20? " + set.contains(20));

        // ✅ remove(Object o) → Java 1.2
        // Time: O(1) avg
        set.remove(20);

        // ✅ size() → Java 1.2
        // Time: O(1)
        System.out.println("Size: " + set.size());

        // ✅ isEmpty() → Java 1.2
        System.out.println("Is Empty? " + set.isEmpty());

        // Iteration → O(n)
        for (Integer val : set) {
            System.out.println(val);
        }
    }

    // ============================================================
    // 🥈 BULK OPERATIONS (Very Important in Set Problems)
    // ============================================================

    public static void bulkOperations() {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // ✅ addAll() → UNION → Java 1.2
        // Time: O(n + m)
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // ✅ retainAll() → INTERSECTION → Java 1.2
        // Time: O(n)
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // ✅ removeAll() → DIFFERENCE → Java 1.2
        // Time: O(n)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        // ✅ containsAll() → Java 1.2
        // Time: O(n)
        System.out.println("set1 containsAll intersection? "
                + set1.containsAll(intersection));
    }

    // ============================================================
    // 🟡 IMPORTANT BUT LESS FREQUENT
    // ============================================================

    public static void importantMethods() {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        // toArray() → Java 1.2 → O(n)
        Object[] arr = set.toArray();

        // iterator() → Java 1.2
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // removeIf() → Java 8 → O(n)
        set.removeIf(x -> x % 2 == 0);
    }

    // ============================================================
    // ❌ NOT IMPORTANT FOR DSA
    // ============================================================

    public static void rarelyUsed() {

        Set<Integer> set = new HashSet<>();

        // clear() → Java 1.2 → O(n)
        set.clear();

        // spliterator() → Java 8
        set.spliterator();
    }

    // ============================================================
    // 🔥 REAL INTERVIEW PATTERNS
    // ============================================================

    // 1️⃣ Detect Duplicate in Array
    public static void containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                System.out.println("Duplicate Found: " + num);
                return;
            }
        }
    }

    // 2️⃣ Longest Consecutive Sequence
    public static void longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        System.out.println("Longest Consecutive Length: " + longest);
    }

    // 3️⃣ Intersection of Two Arrays
    public static void intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);

        Set<Integer> result = new HashSet<>();

        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }

        System.out.println("Intersection: " + result);
    }

    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        System.out.println("===== MUST KNOW METHODS =====");
        mustKnowMethods();

        System.out.println("\n===== BULK OPERATIONS =====");
        bulkOperations();

        System.out.println("\n===== INTERVIEW PATTERNS =====");

        containsDuplicate(new int[]{1,2,3,4,3});
        longestConsecutive(new int[]{100,4,200,1,3,2});
        intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }
}


//Duplicate detection → HashSet
//
//Keep insertion order → LinkedHashSet
//
//Need closest element / sorted set → TreeSet