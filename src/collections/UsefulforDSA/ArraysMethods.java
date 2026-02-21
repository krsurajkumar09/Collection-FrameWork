package collections.UsefulforDSA;

import java.util.*;
import java.util.stream.*;

public class ArraysMethods {

    /*
     =============================================================
     ARRAYS UTILITY CLASS – COMPLETE GUIDE WITH COMPLEXITY
     =============================================================

     Arrays class introduced: Java 1.2

     Sorting Internals:
     - Primitive sort → Dual-Pivot QuickSort
     - Object sort → TimSort
     - parallelSort → ForkJoinPool (multi-threaded)

     =============================================================
    */
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        arraysDemo();
    }

    public static void arraysDemo() {

        // =====================================================
        // 1️⃣ SORTING
        // =====================================================

        int[] numbers = {5, 2, 9, 1, 7};

        // ✅ Arrays.sort(int[]) → Java 1.2
        // Time: O(n log n)
        // Space: O(log n) (recursion stack)
        Arrays.sort(numbers);

        // ✅ Arrays.parallelSort(int[]) → Java 8
        // Time: O(n log n)
        // Space: O(log n)
        // Uses multi-threading (better for large arrays)
        Arrays.parallelSort(numbers);

        // ✅ Arrays.sort(Object[], Comparator) → Java 1.2
        // Time: O(n log n)
        // Space: O(n) (TimSort temporary arrays)
        Integer[] numsObj = {5, 2, 9, 1, 7};
        Arrays.sort(numsObj, Collections.reverseOrder());

        // =====================================================
        // DESCENDING FOR PRIMITIVE (Manual Reverse)
        // =====================================================
        int[] nums = {5, 2, 9, 1, 7};

        // sort → O(n log n)
        Arrays.sort(nums);

        // reverse → O(n)
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // =====================================================
        // DESCENDING USING STREAM (Java 8+)
        // =====================================================
        // Time: O(n log n)
        // Space: O(n)
        int[] desc = Arrays.stream(nums)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // =====================================================
        // 2️⃣ BINARY SEARCH
        // =====================================================

        // ✅ Arrays.binarySearch() → Java 1.2
        // Time: O(log n)
        // Space: O(1)
        int index = Arrays.binarySearch(numbers, 7);

        // =====================================================
        // 3️⃣ TO STRING
        // =====================================================

        // ✅ toString() → Java 1.5
        // Time: O(n)
        Arrays.toString(numbers);

        int[][] matrix = {{1,2},{3,4}};

        // ✅ deepToString() → Java 1.5
        // Time: O(n) (all elements)
        Arrays.deepToString(matrix);

        // =====================================================
        // 4️⃣ EQUALS & DEEP EQUALS
        // =====================================================

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        // ✅ equals() → Java 1.2
        // Time: O(n)
        Arrays.equals(arr1, arr2);

        // ✅ deepEquals() → Java 1.5
        // Time: O(n)
        Arrays.deepEquals(
                new Object[]{matrix},
                new Object[]{matrix}
        );

        // =====================================================
        // 5️⃣ COMPARE & MISMATCH
        // =====================================================

        int[] a = {1,2,3};
        int[] b = {1,2,4};

        // ✅ compare() → Java 9
        // Time: O(n)
        Arrays.compare(a, b);

        // ✅ mismatch() → Java 9
        // Time: O(n)
        Arrays.mismatch(a, b);

        // =====================================================
        // 6️⃣ FILL
        // =====================================================

        int[] fillArray = new int[5];

        // ✅ fill() → Java 1.2
        // Time: O(n)
        Arrays.fill(fillArray, 10);

        // ✅ fill(range) → Java 1.2
        // Time: O(k) (range size)
        Arrays.fill(fillArray, 1, 3, 99);

        // =====================================================
        // 7️⃣ COPY
        // =====================================================

        // ✅ copyOf() → Java 1.6
        // Time: O(n)
        // Space: O(n)
        int[] copy = Arrays.copyOf(numbers, 7);

        // ✅ copyOfRange() → Java 1.6
        // Time: O(k)
        // Space: O(k)
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);

        // =====================================================
        // 8️⃣ asList()
        // =====================================================

        // ✅ asList() → Java 1.2
        // Time: O(1)
        // Returns fixed-size list backed by array
        List<String> list = Arrays.asList("A", "B", "C");

        // =====================================================
        // 9️⃣ stream()
        // =====================================================

        // ✅ stream() → Java 8
        // Time: O(n) (traversal)
        IntStream stream = Arrays.stream(numbers);
        stream.sum();

        // =====================================================
        // 🔟 setAll & parallelSetAll
        // =====================================================

        int[] setAllArray = new int[5];

        // ✅ setAll() → Java 8
        // Time: O(n)
        Arrays.setAll(setAllArray, i -> i * 2);

        // ✅ parallelSetAll() → Java 8
        // Time: O(n) (parallel execution)
        Arrays.parallelSetAll(setAllArray, i -> i * 3);

        // =====================================================
        // 1️⃣1️⃣ spliterator()
        // =====================================================

        // ✅ spliterator() → Java 8
        // Time: O(n) traversal
        Spliterator<Integer> spliterator =
                Arrays.spliterator(numsObj);

        spliterator.forEachRemaining(System.out::print);
    }
}