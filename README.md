# Task21-Build-a-Stack-Based-Undo-System
java calculation

## 1. Introduction
The Stack-Based Undo System is a simple text editor simulation developed using Java.

This program allows users to perform different text editing operations, such as adding, deleting, and replacing text. It also provides an undo feature to restore the previous text whenever required.

The program uses a Deque as a stack to store previous text states.

## 2. Objective
The main objective of this project is to understand stack-based state management and implement undo functionality using the Deque data structure.

## 3. Technologies Used
- Java
- Scanner Class
- Deque Interface
- ArrayDeque Class

## 4. Features
The program provides the following features:

1. **Add Text:** Allows users to add new text to the existing content.
2. **Delete Text:** Deletes the specified number of characters from the end of the text.
3. **Replace Text:** Replaces the existing text with new text.
4. **Undo Operation:** Restores the previous text state.
5. **Multiple Undo:** Allows users to undo multiple editing operations.
6. **Display Text:** Displays the current text.
7. **Exit:** Closes the text editor program.

## 5. Concepts Used

### Stack
A stack is a linear data structure that follows the LIFO (Last In, First Out) principle.

### Deque
Deque stands for Double-Ended Queue. It allows insertion and deletion of elements from both ends.

In this project, Deque is used as a stack.

### Important Methods

| Method | Description |
|---|---|
| push() | Adds an element to the top of the stack |
| pop() | Removes and returns the top element |
| isEmpty() | Checks whether the stack is empty |
| substring() | Extracts a part of a string |

## 6. Working of the Program

1. The program displays a menu containing different text editing operations.
2. The user selects an operation.
3. Before making any changes, the current text is stored in the undo stack.
4. The selected editing operation is performed.
5. When the user selects Undo, the previous text is retrieved using the `pop()` method.
6. The restored text becomes the current text.
7. The process continues until the user selects Exit.

## 7. Undo Operation Logic

The undo functionality works using two important stack operations:

- `push()`: Stores the previous text before making changes.
- `pop()`: Retrieves the most recently stored text when undo is selected.

This follows the LIFO principle.

## 8. Sample Output

```text
===== TEXT EDITOR =====
1. Add Text
2. Delete Text
3. Replace Text
4. Undo
5. Display Text
6. Exit

Enter your choice: 1
Enter text to add: Hello
Text added successfully!

Enter your choice: 1
Enter text to add: World
Text added successfully!

Enter your choice: 5
Current Text: HelloWorld

Enter your choice: 4
Last operation undone!

Enter your choice: 5
Current Text: Hello
```

## 9. Advantages
- Simple and easy-to-use text editor simulation.
- Supports multiple undo operations.
- Demonstrates practical stack implementation.
- Helps understand LIFO principles.
- Uses Java's built-in Deque interface.

## 10. Learning Outcomes
By completing this task, I learned:

- How to implement a stack using Deque.
- How to store previous states of data.
- How to use push() and pop() methods.
- How the LIFO principle works.
- How undo functionality is implemented in text editors.
- How to manage text editing operations using Java.
