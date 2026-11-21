// job 4
// Experiment Name: Write a Java program to calculate the area of a scalene triangle.

// Objective: To calculate the area of a scalene triangle using Heron's formula in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.

import java.util.Scanner;

public class areaScaleneTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if((a + b > c && b + c > a && c + a > b) && (a != b && b != c && c != a)){
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of the scalene triangle: " + area);
        }else{
            System.out.println("It's not a scalene triangle");
        }
    }
}

// Output:

// Enter three sides of the triangle: 5 6 7
// Area of the triangle: 14.696938456699069

// Comment: Heron's formula is used to calculate the area of a triangle when the lengths of all three sides are known. The Math.sqrt() method is used to calculate the square root.