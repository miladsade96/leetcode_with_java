package ClassesAndPointers;

import java.util.HashMap;

public class PointersInJava {
    public static void main(String[] args) {
        // These are not pointers:
        System.out.println("Not Pointers:\n");

        int num1 = 11;
        int num2 = num1;

        System.out.println("-".repeat(30) + " Before " + "-".repeat(30));
        System.out.println(num1);
        System.out.println(num2);

        num1 = 22;

        System.out.println("-".repeat(30) + " After " + "-".repeat(30));
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("\n\n\n\n\n");
        // -------------------------------------------------------------------------------------------------------------

        // These are pointers:
        System.out.println("Pointers:\n");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        System.out.println("-".repeat(30) + " Before " + "-".repeat(30));
        System.out.println(map1);
        System.out.println(map2);

        System.out.println("-".repeat(30) + " After " + "-".repeat(30));
        map1.put("value", 22);
        System.out.println(map1);
        System.out.println(map2);
    }
}
