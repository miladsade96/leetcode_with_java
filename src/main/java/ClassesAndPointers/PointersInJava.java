package ClassesAndPointers;

import java.util.HashMap;

public class PointersInJava {
    /// In Java, the concept of pointers, as found in languages like C or C++, does not exist in the same way. However,
    /// Java does use references, which can be thought of as a type of pointer. Here’s a breakdown of how this works:
    ///
    /// ### 1. **Primitive Data Types**
    /// Java has eight primitive data types, which are not pointers or references:
    /// - `int`
    /// - `byte`
    /// - `short`
    /// - `long`
    /// - `float`
    /// - `double`
    /// - `char`
    /// - `boolean`
    ///
    /// These types store their values directly in memory.
    ///
    /// ### 2. **Reference Data Types**
    /// Reference data types in Java do act similarly to pointers in that they refer to objects in memory rather than
    /// containing the actual data. The key reference types in Java include:
    ///
    /// - **Classes**: When you create an instance of a class, the variable holds a reference to the object in memory.
    /// For example:
    /// ```java
    /// MyClass obj = new MyClass();
    ///```
    /// Here, `obj` is a reference to an instance of `MyClass`.
    ///
    /// - **Arrays**: Arrays in Java are also reference types. When you declare an array, the variable holds a reference
    /// to the array object:
    /// ```java
    /// int[] numbers = new int[10];
    ///```
    /// Here, `numbers` is a reference to an array of integers.
    ///
    /// - **Interfaces**: When you implement an interface, the reference to the object of the implementing class is held
    /// similarly:
    /// ```java
    /// MyInterface obj = new MyClass();
    ///```
    ///
    /// - **Strings**: Strings are also reference types. When you create a string, the variable holds a reference to the string object:
    /// ```java
    /// String str = "Hello, World!";
    ///```
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
