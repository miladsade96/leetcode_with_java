package FibonacciNumber;

public class Solution {
    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        var result = fibonacci(4);
        System.out.println(result);
    }
}
