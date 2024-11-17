### Detailed Description of the Simple Calculator Program (Java Project 3)

The **Simple Calculator** program is a console-based application that allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The program continuously prompts the user to input two numbers and an operation, performs the calculation, and displays the result. It also validates user input to ensure that the program operates without errors (e.g., no division by zero or invalid numbers). The user can perform multiple calculations in one session and exit the program at any time.

### Working Procedure in Detail

#### 1. **Program Initialization and Setup**
   - The program begins by importing the `Scanner` class from the `java.util` package, which is used for reading input from the user.
   - A `Scanner` object (`scanner`) is created to facilitate reading user inputs for numbers and operations.

#### 2. **Main Loop for Continuous Calculation**
   - The program enters an infinite `while (true)` loop, allowing the user to perform multiple calculations without restarting the program.
   - Inside the loop, the program prompts the user for two numbers and an arithmetic operation (addition, subtraction, multiplication, or division).
   - The loop will continue running until the user decides to exit.

#### 3. **User Input Collection**
   - The program prompts the user to enter the first number (`num1`). This input is passed to the `getValidNumber()` method to ensure the input is a valid number.
   - The user is then prompted for the second number (`num2`), and the same validation method is applied.
   - After both numbers are entered and validated, the program prompts the user to enter the desired operation (either `+`, `-`, `*`, or `/`).
   
#### 4. **Validating User Input for Numbers**
   - The `getValidNumber()` method ensures that the user input is a valid `double`. If the user enters anything other than a valid number (e.g., a letter or special character), the program catches the `NumberFormatException` and prompts the user to enter the number again.
   - The method will repeatedly ask for a valid number until the user provides one. This ensures the program doesn't crash or produce unexpected results due to invalid input.

#### 5. **Performing the Arithmetic Operations**
   - After the user provides the two numbers and an operation, the program uses a `switch` statement to perform the corresponding arithmetic operation.
   - **Addition**: If the user chooses the `+` operation, the program adds `num1` and `num2`.
   - **Subtraction**: If the user selects the `-` operation, the program subtracts `num2` from `num1`.
   - **Multiplication**: If the user selects the `*` operation, the program multiplies `num1` and `num2`.
   - **Division**: If the user chooses the `/` operation, the program checks if `num2` is zero before attempting to divide. Division by zero is not allowed, so the program outputs an error message if `num2` equals zero and prevents the operation from proceeding.
   - If the user selects an invalid operation (something other than `+`, `-`, `*`, or `/`), the program outputs an error message indicating the operation is not recognized.

#### 6. **Displaying the Result**
   - If the operation is valid (i.e., no division by zero or invalid operation), the program calculates the result and displays it in the following format:
     ```
     Result: [num1] [operation] [num2] = [result]
     ```
   - For example:
     ```
     Result: 10 + 5 = 15
     ```
   - If the operation is invalid or if there is an error (e.g., division by zero), the program prints an appropriate error message and does not display a result.

#### 7. **Allowing Multiple Calculations**
   - After the result is displayed, the program asks the user whether they want to perform another calculation or exit.
     ```
     Do you want to perform another calculation? (yes/no):
     ```
   - If the user types "yes", the program continues the loop and prompts for the next calculation.
   - If the user types "no", the program exits the loop and terminates gracefully, displaying a message:
     ```
     Exiting the Simple Calculator.
     ```

#### 8. **Closing the Scanner Resource**
   - After the user exits the program, the `scanner.close()` method is called to close the `Scanner` object. This is important to release the resources associated with the `Scanner` and avoid potential memory leaks.

### Key Concepts and Features:

1. **Input Validation for Numbers**: 
   - The `getValidNumber()` method ensures the user enters valid numeric input. If the user provides invalid input (e.g., a string or special character), the program catches the exception and prompts the user to enter a valid number again.
   
2. **Arithmetic Operations**:
   - The program performs basic arithmetic operations (`+`, `-`, `*`, `/`) using the appropriate mathematical operators in Java.

3. **Error Handling**:
   - **Invalid Operation**: If the user enters an operation other than the expected (`+`, `-`, `*`, `/`), the program displays an error message and skips the calculation.
   - **Division by Zero**: If the user tries to divide by zero, the program detects this scenario and prevents the operation from being executed, displaying an error message instead.

4. **Looping for Continuous Input**:
   - The program runs in an infinite loop until the user explicitly chooses to exit by typing "no" after each calculation.
   
5. **Graceful Exit**:
   - The program provides the user with an option to exit after each calculation, ensuring a clean exit when desired.

### Example Program Output:

#### First Calculation (Valid Input):
```
Enter the first number: 10
Enter the second number: 5
Enter the operation (+, -, *, /): +
Result: 10.0 + 5.0 = 15.0

Do you want to perform another calculation? (yes/no): yes
```

#### Second Calculation (Invalid Operation):
```
Enter the first number: 10
Enter the second number: 5
Enter the operation (+, -, *, /): ^
Error: Invalid operation.

Do you want to perform another calculation? (yes/no): yes
```

#### Third Calculation (Division by Zero):
```
Enter the first number: 10
Enter the second number: 0
Enter the operation (+, -, *, /): /
Error: Cannot divide by zero.

Do you want to perform another calculation? (yes/no): no
Exiting the Simple Calculator.
```

### Conclusion:

This **Simple Calculator** program demonstrates the key concepts of handling user input, performing basic arithmetic operations, validating data, and managing program flow in Java. It ensures a robust user experience by checking for errors like invalid operations or division by zero. The program is easy to extend for additional features, such as handling more complex operations, supporting more advanced input validation, or creating a graphical user interface (GUI) for more user-friendly interaction.
