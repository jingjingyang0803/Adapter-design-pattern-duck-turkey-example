# Adapter design pattern duck example code

This is a project that demonstrates the Adapter pattern by creating an adapter to make a Turkey object compatible with a Duck interface.

## Description

The adapter pattern allows a client to work with incompatible interfaces. In this project, we have a Duck interface and a Turkey class that implements a different interface. The goal is to create a TurkeyAdapter class that adapts the Turkey interface to work with the Duck interface.

## Implementation

The main classes involved in the project are:

- Duck: An interface that defines the behavior of a duck.
- Turkey: A class that implements a different interface and has its own behavior.
- TurkeyAdapter: A class that adapts the Turkey interface to work with the Duck interface.

## Getting Started

To get started with the project, follow these steps:

1. Clone the repository
2. Open the project in your preferred Java IDE.
3. Explore the code and familiarize yourself with the Duck, Turkey, and TurkeyAdapter classes.
4. Run the provided JUnit test classes to verify the functionality of the adapter.

## Requirements

To run the project, you need to have the following installed:

- Java Development Kit (JDK) version 8 or above
- Maven build tool

## Test classes

### BeforeAdapterTest.java

This test class is responsible for testing the behavior of the classes before the implementation of the Adapter pattern. It includes the following test methods:

- **testMallardDuckQuack()**: This method tests the `quack()` method of the `MallardDuck` class and asserts that the output matches the expected "Quack\n".
- **testMallardDuckFly()**: This method tests the `fly()` method of the `MallardDuck` class and asserts that the output matches the expected "I'm flying\n".
- **testWildTurkeyGobble()**: This method tests the `gobble()` method of the `WildTurkey` class and asserts that the output matches the expected "Gobble gobble\n".
- **testWildTurkeyFly()**: This method tests the `fly()` method of the `WildTurkey` class and asserts that the output matches the expected "I'm flying a short distance\n".

### AfterAdapterTest.java

This test class is responsible for testing the behavior of the classes after the implementation of the Adapter pattern. It includes the following test methods:

- **testTurkeyAdapterQuack()**: This method tests the `quack()` method of the `TurkeyAdapter` class (which adapts the `WildTurkey` class) and asserts that the output matches the expected "Gobble gobble\n".
- **testTurkeyAdapterFly()**: This method tests the `fly()` method of the `TurkeyAdapter` class (which adapts the `WildTurkey` class) and asserts that the output matches the expected "I'm flying a short distance\n" repeated five times.

These test classes ensure that the adapter implementation behaves as expected and that the adapted methods produce the correct output.

###

To run the test classes, follow these steps:

1. Open the terminal or command prompt.
2. Navigate to the root directory of the project.
3. Run command `mvn test` to execute the tests:
4. Wait for the tests to complete. The test results will be displayed in the terminal or command prompt.
   Note: The `mvn test` command assumes that you have Maven configured in your system's PATH environment variable. If not, you may need to provide the full path to the `mvn` executable.
