// job 5
// Experiment Name: Write a Java program to find the roots of a quadratic equation.

// Objective: To calculate the roots of a quadratic equation using the quadratic formula in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1: " + root1 +"\nRoot 2: " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Both roots are equal: " + root);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}

// Output:

// Enter a, b and c: 1 -5 6
// Root 1: 3.0
// Root 2: 2.0

// Comment: The quadratic formula is used to calculate the roots of an equation. The discriminant (d) determines whether the roots are real and distinct, equal, or imaginary.