// job 7
// Experiment Name: Write a Java program to use a Constructor.

// Objective: To understand how a constructor initializes an object in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

import java.util.Scanner;

class student {
    String name;
    int age;

    student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class useConstructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        student ob = new student(name, age);

        ob.display();
    }
}

// Output:

// Name: Rahim
// Age: 20

// Comment: A constructor is a special method that is automatically called when an object is created. It is mainly used to initialize object data.