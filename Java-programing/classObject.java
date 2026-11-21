// job 6
// Experiment Name: Write a Java program to demonstrate Class and Object.

// Objective: To understand how to create a class and an object in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

import java.util.Scanner;
class Student {
     void display( String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class classObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();
        
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        Student ob = new Student();
        ob.display(name, age);
    }
}

// Output:

// Name: Rahim
// Age: 20

// Comment: A class is a blueprint for creating objects. An object is an instance of a class that can access its variables and methods.