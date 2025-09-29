# Java Programs Collection

This repository contains three Java programs that demonstrate:
- Basic input handling (`SumIntegers`)
- Object serialization and deserialization (`StudentSerialization`)
- Persistent employee record management (`EmployeeManagement`)

---

## 📂 Project Structure

---

## 📝 Programs Overview

### 1. SumIntegers
A simple program that:
- Accepts a line of integers separated by spaces.
- Stores them in an `ArrayList`.
- Calculates and prints their total sum.

**Example Run:**

---

### 2. StudentSerialization
This program demonstrates **serialization** in Java.

- Defines a `Student` class with `studentID`, `name`, and `grade`.
- Serializes a `Student` object into `student.ser`.
- Reads the object back from the file.
- Prints student details after deserialization.

**Example Run:**

---

### 3. EmployeeManagement
A **menu-driven application** that manages employees using **serialization with appendable streams**.

**Features:**
- Add Employee (Name, ID, Designation, Salary).
- Display all employees stored in `employees.dat`.
- Persistent storage across multiple runs.

**Example Run:*
---

## 🚀 How to Compile & Run

1. Compile the program(s):
   ```bash
   javac SumIntegers.java
   javac StudentSerialization.java
   javac EmployeeManagement.java
*
java SumIntegers
java StudentSerialization
java EmployeeManagement
