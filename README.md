# =============================================================================
#                          Java Programming: From Basics to Advanced
#                         Including Data Structures and Algorithms (DSA)
# =============================================================================

# -----------------------------
# ☕ Java Basics
# -----------------------------

# 1. Variables and Data Types 
# Definition: Variables are containers for storing data values. Java is statically typed, 
# meaning you must declare a variable with a specific data type.

String name = "Alice";  // String: A sequence of characters
int age = 30;           // Integer: A whole number
double height = 5.5;    // Float: A decimal number
boolean isStudent = false;  // Boolean: Represents True or False values

System.out.printf("Name: %s, Age: %d, Height: %.1f, Is student: %b%n", name, age, height, isStudent);


# 2. Control Flow (Conditionals and Loops)
# Definition: Control flow refers to the order in which individual statements, 
# instructions, or function calls are executed.

# Conditional statement
if (age >= 18) {
    System.out.println("You're an adult.");  // Executes if the condition is true
} else {
    System.out.println("You're a minor.");   // Executes if the condition is false
}

# For loop (Iterating through a range of numbers)
for (int i = 0; i < 5; i++) {
    System.out.printf("Loop iteration %d%n", i);
}


# 3. Functions (Methods)
# Definition: A method is a block of code that only runs when it is called. 
# Methods can take parameters and can return results.

public static String greet(String name) {
    return "Hello, " + name + "!";  // Return the greeting string
}

# Calling the method
String greeting = greet("Alice");
System.out.println(greeting);


# 4. Arrays and Collections
# Definition: Java provides several built-in data structures:
# - Arrays: Ordered and fixed-size collections
# - ArrayList: Resizable array implementation of the List interface
# - HashMap: Key-value pair mapping

// Array
int[] fruits = {1, 2, 3, 4, 5};
System.out.println("First fruit: " + fruits[0]);  // Accessing the first element

// HashMap
HashMap<String, Integer> person = new HashMap<>();
person.put("Alice", 30);
System.out.println("Person's age: " + person.get("Alice"));  // Accessing value by key


# -----------------------------
# ⚙️ Intermediate Java
# -----------------------------

# 1. Object-Oriented Programming (OOP)
# Definition: OOP is a programming paradigm based on "objects", which can contain data (attributes) and code (methods).

class Dog {
    String name;  // Instance variable
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking!");  // Accessing class attributes
    }
}

# Creating an object (instance of the class)
Dog dog1 = new Dog("Buddy", "Golden Retriever");
dog1.bark();  // Calling the method


# 2. Exception Handling
# Definition: Exception handling in Java uses `try`, `catch`, and `finally` keywords to manage errors during program execution.

try {
    int result = 10 / 0;  // This will raise an ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("You can't divide by zero!");  // Handling the specific error
}


# 3. Importing Libraries
# Definition: Java has a rich set of libraries available for various functionalities.

import java.util.*;

System.out.println("Available methods in ArrayList: " + Arrays.toString(ArrayList.class.getDeclaredMethods()));


# -----------------------------
# 🔥 Advanced Java
# -----------------------------

# 1. Streams and Lambdas
# Definition: Streams represent a sequence of elements supporting sequential and parallel aggregate operations.

List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);  // Using lambda

# 2. Generics
# Definition: Generics allow you to create classes, interfaces, and methods with a placeholder for types.

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

Box<String> box = new Box<>();
box.set("Hello");
System.out.println(box.get());  // Output: Hello


# 3. Concurrency
# Definition: Concurrency enables simultaneous execution of two or more threads for better resource utilization.

Runnable task = () -> {
    System.out.println("Running in a thread!");
};

Thread thread = new Thread(task);
thread.start();  // Starting the thread


# -----------------------------
# 📚 Data Structures and Algorithms (DSA)
# -----------------------------

# 1. Arrays
# Definition: An array is a data structure containing a collection of elements, 
# typically of the same data type, arranged in sequential order.

int[] arr = {1, 2, 3, 4, 5};
for (int element : arr) {
    System.out.printf("Array element: %d%n", element);
}


# 2. Linked List
# Definition: A linked list is a linear data structure where elements (nodes) are linked using pointers. 
# Each node contains data and a reference (pointer) to the next node.

class Node {
    int data;
    Node next;  // Pointer to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;  // The first node in the linked list

    void insert(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

LinkedList llist = new LinkedList();
llist.insert(3);
llist.insert(2);
llist.insert(1);
System.out.print("Linked List: ");
llist.printList();
System.out.println();  // New line


# 3. Stack
# Definition: A stack is a linear data structure that follows the Last In First Out (LIFO) principle. 
# Elements are added and removed from one end (the top).

Stack<Integer> stack = new Stack<>();

// Push elements onto the stack
stack.push(10);
stack.push(20);
stack.push(30);

// Pop an element off the stack
System.out.printf("Popped from stack: %d%n", stack.pop());


# 4. Queue
# Definition: A queue is a linear data structure that follows the First In First Out (FIFO) principle. 
# Elements are added at one end (the rear) and removed from the other end (the front).

Queue<Integer> queue = new LinkedList<>();

// Enqueue elements
queue.add(10);
queue.add(20);
queue.add(30);

// Dequeue an element
System.out.printf("Dequeued from queue: %d%n", queue.poll());


# 5. Binary Tree
# Definition: A binary tree is a tree data structure where each node has at most two children, 
# referred to as the left and right child.

class TreeNode {
    int value;
    TreeNode left, right;  // Left and right children

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

void inorderTraversal(TreeNode root) {
    if (root != null) {
        inorderTraversal(root.left);  // Traverse left subtree
        System.out.print(root.value + " ");  // Print root value
        inorderTraversal(root.right);  // Traverse right subtree
    }
}

// Create a binary tree
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);

System.out.println("In-order traversal of binary tree:");
inorderTraversal(root);
System.out.println();  // New line


# 6. Bubble Sort
# Definition: Bubble sort is a simple sorting algorithm that repeatedly steps through the list, 
# compares adjacent elements, and swaps them if they are in the wrong order.

void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int[] bubbleArr = {64, 34, 25, 12, 22, 11, 90};
bubbleSort(bubbleArr);
System.out.print("Sorted array using Bubble Sort: ");
System.out.println(Arrays.toString(bubbleArr));


# 7. Merge Sort
# Definition: Merge sort is a divide-and-conquer algorithm that splits the list into halves, 
# sorts them, and merges them back together.

void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;  // Size of the left subarray
    int n2 = right - mid;     // Size of the right subarray

    int[] L = new int[n1];  // Left subarray
    int[] R = new int[n2];  // Right subarray

    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];  // Copying data to left subarray
    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];  // Copying data to right subarray

    // Merging the subarrays
    int i = 0, j = 0;  // Initial index of the first and second subarrays
    int k = left;      // Initial index of the merged subarray

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}

void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;  // Finding the mid point

        mergeSort(arr, left, mid);   // Sorting the first half
        mergeSort(arr, mid + 1, right);  // Sorting the second half

        merge(arr, left, mid, right);  // Merging the sorted halves
    }
}

int[] mergeArr = {38, 27, 43, 3, 9, 82, 10};
mergeSort(mergeArr, 0, mergeArr.length - 1);
System.out.print("Sorted array using Merge Sort: ");
System.out.println(Arrays.toString(mergeArr));
