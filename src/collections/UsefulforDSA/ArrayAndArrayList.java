package collections.UsefulforDSA;

import java.util.*;

public class ArrayAndArrayList {

    // ===============================
    // 1️⃣ BASIC JAVA ARRAY DEMO
    // ===============================
    public static void arrayDemo() {

        System.out.println("===== BASIC ARRAY DEMO =====");

        // Declaration & Initialization
//        int[] arr = new int[5];

        // Add elements
//        arr[0] = 10;
//        arr[1] = 90;
//        arr[2] = 80;
//        arr[3] = 60;
//        arr[4] = 50;

//      or Method 2: Direct initialization
        int[] arr = {10, 20, 30, 40, 15};

        // Access elements
        System.out.println("Element at index 2: " + arr[2]);

        // Length
        System.out.println("Array length: " + arr.length);

        // Traverse using for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Traverse using enhanced for loop
        System.out.print("Using enhanced for loop: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Update
        arr[2] = 99;
        System.out.println("Updated index 2: " + arr[2]);
        System.out.print("After updating array at index 2: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Arrays are fixed size (cannot add/remove)
        System.out.println("Arrays are fixed size ");
        System.out.println();
    }

    // ===============================
    // 2️⃣ ARRAYLIST DEMO
    // ===============================
    public static void arrayListDemo() {

        System.out.println("===== ARRAYLIST DEMO =====");

        // Declaration
        List<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // add(index, element)
        list.add(2, 25);

        System.out.println("After add operations: " + list);

        // get()
        System.out.println("Element at index 1: " + list.get(1));

        // size()
        System.out.println("Size: " + list.size());

        // contains()
        System.out.println("Contains 30? " + list.contains(30));

        // indexOf()
        System.out.println("Index of 40: " + list.indexOf(40));

        // remove(index)
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // remove(Object)
        list.remove(Integer.valueOf(40));
        System.out.println("After remove(object): " + list);

        // set(index, element)
        list.set(1, 99);
        System.out.println("After set(): " + list);

        // isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        // Iteration - for loop
        System.out.print("For loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Iteration - enhanced for
        System.out.print("Enhanced for loop: ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterator
        System.out.print("Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // sort()
//        Collections.sort(list);
//        list.sort(null);  // preferred over previous method
        list.sort(Integer::compare);  // another way tyo sort the list
        System.out.println("After sort(): " + list);

        // reverse sort

        // Collections.sort(list, Collections.reverseOrder());
          list.sort(Collections.reverseOrder());  // preferred over above method
//        list.sort((a, b) -> Integer.compare(b, a));  // Using Lamba functions

        System.out.println("reversed list :" +list); // [30, 20, 10, 5]

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        System.out.println();
    }
}
