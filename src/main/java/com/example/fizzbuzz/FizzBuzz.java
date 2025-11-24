package com.example.fizzbuzz;

public class FizzBuzz {
    /**
     * Return the FizzBuzz representation for a positive integer.
     * @param n positive integer
     * @return "FizzBuzz" if divisible by 3 and 5, "Fizz" if divisible by 3,
     *         "Buzz" if divisible by 5, otherwise the number as a String.
     * @throws IllegalArgumentException if n <= 0
     */
    public static String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(n);
    }

    // prevent instantiation
    private FizzBuzz() { }
}
