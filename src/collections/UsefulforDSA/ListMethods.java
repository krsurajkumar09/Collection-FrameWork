package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {

    public static void runListMethodsDemo() {

        System.out.println("========== LIST INTERFACE METHODS DEMO ==========");

        // -------------------------------------------------
        // 1️⃣ Creating List
        // -------------------------------------------------
        List<Integer> list = new ArrayList<>();

        // -------------------------------------------------
        // 2️⃣ add(E e)
        // -------------------------------------------------
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        // -------------------------------------------------
        // 3️⃣ add(int index, E element)
        // -------------------------------------------------
        list.add(1, 15);
        System.out.println("After add(index, element): " + list);

        // -------------------------------------------------
        // 4️⃣ addAll(Collection c)
        // -------------------------------------------------
        List<Integer> extra = new ArrayList<>();
        extra.add(40);
        extra.add(50);

        list.addAll(extra);
        System.out.println("After addAll(): " + list);

        // -------------------------------------------------
        // 5️⃣ addAll(int index, Collection c)
        // -------------------------------------------------
        List more = List.of(5, 7);
        list.addAll(0, more);
        System.out.println("After addAll(index, c): " + list);

        // -------------------------------------------------
        // 6️⃣ get(int index)
        // -------------------------------------------------
        System.out.println("get(2): " + list.get(2));

        // -------------------------------------------------
        // 7️⃣ set(int index, E element)
        // -------------------------------------------------
        list.set(2, 99);
        System.out.println("After set(): " + list);

        // -------------------------------------------------
        // 8️⃣ remove(int index)
        // -------------------------------------------------
        list.remove(0);
        System.out.println("After remove(index): " + list);

        // -------------------------------------------------
        // 9️⃣ remove(Object o)
        // -------------------------------------------------
        list.remove(Integer.valueOf(20));
        System.out.println("After remove(object): " + list);

        // -------------------------------------------------
        // 🔟 contains(Object o)
        // -------------------------------------------------
        System.out.println("Contains 30? " + list.contains(30));

        // -------------------------------------------------
        // 1️⃣1️⃣ indexOf(Object o)
        // -------------------------------------------------
        System.out.println("Index of 30: " + list.indexOf(30));

        // -------------------------------------------------
        // 1️⃣2️⃣ lastIndexOf(Object o)
        // -------------------------------------------------
        list.add(30);
        System.out.println("After adding duplicate 30: " + list);
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // -------------------------------------------------
        // 1️⃣3️⃣ size()
        // -------------------------------------------------
        System.out.println("Size: " + list.size());

        // -------------------------------------------------
        // 1️⃣4️⃣ isEmpty()
        // -------------------------------------------------
        System.out.println("Is empty? " + list.isEmpty());

        // -------------------------------------------------
        // 1️⃣5️⃣ subList(int from, int to)
        // -------------------------------------------------
        List<Integer> subList = list.subList(1, 4);
        System.out.println("SubList (1,4): " + subList);

        // -------------------------------------------------
        // 1️⃣6️⃣ iterator()
        // -------------------------------------------------
        System.out.print("Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 1️⃣7️⃣ listIterator()
        // -------------------------------------------------
        System.out.print("ListIterator forward: ");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 1️⃣8️⃣ sort()
        // -------------------------------------------------
        Collections.sort(list);
        System.out.println("After sort(): " + list);

        list.sort(Collections.reverseOrder());  // preferred over above method
//      list.sort((a, b) -> Integer.compare(b, a));  // Using Lamba functions
        System.out.println("After reversesort(): " + list);

        // -------------------------------------------------
        // 1️⃣9️⃣ replaceAll()
        // -------------------------------------------------
        list.replaceAll(n -> n * 2);
        System.out.println("After replaceAll(x2): " + list);

        // -------------------------------------------------
        // 2️⃣0️⃣ removeAll(Collection c)
        // -------------------------------------------------
        list.removeAll(List.of(60, 198));
        System.out.println("After removeAll(): " + list);

        // -------------------------------------------------
        // 2️⃣1️⃣ retainAll(Collection c)
        // -------------------------------------------------
        list.retainAll(List.of(10, 198));
        System.out.println("After retainAll(): " + list);

        // -------------------------------------------------
        // 2️⃣2️⃣ toArray()
        // -------------------------------------------------
        Object[] arr = list.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 2️⃣3️⃣ clear()
        // -------------------------------------------------
        list.clear();
        System.out.println("After clear(): " + list);

        System.out.println("========== END ==========\n");
    }
}
