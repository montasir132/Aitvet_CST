// job 11
// Experiment Name: Write a Java program to use an Interface.

// Objective: To understand how to declare and implement an Interface in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

interface soundAnimal {
    void sound();
}

class Cat implements soundAnimal {
    public void sound() {
        System.out.println("Cat mewos.");
    }
}

public class useInterface {
    public static void main(String[] args) {
        Cat ob = new Cat();

        ob.sound();
    }
}

// Output:

// Dog barks.

// Comment: An Interface defines a contract that implementing classes must follow. The implements keyword is used to implement an interface in Java.