// job 10
// Experiment Name: Write a Java program to use Inheritance.

// Objective: To understand how one class can acquire the properties and methods of another class using Inheritance in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

class animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class useInheritance {
    public static void main(String[] args) {
        dog ob = new dog();

        ob.eat();
        ob.bark();
    }
}

// Output:

// Animal is eating.
// Dog is barking.

// Comment: Inheritance allows a child class to acquire the properties and methods of a parent class using the extends keyword. It helps with code reusability.