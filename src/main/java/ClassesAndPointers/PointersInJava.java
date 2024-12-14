package ClassesAndPointers;

public class PointersInJava {
    public static void main(String[] args) {
        // These are not pointers:

        int num1 = 11;
        int num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        num1 = 22;
        System.out.println("-".repeat(50));

        System.out.println(num1);
        System.out.println(num2);

        // -------------------------------------------------------------------------------------------------------------
    }
}
