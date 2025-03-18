[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/3uo9vebk)
# PBLJ-Assignment-4

### 📖 Chapter 4: Collection Framework and MultiThreading

### 🔹 Topics Covered:
- Collection framework
- ArrayList, LinkedList, HashMap, TreeMap, HashSet in Java
- Multithreading in Java
- Thread Synchronization
- Thread Priority
- Thread LifeCycle

## 📝 Problem Statements

### ✅ Problem 1: Employee Management System (Easy Level)
#### Description:
Write a Java program to implement an *ArrayList* that stores employee details (*ID, Name, and Salary*). The program should allow users to:

- *Add* a new employee
- *Update* an existing employee
- *Remove* an employee
- *Search* for an employee by ID

#### Example Input:

1. Add Employee
2. Update Employee
3. Remove Employee
4. Search Employee
5. Display All Employees
Enter your choice: 1
Enter Employee ID: 101
Enter Name: John Doe
Enter Salary: 50000

#### Example Output:

Employee added successfully!


---

### ✅ Problem 2: Card Collection System (Medium Level)
#### Description:
Create a Java program that uses the *Collection interface* to collect and store *cards*. The program should assist users in:

- *Adding cards* (Rank and Symbol)
- *Searching cards by symbol*
- *Displaying all stored cards*

#### Example Input:

1. Add Card
2. Search by Symbol
3. Display All Cards
Enter your choice: 1
Enter Symbol (Hearts, Diamonds, etc.): Hearts
Enter Rank (Ace, 2, King, etc.): Ace

#### Example Output:

Card added successfully!


---

### ✅ Problem 3: Ticket Booking System (Hard Level)
#### Description:
Develop a *multi-threaded ticket booking system* that ensures *synchronized seat booking* to prevent double booking. Use *thread priorities* to give preference to *VIP bookings*.

#### Features:
- Multiple users booking tickets simultaneously
- Synchronization to prevent double booking
- VIP customers have *higher priority*

#### Example Output:

VIP Booking: Seat 1 confirmed.
Regular Booking: Seat 2 confirmed.
Error: Seat already booked.


---

## 🛠 Requirements:
- *Java 8 or above*
- *IDE:* Eclipse / IntelliJ / VS Code

## 📂 Folder Structure:

Assignment-1/
│── src/
│   ├── EmployeeManagement.java
│   ├── CardCollection.java
│   ├── TicketBookingSystem.java
│── README.md
│── input_output_examples.txt
