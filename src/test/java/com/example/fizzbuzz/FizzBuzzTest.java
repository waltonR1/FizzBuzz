package com.example.fizzbuzz;

import io.cucumber.core.cli.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void runFizzBuzzFeature() {
        String[] argv = new String[]{"-g", "com.example.fizzbuzz.steps", "src/test/resources/features/fizzbuzz.feature"};
        int exit = Main.run(argv, Thread.currentThread().getContextClassLoader());
        assertEquals(0, exit, "Cucumber reported failing scenarios (exit code != 0)");
    }
}
