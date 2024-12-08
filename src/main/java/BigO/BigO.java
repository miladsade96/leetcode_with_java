package BigO;

public class BigO {
    private BigO() throws IllegalAccessException {
        throw new IllegalAccessException("You cab not instantiate this class!");
    }
    /*
    What is BigO?
    It is a way comparing two sets of codes. Let's assume code one and code two accomplish exactly the same thing.
    How would you compare one against the other?

    Code one might be more readable, Code two might be more concise.

    BigO is a way of comparing code one and code two mathematically about how efficient they run.

    Time Complexity:        It is not about seconds, It is about the number of operations
        Code 1 ---> 15 seconds
        Code 2 ---> 60 seconds

    Space Complexity:
        Code 1 ---> 100 MB
        Code 2 ---> 20 MB

     So if the memory space is your main priority, maybe code 2 is better.

     -------------------------------------------------------------------------------------------------------------------

     Time and Space Complexity Notations:

        Omega: Best case

        Theta: Average case

        Omicron: Worst case

     Let's assume we have an array as follows:          int[] numbers = {1, 2, 3, 4, 5, 6, 7};

                                                      Omega = 1     Theta = 4       Omicron = 7

    --------------------------------------------------------------------------------------------------------------------
     */

    /// BigO(n)
    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
