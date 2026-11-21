// job 8
// Experiment Name: Write a Java program to use Method Overloading.

// Objective: To understand Method Overloading by creating multiple methods with the same name but different parameters.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        Calculator ob = new Calculator();
        System.out.println(ob.add(10, 20));
        System.out.println(ob.add(10, 20, 30));
        System.out.println(ob.add(5.5, 4.5));
    }
}

// Output:

// 30
// 60
// 10.0

// Comment: Method Overloading allows multiple methods to have the same name with different parameter lists. The compiler selects the appropriate method based on the arguments.