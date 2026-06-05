# Banking Application

## Overview

This project is a simple Banking Application developed in Java using Interfaces, Polymorphism, and Exception Handling.

The application supports:

* Depositing money
* Withdrawing money
* Balance management
* Custom exception handling

---

## Features

* Interface implementation using `Transactable`
* Custom checked exception handling
* Runtime exception validation
* Encapsulation with private fields
* Account statement generation

---

## Technologies Used

* Java
* VS Code
* OOP Concepts
* Exception Handling

---

## Project Structure

```text
BankingSystem
│
├── Transactable.java
├── BankAccount.java
├── InsufficientFundsException.java
└── Main.java
```

---

## How to Run

### Compile

```bash
javac *.java
```

### Run

```bash
java Main
```

---

## Sample Output

```text
Deposit Successful: 2000.0
Withdrawal Successful: 3000.0

----- Account Statement -----
Account Number: PK101
Owner Name: Humaira
Current Balance: 4000.0

Exception Caught: Insufficient balance

Exception Caught: Deposit amount must be positive
```

---

## Concepts Demonstrated

* Interfaces
* Polymorphism
* Encapsulation
* Exception Handling
* Custom Exceptions
* Try-Catch Blocks

---

## Author

Developed as part of Java OOP coursework.
