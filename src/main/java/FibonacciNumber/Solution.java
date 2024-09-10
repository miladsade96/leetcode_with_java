package FibonacciNumber;

public class Solution {
    /**
     * Solution for 509.Fibonacci Number
     * Big O:
     * Time complexity: O(2^n)
     * Space complexity: O(n)
     *
     * @param n fibonacci(n) should be calculated and returned
     * @return nth fibonacci number
     */
    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
