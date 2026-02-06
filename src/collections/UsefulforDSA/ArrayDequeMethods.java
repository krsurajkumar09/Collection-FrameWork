package collections.UsefulforDSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeMethods {

    public static void runAllDemos() {

        System.out.println("\n================ ARRAYDEQUE DEMO ================\n");

        fifoQueueDemo();
        lifoStackDemo();
        dequeBothEndsDemo();
        commonMethodsDemo();
        iterationDemo();
    }

    // -------------------------------------------------
    // 1️⃣ FIFO – Queue behavior
    // -------------------------------------------------
    private static void fifoQueueDemo() {

        System.out.println("---- FIFO (QUEUE) DEMO ----");

        Deque<Integer> queue = new ArrayDeque<>();

        // enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue after offer(): " + queue);

        // dequeue
        System.out.println("poll(): " + queue.poll());
        System.out.println("poll(): " + queue.poll());

        System.out.println("Queue now: " + queue);
        System.out.println();
    }

    // -------------------------------------------------
    // 2️⃣ LIFO – Stack behavior (REPLACES Stack)
    // -------------------------------------------------
    private static void lifoStackDemo() {

        System.out.println("---- LIFO (STACK) DEMO ----");

        Deque<Integer> stack = new ArrayDeque<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push(): " + stack);

        // pop
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());

        System.out.println("Stack now: " + stack);
        System.out.println();
    }

    // -------------------------------------------------
    // 3️⃣ Deque – Both Ends
    // -------------------------------------------------
    private static void dequeBothEndsDemo() {

        System.out.println("---- DEQUE (BOTH ENDS) DEMO ----");

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addFirst("START");

        System.out.println("Deque: " + deque);

        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("removeLast(): " + deque.removeLast());

        System.out.println("Deque now: " + deque);
        System.out.println();
    }

    // -------------------------------------------------
    // 4️⃣ Common Inbuilt Methods
    // -------------------------------------------------
    private static void commonMethodsDemo() {

        System.out.println("---- COMMON METHODS DEMO ----");

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);       // addLast
        deque.add(2);
        deque.offer(3);     // addLast

        System.out.println("Deque: " + deque);

        System.out.println("peek(): " + deque.peek());
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        System.out.println("contains(2): " + deque.contains(2));
        System.out.println("size(): " + deque.size());
        System.out.println("isEmpty(): " + deque.isEmpty());

        deque.clear();
        System.out.println("After clear(): " + deque);
        System.out.println();
    }

    // -------------------------------------------------
    // 5️⃣ Iteration
    // -------------------------------------------------
    private static void iterationDemo() {

        System.out.println("---- ITERATION DEMO ----");

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Java");
        deque.add("Spring");
        deque.add("React");

        // foreach
        System.out.print("foreach: ");
        for (String s : deque) {
            System.out.print(s + " ");
        }
        System.out.println();

        // iterator
        System.out.print("iterator: ");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // descending iterator
        System.out.print("descendingIterator: ");
        Iterator<String> dit = deque.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println("\n");
    }
}



//✅ ArrayDeque does FIFO (Queue)
//
//✅ ArrayDeque does LIFO (Stack)
//
//✅ ArrayDeque does Deque (both ends)
//
//✅ Hence it replaces Stack, Queue, LinkedList


//🧠 WHY ArrayDeque REPLACES EVERYTHING
//Old Structure	Why Replaced	ArrayDeque Method
//        Stack	Legacy, slow	push(), pop()
//Queue	Limited	offer(), poll()
//LinkedList	Memory heavy	Faster array-based
//Deque	Interface only	addFirst(), addLast()
//
//        ✅ ArrayDeque = Stack + Queue + Deque (best default choice)
//
// DSA GOLDEN RULE
//Need Stack?
//        → ArrayDeque
//
//Need Queue?
//        → ArrayDeque
//
//Need Sliding Window / Monotonic Queue?
//        → ArrayDeque
//
//Only need Priority?
//        → PriorityQueue
