package collections.UsefulforDSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeMethods {

    /*
     =============================================================
     ARRAYDEQUE – DSA MASTER FILE
     =============================================================

     Introduced: Java 1.6
     Internally: Resizable Circular Array
     Default Capacity: 16
     Growth: Doubles when full

     ✔ No null elements allowed
     ✔ Not thread-safe
     ✔ Faster than LinkedList for queue/stack

     =============================================================
     🔥 MOST USED IN DSA:
     -------------------------------------------------------------
     push(), pop()
     offer(), poll()
     peek(), peekFirst(), peekLast()
     addFirst(), addLast()
     =============================================================
    */

    // =============================================================
    // 1️⃣ FIFO – Queue Behavior (🔥 VERY COMMON IN DSA)
    // =============================================================
    private static void fifoQueueDemo() {

        System.out.println("---- FIFO (QUEUE) DEMO ----");

        Deque<Integer> queue = new ArrayDeque<>();

        // 🔥 offer(E) → Java 1.6
        // Time: O(1) | Worst (resize): O(n)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // 🔥 poll() → Java 1.6
        // Time: O(1)
        System.out.println("poll(): " + queue.poll());

        // 🔥 peek() → Java 1.6
        // Time: O(1)
        System.out.println("peek(): " + queue.peek());

        System.out.println();
    }

    // =============================================================
    // 2️⃣ LIFO – Stack Behavior (🔥 REPLACES STACK CLASS)
    // =============================================================
    private static void lifoStackDemo() {

        System.out.println("---- LIFO (STACK) DEMO ----");

        Deque<Integer> stack = new ArrayDeque<>();

        // 🔥 push(E) → Java 1.6
        // Time: O(1)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // 🔥 pop() → Java 1.6
        // Time: O(1)
        System.out.println("pop(): " + stack.pop());

        // 🔥 peek() → Java 1.6
        // Time: O(1)
        System.out.println("peek(): " + stack.peek());

        System.out.println();
    }

    // =============================================================
    // 3️⃣ Deque – Both Ends (🔥 Sliding Window / Monotonic Queue)
    // =============================================================
    private static void dequeBothEndsDemo() {

        System.out.println("---- DEQUE (BOTH ENDS) DEMO ----");

        Deque<String> deque = new ArrayDeque<>();

        // 🔥 addFirst(E) → Java 1.6 | O(1)
        deque.addFirst("A");

        // 🔥 addLast(E) → Java 1.6 | O(1)
        deque.addLast("B");
        deque.addLast("C");

        System.out.println("Deque: " + deque);

        // 🔥 removeFirst() → Java 1.6 | O(1)
        System.out.println("removeFirst(): " + deque.removeFirst());

        // 🔥 removeLast() → Java 1.6 | O(1)
        System.out.println("removeLast(): " + deque.removeLast());

        System.out.println("Deque now: " + deque);
        System.out.println();
    }

    // =============================================================
    // 4️⃣ Common Methods
    // =============================================================
    private static void commonMethodsDemo() {

        System.out.println("---- COMMON METHODS DEMO ----");

        Deque<Integer> deque = new ArrayDeque<>();

        // add(E) → Java 1.6 | O(1)
        deque.add(1);
        deque.add(2);

        // contains(Object) → Java 1.6
        // Time: O(n)
        System.out.println("contains(2): " + deque.contains(2));

        // size() → Java 1.6 | O(1)
        System.out.println("size(): " + deque.size());

        // isEmpty() → Java 1.6 | O(1)
        System.out.println("isEmpty(): " + deque.isEmpty());

        // clear() → Java 1.6 | O(n)
        deque.clear();

        System.out.println();
    }

    // =============================================================
    // 5️⃣ Iteration
    // =============================================================
    private static void iterationDemo() {

        System.out.println("---- ITERATION DEMO ----");

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Java");
        deque.add("Spring");
        deque.add("React");

        // foreach → Java 5 | O(n)
        System.out.print("foreach: ");
        for (String s : deque) {
            System.out.print(s + " ");
        }
        System.out.println();

        // iterator() → Java 1.6 | O(n)
        System.out.print("iterator: ");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // descendingIterator() → Java 1.6 | O(n)
        System.out.print("descendingIterator: ");
        Iterator<String> dit = deque.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println("\n");
    }

    // =============================================================
    // MAIN METHOD
    // =============================================================
    public static void main(String[] args) {

        System.out.println("================ ARRAYDEQUE DSA GUIDE ================\n");

        fifoQueueDemo();
        lifoStackDemo();
        dequeBothEndsDemo();
        commonMethodsDemo();
        iterationDemo();

        System.out.println("🔥 DSA GOLDEN RULE:");
        System.out.println("Stack? → ArrayDeque");
        System.out.println("Queue? → ArrayDeque");
        System.out.println("Sliding Window / Monotonic Queue? → ArrayDeque");
        System.out.println("Priority ordering? → PriorityQueue");
    }
}


//🔥 Most Used ArrayDeque Methods in DSA (Memorize These)
//🥇 Stack Problems
//
//push()
//
//pop()
//
//peek()
//
//🥇 Queue Problems
//
//offer()
//
//poll()
//
//peek()
//
//🥇 Sliding Window / Monotonic Queue
//
//addLast()
//
//removeLast()
//
//peekFirst()
//
//removeFirst()
//
//Everything else = secondary.