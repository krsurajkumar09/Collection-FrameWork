package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {

    public static void runLinkedListMethodsDemo() {

        System.out.println("========== LINKEDLIST METHODS DEMO ==========");

        // -------------------------------------------------
        // 1️⃣ Creating LinkedList
        // (Implements: List, Queue, Deque)
        // -------------------------------------------------
        LinkedList<Integer> list = new LinkedList<>();

        // -------------------------------------------------
        // 🟢 LIST METHODS
        // -------------------------------------------------

        // add(E e) → List
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add(): " + list);

        // add(int index, E element) → List
        list.add(1, 15);
        System.out.println("After add(index, element): " + list);

        // get(int index) → List
        System.out.println("get(2): " + list.get(2));

        // set(int index, E element) → List
        list.set(2, 99);
        System.out.println("After set(): " + list);

        // remove(int index) → List
        list.remove(0);
        System.out.println("After remove(index): " + list);

        // remove(Object o) → List
        list.remove(Integer.valueOf(20));
        System.out.println("After remove(object): " + list);

        // contains(Object o) → List
        System.out.println("Contains 30? " + list.contains(30));

        // indexOf(Object o) → List
        System.out.println("Index of 30: " + list.indexOf(30));

        // lastIndexOf(Object o) → List
        list.add(30);
        System.out.println("After duplicate add: " + list);
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // size() → List
        System.out.println("Size: " + list.size());

        // subList(from, to) → List
        System.out.println("SubList(1,3): " + list.subList(1, 3));

        // -------------------------------------------------
        // 🔵 ITERATION (List)
        // -------------------------------------------------

        // iterator() → List
        System.out.print("Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // listIterator() → List
        System.out.print("ListIterator forward: ");
        ListIterator<Integer> listIt = list.listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 🟡 QUEUE METHODS (FIFO)
        // -------------------------------------------------

        // offer(E e) → Queue
        list.offer(100);
        System.out.println("After offer(): " + list);

        // peek() → Queue
        System.out.println("peek(): " + list.peek());

        // poll() → Queue
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // -------------------------------------------------
        // 🟠 DEQUE METHODS (Double Ended Queue)
        // -------------------------------------------------

        // addFirst(E e) → Deque
        list.addFirst(1);

        // addLast(E e) → Deque
        list.addLast(200);
        System.out.println("After addFirst & addLast: " + list);

        // peekFirst() → Deque
        System.out.println("peekFirst(): " + list.peekFirst());

        // peekLast() → Deque
        System.out.println("peekLast(): " + list.peekLast());

        // pollFirst() → Deque
        list.pollFirst();

        // pollLast() → Deque
        list.pollLast();
        System.out.println("After pollFirst & pollLast: " + list);

        // descendingIterator() → Deque
        System.out.print("Descending Iterator: ");
        Iterator<Integer> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 🔴 STACK METHODS (LIFO)
        // -------------------------------------------------

        // push(E e) → Stack behavior
        list.push(500);
        list.push(600);
        System.out.println("After push(): " + list);

        // peek() → Stack
        System.out.println("Stack peek(): " + list.peek());

        // pop() → Stack
        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // -------------------------------------------------
        // clear() → List
        // -------------------------------------------------
        list.clear();
        System.out.println("After clear(): " + list);

        System.out.println("========== END ==========\n");
    }
}
