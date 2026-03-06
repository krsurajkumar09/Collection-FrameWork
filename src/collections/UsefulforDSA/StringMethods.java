package collections.UsefulforDSA;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethods {

    // ONE method → called from Main class
    public static void demonstrateStringMethods() {

        System.out.println("===== JAVA STRING INBUILT METHODS DEMO =====");

        String str = "  Java Spring Boot  ";
        String str2 = "java spring boot";

        // ===============================
        // MOST USED STRING METHODS IN DSA
        // ===============================

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("charAt(2): " + str.charAt(2));

        // 3. equals() & equalsIgnoreCase()
        System.out.println("equals: " + str.equals(str2));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str2));

        // 4. compareTo() & compareToIgnoreCase()
        System.out.println("compareTo: " + str.compareTo(str2));
        System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(str2));

        // 5. toUpperCase() & toLowerCase()
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());

        // 6. trim() & strip()
        System.out.println("trim: [" + str.trim() + "]");
        System.out.println("strip: [" + str.strip() + "]");

        // 7. contains()
        System.out.println("contains 'Spring': " + str.contains("Spring"));

        // 8. startsWith() & endsWith()
        System.out.println("startsWith '  Java': " + str.startsWith("  Java"));
        System.out.println("endsWith 'Boot  ': " + str.endsWith("Boot  "));

        // 9. indexOf() & lastIndexOf()
        System.out.println("indexOf 'o': " + str.indexOf('o'));
        System.out.println("lastIndexOf 'o': " + str.lastIndexOf('o'));

        // 10. substring()
        System.out.println("substring(2): " + str.substring(2));
        System.out.println("substring(2, 6): " + str.substring(2, 6));

        // 11. replace()
        System.out.println("replace 'Java' with 'JDK': " + str.replace("Java", "JDK"));

        // 12. replaceAll() & replaceFirst()
        System.out.println("replaceAll (remove spaces): " + str.replaceAll("\\s", ""));
        System.out.println("replaceFirst: " + str.replaceFirst("Java", "JDK"));

        // 13. split()
        String tech = "Java,Spring,React";
        String[] arr = tech.split(",");
        System.out.println("split result:");
        for (String s : arr) {
            System.out.println(" - " + s);
        }

        // 14. isEmpty() & isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + blank.isBlank());

        // 15. toCharArray()
        char[] chars = "Code".toCharArray();
        System.out.print("toCharArray: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ===============================
        // OTHER USEFUL STRING METHODS
        // ===============================

        // 16. concat()
        System.out.println("concat: " + "Java".concat(" Developer"));

        // 17. subSequence()
        CharSequence seq = str.subSequence(2, 6);
        System.out.println("subSequence: " + seq);

        // 18. matches() (Regex)
        System.out.println("matches regex '[a-z ]+': " + str2.matches("[a-z ]+"));

        // 19. getBytes()
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes: " + Arrays.toString(bytes));

        // 20. intern()
        String pooled = str.intern();
        System.out.println("intern: " + pooled);

        // 21. stripLeading() & stripTrailing()
        System.out.println("stripLeading: [" + str.stripLeading() + "]");
        System.out.println("stripTrailing: [" + str.stripTrailing() + "]");

        // 22. repeat() (Java 11+)
        System.out.println("repeat: " + "*".repeat(5));

        // 23. String.valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("valueOf int: " + numStr);

        // 24. String.join()
        String joined = String.join("-", "2026", "03", "06");
        System.out.println("join: " + joined);

        // 25. String.format()
        String formatted = String.format(
                "Developer %s has %d years of experience", "Suraj", 5
        );
        System.out.println("format: " + formatted);

        // ===============================
        // UNICODE / ADVANCED METHODS
        // ===============================

        // 26. codePointAt()
        System.out.println("codePointAt(2): " + str.codePointAt(2));

        // 27. codePointBefore()
        System.out.println("codePointBefore(3): " + str.codePointBefore(3));

        // 28. codePointCount()
        System.out.println("codePointCount: " + str.codePointCount(0, str.length()));

        // 29. offsetByCodePoints()
        System.out.println("offsetByCodePoints: " + str.offsetByCodePoints(0, 3));

        System.out.println("===== END OF STRING METHODS DEMO =====");
    }


/*
📊 Quick Interview Rule

Problem Type            Array Size
lowercase letters       26
uppercase letters       26
lowercase + uppercase   52
ASCII                   128
extended ASCII          256
*/
}