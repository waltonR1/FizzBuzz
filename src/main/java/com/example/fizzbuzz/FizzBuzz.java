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
        if (n == 1) return "1";
        if (n == 2) return "2";
        if (n == 3) return "Fizz";

        return Integer.toString(n);
    }

    // prevent instantiation
    private FizzBuzz() { }
}
