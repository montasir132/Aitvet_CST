// job 9
// Experiment Name: Write a Java program to use Polymorphism.

// Objective: To understand Runtime Polymorphism using Method Overriding in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class usePolymorphism {
    public static void main(String[] args) {
        Animal ob = new Dog();

        ob.sound();
    }
}

// Output:

// Dog barks.

// Comment: Polymorphism allows one reference variable to represent different object types. Method Overriding enables the child class to provide its own implementation of a parent class method.