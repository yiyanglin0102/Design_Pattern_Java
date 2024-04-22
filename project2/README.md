| CS-665     | Software Design & Patterns |
|------------|----------------------------|
| Name       | Yi-Yang Lin                |
| Date       | 02/23/2023                 |
| Course     | Spring                     |
| Assignment | 2                          |

# Project Name

Delivery Application - Notification System

# Assignment Overview

In this project, it utilizes observer pattern structure to implement delivery notification system.
Drivers will be notified once the Shop triggers update functions as fast as possible.

# Project Structure

```
./src
├── /main
│   ├── Main.java
│   ├── Driver.java
│   ├── Van.java
│   ├── Taxi.java
│   ├── Scooter.java
│   ├── Shop.java
│   └── Request.java
│
└── /test
    └── Test.java
```

The workspace is structured in following:

- `/src` : a folder to maintain source codes.
    - `main` : a folder to mainly implement project Classes.
        - `Main` : To implement Delivery Application Notification System project solution.
        - `Driver` : A general Driver class is created as an observer  object that has subclasses of Van, Taxi, Scooter types.
        - `Van` : A Van observer class that used for implementing functions for Van type of Driver.
        - `Taxi` : A Taxi observer class that used for implementing functions for Taxi type of Driver.
        - `Scooter` : A Scooter observer class that used for implementing functions for Scooter type of Driver.
        - `Shop` : A Shop class is created as an observable object that updates notifications to driver observers.
        - `Request` : An interface request list for drivers to subscribe and unsubscribe.

  - `test` : a folder to maintain testcases.
    - `Test` : created 5 testcases to assert the inputs and outputs.

# Diagram

![Diagram](./Diagram.png)

# Implementation Description

- Explain the level of flexibility in your implementation, including how new object types can
  be easily added or removed in the future.
  - There are polymorphism feature made for Driver class as parent class, and its children
    classes, Van, Taxi, Scooter classes. Thus, for instance, `deliverLoadingSize` abstract
    function are able to be overridden.
- Discuss the simplicity and understandability of your implementation, ensuring that it is
  easy for others to read and maintain.
  - Shop object class and Driver object class will be created at first.
  - Driver classes are divided into three types as workspace structures.
  - In the future work, designer can create more functions such as `deliverLoadingSize` abstract functions.
- Describe how you have avoided duplicated code and why it is important.
  - The driver class has a group of functions that a general driver has. It is created as parent and can be extended. 
  When it comes to children class, does not need to make duplicate codes.
  - The enum is created for loading size of Van, Taxi, Scooter drivers.
- If applicable, mention any design patterns you have used and explain why they were
  chosen.
  - Observer pattern is suitable for this scenario. The observable pushes its notification 
  or changes to the observers, and the receivers get the changes as quick as possible. 

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/)
on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a
standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains
information about the project, such as its dependencies, the build configuration, and the plugins used for building and
packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the
dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that
builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to
use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports,
and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the
behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is
annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the
code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and
easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code
they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all
required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time
changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for
manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:

```bash
mvn clean test
```

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool
that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems
or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and
other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately
obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to
meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the
development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues
later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential
security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.

## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source
tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as
well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on
any issues or violations of the coding standards defined in its configuration. This includes issues like code style,
code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices,
making it easier for other developers to read and maintain. It can also help to identify potential issues before the
code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a
wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing
tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`
