package com.example.fizzbuzz.steps;

import com.example.fizzbuzz.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzSteps {
    private int number;
    private String result;

    @Given("a FizzBuzz implementation")
    public void a_fizzbuzz_implementation() {
        // no-op, ensures Background step is defined
    }

    @Given("the number {int}")
    public void the_number(Integer n) {
        this.number = n;
    }

    @When("I convert it using fizzbuzz")
    public void i_convert_it_using_fizzbuzz() {
        this.result = FizzBuzz.fizzBuzz(this.number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, this.result);
    }
}
