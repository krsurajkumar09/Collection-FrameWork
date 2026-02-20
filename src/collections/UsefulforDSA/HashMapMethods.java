package collections.UsefulforDSA;

import java.util.*;

public class HashMapMethods {

    /*
     =============================================================
     HASHMAP FOR DSA – COMPLETE GUIDE WITH COMPLEXITIES
     =============================================================

     Internal Working:
     - Uses Array + LinkedList (Java 7)
     - Uses Array + LinkedList + Red-Black Tree (Java 8+)
     - Tree conversion when bucket size > 8

     Default Capacity = 16
     Load Factor = 0.75
     Resize happens when size > capacity * loadFactor

     Average Time Complexity = O(1)
     Worst Case = O(n)  (rare, due to collisions)
     =============================================================
    */

    // ============================================================
    // 🥇 MUST-KNOW METHODS (Used in 80% of DSA Problems)
    // ============================================================

    public static void mustKnowMethods() {

        Map<Integer, Integer> map = new HashMap<>();

        // ✅ put(K,V)
        // Average: O(1)
        // Worst: O(n) (collision)
        // Space: O(n)
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        // ✅ get(K)
        // Average: O(1)
        // Worst: O(n)
        // Space: O(1)
        System.out.println("get(1): " + map.get(1));

        // ✅ containsKey(K)
        // Average: O(1)
        // Worst: O(n)
        System.out.println("containsKey(2): " + map.containsKey(2));

        // ✅ remove(K)
        // Average: O(1)
        // Worst: O(n)
        map.remove(2);

        // ✅ getOrDefault(K, default)
        // Average: O(1)
        int val = map.getOrDefault(3, 0);
        System.out.println("getOrDefault(3,0): " + val);

        // ✅ merge()
        // Average: O(1)
        // Worst: O(n)
        map.merge(1, 1, Integer::sum);

        // ✅ computeIfAbsent()
        // Average: O(1)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(2);

        // ✅ entrySet()
        // Iteration: O(n)
        // Space: O(1) extra
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ✅ values()
        // Iteration: O(n)
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // ✅ keySet()
        // Iteration: O(n)
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // ✅ forEach()
        // Iteration: O(n)
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    // ============================================================
    // 🥈 IMPORTANT BUT LESS FREQUENT
    // ============================================================

    public static void importantMethods() {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        // size()
        // Time: O(1)
        System.out.println("size(): " + map.size());

        // isEmpty()
        // Time: O(1)
        System.out.println("isEmpty(): " + map.isEmpty());
    }

    // ============================================================
    // ❌ RARELY USED FOR DSA
    // ============================================================

    public static void rarelyUsedMethods() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "A");

        // containsValue()
        // Time: O(n)
        map.containsValue("A");

        // replace()
        // Average: O(1)
        map.replace(1, "B");

        // clone()
        // Time: O(n)
        // Space: O(n)
        HashMap<Integer, String> clone =
                (HashMap<Integer, String>) ((HashMap<Integer, String>) map).clone();

        clone.forEach((k, v) -> System.out.println(k + ":" + v));

        // clear()
        // Time: O(n)
        map.clear();
    }

    // ============================================================
    // 🔥 REAL INTERVIEW PATTERNS
    // ============================================================

    // 1️⃣ Two Sum
    // Time: O(n)
    // Space: O(n)
    public static void twoSumExample(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Two Sum Found: "
                        + map.get(complement) + " , " + i);
                return;
            }

            map.put(nums[i], i);
        }
    }

    // 2️⃣ Frequency Counter
    // Time: O(n)
    // Space: O(k)  (k = unique characters)
    public static void frequencyCounter(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }

        System.out.println("Frequency Map: " + map);
    }

    // 3️⃣ Subarray Sum Equals K
    // Time: O(n)
    // Space: O(n)
    public static void subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            count += prefixMap.getOrDefault(sum - k, 0);

            prefixMap.put(sum,
                    prefixMap.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Subarrays count: " + count);
    }

    // 4️⃣ Graph Adjacency List
    // Time: O(E)
    // Space: O(V + E)
    public static void buildGraph() {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(2);
        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(3);

        System.out.println("Graph: " + graph);
    }

    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        mustKnowMethods();
        importantMethods();
        rarelyUsedMethods();

        twoSumExample(new int[]{2,7,11,15}, 9);
        frequencyCounter("banana");
        subarraySum(new int[]{1,1,1}, 2);
        buildGraph();
    }
}



// 🥇 1️⃣ LinkedHashMap — Required?
// 👉 Short Answer: Rarely required in basic DSA, but very useful in real systems.
//
// In 90% of DSA problems:
// HashMap is enough.
//
// Use LinkedHashMap when:
//
// ✅ Order of insertion must be preserved
// ✅ Access order must be maintained (LRU Cache)
//
// Examples:
//
// • First non-repeating character (maintain order)
// • Output must follow input order
// • Implementing LRU Cache (using accessOrder=true)
//
// 🔥 Classic Example: LRU Cache
//
// Internally uses HashMap + Doubly Linked List.
// Maintains O(1) put() and get().
//
// 👉 Competitive coding rarely forces LinkedHashMap,
// but system design / backend often uses it.




// 🌳 2️⃣ TreeMap — Required?
// 👉 Short Answer: Sometimes YES.
//
// TreeMap stores keys in sorted order.
// Internally implemented using Red-Black Tree.
//
// Time Complexity:
// put() → O(log n)
// get() → O(log n)
// remove() → O(log n)
//
// Use TreeMap when:
//
// ✅ You need sorted keys dynamically
// ✅ You need ceiling, floor, higher, lower operations
// ✅ You need range queries
//
// Examples:
//
// • Find smallest number greater than X  (ceilingKey)
// • Find closest element
// • Maintain sorted frequency
// • Range queries
//
// 🔥 Classic Example:
//
// • Design Leaderboard
// • Count smaller numbers after self
// • Sliding window median
// • Interval merging
//
// 👉 TreeMap is common in medium/hard problems.
