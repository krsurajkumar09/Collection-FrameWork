package collections.UsefulforDSA;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMethodsDemo {

    public static void runPriorityQueueDemo() {

        System.out.println("========== PRIORITY QUEUE METHODS DEMO ==========");

        // -------------------------------------------------
        // 1. Creation (Min Heap by default)
        // -------------------------------------------------
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // -------------------------------------------------
        // 2. add() / offer()  → Insert element
        // -------------------------------------------------
        pq.add(40);
        pq.add(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("After add/offer: " + pq);

        // -------------------------------------------------
        // 3. peek() → View head (smallest element)
        // -------------------------------------------------
        System.out.println("Peek (head): " + pq.peek());

        // -------------------------------------------------
        // 4. element() → Same as peek(), but throws exception if empty
        // -------------------------------------------------
        System.out.println("Element (head): " + pq.element());

        // -------------------------------------------------
        // 5. poll() → Remove & return head
        // -------------------------------------------------
        System.out.println("Poll (removed): " + pq.poll());
        System.out.println("After poll: " + pq);

        // -------------------------------------------------
        // 6. remove() → Remove & return head (exception if empty)
        // -------------------------------------------------
        System.out.println("Remove (removed): " + pq.remove());
        System.out.println("After remove: " + pq);

        // -------------------------------------------------
        // 7. remove(Object o)
        // -------------------------------------------------
        pq.remove(40);
        System.out.println("After removing 40: " + pq);

        // -------------------------------------------------
        // 8. contains()
        // -------------------------------------------------
        System.out.println("Contains 10? " + pq.contains(10));

        // -------------------------------------------------
        // 9. size()
        // -------------------------------------------------
        System.out.println("Size: " + pq.size());

        // -------------------------------------------------
        // 10. isEmpty()
        // -------------------------------------------------
        System.out.println("Is Empty? " + pq.isEmpty());

        // -------------------------------------------------
        // 11. iterator()
        // (⚠️ Order NOT sorted)
        // -------------------------------------------------
        System.out.print("Iterator traversal: ");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 12. toArray()
        // -------------------------------------------------
        Object[] arr = pq.toArray();
        System.out.print("To Array: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // -------------------------------------------------
        // 13. clear()
        // -------------------------------------------------
        pq.clear();
        System.out.println("After clear, isEmpty? " + pq.isEmpty());

        System.out.println("===============================================");
    }
}
