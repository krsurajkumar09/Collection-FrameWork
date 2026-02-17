package collections.UsefulforDSA;

import java.util.*;
import java.util.stream.*;

public class ArraysMethods {

    public static void main(String[] args) {

        // =====================================================
        // 1️⃣ SORTING
        // =====================================================
        int[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);
        System.out.println("Sorted (Ascending): " + Arrays.toString(numbers));

        Arrays.parallelSort(numbers);
        System.out.println("Parallel Sorted: " + Arrays.toString(numbers));

        // Descending Order (Primitive way)
        Integer[] numsObj = {5, 2, 9, 1, 7};
        Arrays.sort(numsObj, Collections.reverseOrder());
        System.out.println("Sorted (Descending): " + Arrays.toString(numsObj));


        // =====================================================
        // 2️⃣ BINARY SEARCH
        // =====================================================
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Binary Search (7 found at): " + index);


        // =====================================================
        // 3️⃣ TO STRING
        // =====================================================
        System.out.println("toString(): " + Arrays.toString(numbers));

        int[][] matrix = {{1,2},{3,4}};
        System.out.println("deepToString(): " + Arrays.deepToString(matrix));


        // =====================================================
        // 4️⃣ EQUALS & DEEP EQUALS
        // =====================================================
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("equals(): " + Arrays.equals(arr1, arr2));
        System.out.println("deepEquals(): " + Arrays.deepEquals(
                new Object[]{matrix},
                new Object[]{matrix}
        ));


        // =====================================================
        // 5️⃣ COMPARE & MISMATCH (Java 9+)
        // =====================================================
        int[] a = {1,2,3};
        int[] b = {1,2,4};

        System.out.println("compare(): " + Arrays.compare(a, b));
        System.out.println("mismatch(): " + Arrays.mismatch(a, b));


        // =====================================================
        // 6️⃣ FILL
        // =====================================================
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 10);
        System.out.println("fill(): " + Arrays.toString(fillArray));

        Arrays.fill(fillArray, 1, 3, 99);
        System.out.println("fill range(): " + Arrays.toString(fillArray));


        // =====================================================
        // 7️⃣ COPY
        // =====================================================
        int[] copy = Arrays.copyOf(numbers, 7);
        System.out.println("copyOf(): " + Arrays.toString(copy));

        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("copyOfRange(): " + Arrays.toString(rangeCopy));


        // =====================================================
        // 8️⃣ AS LIST
        // =====================================================
        List<String> list = Arrays.asList("A", "B", "C");
        System.out.println("asList(): " + list);


        // =====================================================
        // 9️⃣ STREAM
        // =====================================================
        IntStream stream = Arrays.stream(numbers);
        System.out.println("Stream Sum: " + stream.sum());


        // =====================================================
        // 🔟 setAll & parallelSetAll
        // =====================================================
        int[] setAllArray = new int[5];
        Arrays.setAll(setAllArray, i -> i * 2);
        System.out.println("setAll(): " + Arrays.toString(setAllArray));

        Arrays.parallelSetAll(setAllArray, i -> i * 3);
        System.out.println("parallelSetAll(): " + Arrays.toString(setAllArray));


        // =====================================================
        // 1️⃣1️⃣ spliterator
        // =====================================================
        Spliterator<Integer> spliterator =
                Arrays.spliterator(numsObj);

        System.out.print("spliterator(): ");
        spliterator.forEachRemaining(System.out::print);

    }
}
