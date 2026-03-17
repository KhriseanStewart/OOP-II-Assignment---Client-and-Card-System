# Module 1 – Assignment #1

**Introduction to Object-Oriented Programming II**

## Student Information

* **Student Name:** Khrisean Stewart
* **Institution:** Vocational Training Development Institute (VTDI)
* **Department:** ICT Department
* **Module:** Introduction to Object-Oriented Programming II
* **Lecturer:** Ssyade Gayle
* **Assignment:** Module 1 – Assignment #1
* **Due Date:** March 17, 2026 – 11:59 PM

---

# Project Overview

This project implements the classes required for **Module 1 Assignment #1** based on the provided UML diagram.

The assignment demonstrates key **Object-Oriented Programming (OOP)** concepts in Java, including:

* Classes and objects
* Encapsulation
* Constructors
* Getters and setters
* Package organization
* User input handling

The program allows a user to create a **Client object** with associated **Card information**, display the stored data, and modify certain card properties.

---

# Project Structure

```
project-folder/
│
├── README.md
├── Assignment 1.pdf
│
├── realm/
│   ├── Client.java
│   └── Card.java
│
└── manner/
    └── TestMe.java
```

### Package Descriptions

**realm package**

* Contains the main classes based on the UML diagram.
* `Client.java`
* `Card.java`

These classes contain:

* Private attributes
* Constructors
* Getter and Setter methods

**manner package**

* Contains the testing class.
* `TestMe.java` includes the `main()` method to run the program.

---

# Program Features

The `TestMe` class performs the following tasks:

1. Creates an object of type **Client** called `Clobj1`.
2. Prompts the user to enter all **Client and Card information**.
3. Displays **all contents** of the Client object.
4. Displays **only the card information**.
5. Updates the card by:

   * Setting **card status to true**
   * Setting **card number to 45678**

---

# Technologies Used

* **Java**
* **VSCode IDE**
* **Object-Oriented Programming Principles**

---

# How to Run the Program

1. Open the project folder in **VSCode** (File → Open Folder → select the project folder).
2. Ensure the packages are structured as:

   * `realm`
   * `manner`
3. Run the program:
   * **Option A:** Open `manner/TestMe.java`, then click **Run** above `main` or press F5 (requires the Java Extension Pack).
   * **Option B:** From the integrated terminal (e.g. project root):

   ```
   javac realm/*.java manner/*.java
   java manner.TestMe
   ```

4. Follow the prompts in the console to input the required information.

---

# Assignment File

The official assignment instructions are included in this project:

**File:** `Assignment 1.pdf`

This document contains:

* The UML diagram
* Detailed requirements
* Grading breakdown

---

# Notes

* The program follows the UML diagram provided in the assignment.
* All attributes are **private** and accessed using **getter and setter methods** to maintain encapsulation.
* The project was tested to ensure correct input and output functionality.

---
