# Password Validator (Java)

Overview

This project is a simple Password Validator developed using Java. It checks whether a password meets basic security requirements and provides clear feedback to the user.

Features

* Checks minimum length (at least 8 characters)
* Ensures at least one uppercase letter is present
* Ensures at least one digit is present
* Gives specific feedback for invalid passwords
* Repeats input until a valid password is entered
* Displays password rules before taking input

Technologies Used

* Java
* Basic concepts: loops, conditions, strings, character methods

How to Run

1. Open terminal in the project folder
2. Compile the program:
   javac PasswordValidator.java
3. Run the program:
   java PasswordValidator

## Sample Output

Enter password: abc
Password too short

Enter password: abcdefgh
Missing uppercase letter

Enter password: Abcdefgh
Missing digit

Enter password: Abcdefg1
Password is valid

