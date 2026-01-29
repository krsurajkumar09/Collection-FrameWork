package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void runCopyOnWriteArrayListDemo () {

        // 1️⃣ Create CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // 2️⃣ add()
        list.add("Java");
        list.add("Spring");
        list.add("React");

        System.out.println("After add(): " + list);

        // 3️⃣ addAll()
        list.addAll(java.util.List.of("Node", "Docker"));
        System.out.println("After addAll(): " + list);

        // 4️⃣ get()
        System.out.println("Element at index 1: " + list.get(1));

        // 5️⃣ set()
        list.set(2, "Angular");
        System.out.println("After set(): " + list);

        // 6️⃣ contains()
        System.out.println("Contains Spring? " + list.contains("Spring"));

        // 7️⃣ size()
        System.out.println("Size: " + list.size());

        // 8️⃣ remove()
        list.remove("Docker");
        System.out.println("After remove(): " + list);

        // 🔥 9️⃣ Iterator (NO ConcurrentModificationException)
        System.out.println("\nIterating and modifying list:");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Reading: " + item);

            // Modifying list while iterating
            if (item.equals("Java")) {
                list.add("Kotlin");
            }
        }

        // Notice: Iterator does NOT see "Kotlin"
        System.out.println("\nFinal List: " + list);
    }
}
