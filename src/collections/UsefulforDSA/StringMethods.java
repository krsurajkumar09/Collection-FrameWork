package collections.UsefulforDSA;

public class StringMethods {

    // ONE method → called from Main class
    public static void demonstrateStringMethods() {

        System.out.println("===== JAVA STRING INBUILT METHODS DEMO =====");

        String str = "  Java Spring Boot  ";
        String str2 = "java spring boot";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("charAt(2): " + str.charAt(2));

        // 3. equals() & equalsIgnoreCase()
        System.out.println("equals: " + str.equals(str2));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str2));

        // 4. toUpperCase() & toLowerCase()
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());

        // 5. trim() & strip()
        System.out.println("trim: [" + str.trim() + "]");
        System.out.println("strip: [" + str.strip() + "]");

        // 6. contains()
        System.out.println("contains 'Spring': " + str.contains("Spring"));

        // 7. startsWith() & endsWith()
        System.out.println("startsWith '  Java': " + str.startsWith("  Java"));
        System.out.println("endsWith 'Boot  ': " + str.endsWith("Boot  "));

        // 8. indexOf() & lastIndexOf()
        System.out.println("indexOf 'o': " + str.indexOf('o'));
        System.out.println("lastIndexOf 'o': " + str.lastIndexOf('o'));

        // 9. substring()
        System.out.println("substring(2): " + str.substring(2));
        System.out.println("substring(2, 6): " + str.substring(2, 6));

        // 10. replace()
        System.out.println("replace 'Java' with 'JDK': " + str.replace("Java", "JDK"));

        // 11. split()
        String tech = "Java,Spring,React";
        String[] arr = tech.split(",");
        System.out.println("split result:");
        for (String s : arr) {
            System.out.println(" - " + s);
        }

        // 12. isEmpty() & isBlank()
        String empty = "";
        String blank = "   ";
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + blank.isBlank());

        // 13. toCharArray()
        char[] chars = "Code".toCharArray();
        System.out.print("toCharArray: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 14. String.valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("valueOf int: " + numStr);

        // 15. String.format()
        String formatted = String.format(
                "Developer %s has %d years of experience", "Suraj", 5
        );
        System.out.println("format: " + formatted);

        // 16. repeat() (Java 11+)
        System.out.println("repeat: " + "*".repeat(5));

        System.out.println("===== END OF STRING METHODS DEMO =====");
    }
}
