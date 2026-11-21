// job 3
// Experiment Name: Write a Java program to find the largest number among three numbers.

// Objective: To find the largest number among three given numbers using conditional statements in Java.

// Required Equipment: Computer, JDK (Java Development Kit), IntelliJ IDEA.

// Program: Write the following Java code and run it.
//
import java.util.Scanner;

public class largestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}

// Output:

// Enter three numbers: 10 25 15
// Largest number: 25

// Comment: The if-else if-else statements are used to compare three numbers and determine the largest one.