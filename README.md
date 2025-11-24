# FizzBuzz (Java, Maven)

Author: Haihang WANG

This repository contains a small Java project implementing the FizzBuzz conversion and BDD feature tests using Cucumber. The project is developed using TDD (Red / Green / Refactor).

Rules
-----
- If the number is a multiple of 3, return the string "Fizz".
- If the number is a multiple of 5, return the string "Buzz".
- If the number is a multiple of both 3 and 5, return the string "FizzBuzz".
- Otherwise, return the number itself as a decimal string.

Notes on validation and workflow
-------------------------------
- No additional input validation is required by the project (the implementation assumes valid positive integers as input).
- Workflow: this project follows TDD — write a failing test (Red), implement the smallest change to make it pass (Green), then refactor (Refactor).

Examples
--------
- 1 ➔ "1"
- 2 ➔ "2"
- 3 ➔ "Fizz"
- 5 ➔ "Buzz"
- 15 ➔ "FizzBuzz"
- 30 ➔ "FizzBuzz"

Quickstart
----------

Prerequisites:
- JDK 21
- Maven

Run tests (unit + cucumber features):

```bash
mvn -U clean test
```

Run a single feature or scenario via Maven:

- You can filter JUnit Platform tests with tags or classnames. For Cucumber, features under `src/test/resources/features/` are discovered automatically by the Cucumber JUnit Platform engine.

Continuous Integration
-----------------------
A GitHub Actions workflow `.github/workflows/ci.yml` is included to build and test the project on each push and PR.

Notes
-----
- Tests are implemented in Gherkin under `src/test/resources/features/fizzbuzz.feature` and the step definitions are under `src/test/java/.../steps`.
