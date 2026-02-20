package collections.UsefulforDSA;

import java.util.*;

public class ArrayAndArrayList {

    /*
     =============================================================
     ARRAYS & ARRAYLIST FOR DSA – COMPLETE GUIDE (WITH COMPLEXITY)
     =============================================================

     ARRAYS:
     - Introduced in Java 1.0
     - Fixed size
     - Contiguous memory
     - Fastest random access structure

     ARRAYLIST:
     - Introduced in Java 1.2
     - Dynamic array (Resizable)
     - Internally backed by Object[]
     - Growth formula:
         newCapacity = oldCapacity + (oldCapacity >> 1)
         (~1.5x growth)

     Default Capacity (ArrayList):
         10 (after first add)

     =============================================================
    */

    // ============================================================
    // 🥇 MUST-KNOW ARRAY OPERATIONS
    // ============================================================

    public static void mustKnowArrayOperations() {

        int[] arr = {10, 20, 30, 40};

        // ✅ Access → Java 1.0
        // Time: O(1)
        // Space: O(1)
        System.out.println("arr[2]: " + arr[2]);

        // ✅ Update → Java 1.0
        // Time: O(1)
        arr[2] = 99;

        // ✅ length → Java 1.0 (field, not method)
        // Time: O(1)
        System.out.println("length: " + arr.length);

        // ✅ Traversal → Java 1.0
        // Time: O(n)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ✅ Enhanced for → Java 5
        // Time: O(n)
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ✅ Arrays.sort() → Java 1.2
        // Primitive: Dual-Pivot QuickSort
        // Time: O(n log n)
        // Space: O(log n) (recursion stack)
        Arrays.sort(arr);

        // ✅ Arrays.toString() → Java 1.5
        // Time: O(n)
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    // ============================================================
    // 🥇 MUST-KNOW ARRAYLIST METHODS
    // ============================================================

    public static void mustKnowArrayListMethods() {

        List<Integer> list = new ArrayList<>();

        // ✅ add(E e) → Java 1.2
        // Amortized: O(1)
        // Worst (resize): O(n)
        // Space: O(n)
        list.add(10);
        list.add(20);

        // ✅ add(index, E e) → Java 1.2
        // Time: O(n) (shifting)
        list.add(1, 15);

        // ✅ get(index) → Java 1.2
        // Time: O(1)
        System.out.println("get(1): " + list.get(1));

        // ✅ set(index, E e) → Java 1.2
        // Time: O(1)
        list.set(1, 99);

        // ✅ remove(index) → Java 1.2
        // Time: O(n) (shifting)
        list.remove(1);

        // ✅ size() → Java 1.2
        // Time: O(1)
        System.out.println("size(): " + list.size());

        // ✅ sort(Comparator) → Java 8
        // Time: O(n log n)
        // Space: O(n) (TimSort)
        list.sort(Integer::compare);

        // Natural order
        list.sort(null);

        // Descending
        list.sort(Collections.reverseOrder());

        // Descending (Java 8)
        list.sort(Comparator.reverseOrder());

        System.out.println("Final List: " + list);
    }

    // ============================================================
    // 🥈 IMPORTANT BUT LESS FREQUENT
    // ============================================================

    public static void importantArrayListMethods() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        // ✅ contains(Object o) → Java 1.2
        // Time: O(n)
        list.contains(10);

        // ✅ indexOf(Object o) → Java 1.2
        // Time: O(n)
        list.indexOf(20);

        // ✅ isEmpty() → Java 1.2
        // Time: O(1)
        list.isEmpty();

        // ✅ clear() → Java 1.2
        // Time: O(n)
        list.clear();
    }

    // ============================================================
    // ❌ RARELY USED FOR DSA
    // ============================================================

    public static void rarelyUsedMethods() {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        // ✅ iterator() → Java 1.2
        // Time to iterate: O(n)
        Iterator<Integer> it = list.iterator();

        // ✅ replaceAll() → Java 8
        // Time: O(n)
        list.replaceAll(x -> x * 2);

        // ✅ removeIf() → Java 8
        // Time: O(n)
        list.removeIf(x -> x % 2 == 0);

        // ✅ ensureCapacity(int) → Java 1.2
        // Time: O(n) if resizing
        ((ArrayList<Integer>) list).ensureCapacity(50);

        // ✅ trimToSize() → Java 1.2
        // Time: O(n)
        ((ArrayList<Integer>) list).trimToSize();
    }

    // ============================================================
    // 🔥 REAL INTERVIEW PATTERNS
    // ============================================================

    // 1️⃣ Two Pointer after sorting
    // Time: O(n log n) (sorting)
    // Space: O(1)
    public static void twoPointerExample() {

        int[] arr = {1, 4, 3, 2};
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 5) {
                System.out.println("Pair Found: " + arr[left] + ", " + arr[right]);
                break;
            } else if (sum < 5) {
                left++;
            } else {
                right--;
            }
        }
    }

    // 2️⃣ Backtracking Pattern
    // add() → O(1)
    // remove(last) → O(1)
    public static void backtrackingExample() {

        List<Integer> current = new ArrayList<>();

        current.add(1);
        current.add(2);

        current.remove(current.size() - 1);

        System.out.println("Backtracking List: " + current);
    }

    // 3️⃣ Array → ArrayList
    // Time: O(n)
    // Space: O(n)
    public static void arrayToArrayList() {

        Integer[] arr = {10, 20, 30};

        List<Integer> list =
                new ArrayList<>(Arrays.asList(arr));

        System.out.println("Converted List: " + list);
    }

    // 4️⃣ Primitive Array → List
    // Time: O(n)
    // Space: O(n)
    public static void primitiveArrayToList() {

        int[] arr = {1, 2, 3};

        List<Integer> list =
                Arrays.stream(arr)
                        .boxed()
                        .toList(); // Java 16+

        System.out.println("Primitive Converted: " + list);
    }

    // ============================================================
    // MAIN
    // ============================================================

    public static void main(String[] args) {

        mustKnowArrayOperations();
        mustKnowArrayListMethods();
        importantArrayListMethods();
        rarelyUsedMethods();

        twoPointerExample();
        backtrackingExample();
        arrayToArrayList();
        primitiveArrayToList();
    }
}