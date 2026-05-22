# Parabank Automation Framework

This project automates the end-to-end user registration and login workflow for the Parabank application using Selenium WebDriver, Java, Cucumber BDD, TestNG, and Maven.

---

## Application Under Test

https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC

---

## Tech Stack

- Java
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- Page Object Model (POM)

---

## Features Automated

- User Registration
- User Login
- Account Balance Validation
- Logout Functionality

---

## Framework Structure

```text
src/test/java
 ├── hooks
 ├── pages
 ├── runners
 ├── stepdefinitions
 └── utilities

src/test/resources
 └── features
```

---

## Design Patterns Used

- Page Object Model (POM)
- Behavior Driven Development (BDD)

---

## Reporting

Cucumber HTML reports are generated under:

```text
testOutputs/cucumber-report.html
```

---

## Test Execution

Run the following command:

```bash
mvn test
```

OR

Run:

```text
TestRunner.java
```

as:

```text
Run As → TestNG Test
```

---

## Test Scenario Covered

1. Launch Parabank Application
2. Navigate to Registration Page
3. Register New User
4. Logout from Application
5. Login with Newly Created Credentials
6. Validate Successful Login
7. Print Account Balance

---

## Author

Harshad Shinde
QA Automation Engineer