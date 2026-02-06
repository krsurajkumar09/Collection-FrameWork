package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HashMapMethodsDemo {

    public static void runHashMapDemo() {

        System.out.println("========== HASHMAP METHODS DEMO ==========");

        // 1️⃣ Create HashMap
        Map<Integer, String> map = new HashMap<>();

        // 2️⃣ put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Blueberry"); // overwrites value for key=2

        System.out.println("Map after put(): " + map);

        // 3️⃣ get()
        System.out.println("get(1): " + map.get(1));
        System.out.println("get(99): " + map.get(99)); // null

        // 4️⃣ containsKey()
        System.out.println("containsKey(3): " + map.containsKey(3));

        // 5️⃣ containsValue()
        System.out.println("containsValue(\"Apple\"): " + map.containsValue("Apple"));

        // 6️⃣ remove()
        map.remove(1);
        System.out.println("After remove(1): " + map);

        // 7️⃣ size()
        System.out.println("size(): " + map.size());

        // 8️⃣ isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // 9️⃣ keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("keySet(): " + keys);

        // 🔟 values()
        Collection<String> values = map.values();
        System.out.println("values(): " + values);

        // 1️⃣1️⃣ entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entrySet():");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 1️⃣2️⃣ putIfAbsent()
        map.putIfAbsent(3, "Coconut"); // won't overwrite
        map.putIfAbsent(4, "Dates");
        System.out.println("After putIfAbsent(): " + map);

        // 1️⃣3️⃣ getOrDefault()
        System.out.println("getOrDefault(10, \"Not Found\"): "
                + map.getOrDefault(10, "Not Found"));

        // 1️⃣4️⃣ replace()
        map.replace(2, "Blackberry");
        System.out.println("After replace(2): " + map);

        // 1️⃣5️⃣ replace(key, oldValue, newValue)
        map.replace(3, "Cherry", "Citrus");
        System.out.println("After conditional replace(): " + map);

        // 1️⃣6️⃣ forEach()
        System.out.println("forEach():");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // 1️⃣7️⃣ clear()
        map.clear();
        System.out.println("After clear(): " + map);
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}
