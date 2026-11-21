// File 2: Main.java
// Importing the custom Calculator class from the addPackage.Calculator package
import addPackage.Calculator;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number a: ");
        int a = input.nextInt();
        System.out.println("Enter your number b: ");
        int b = input.nextInt();
        Calculator ob = new Calculator();
        int result = ob.add(a, b);

        System.out.println("The sum is: " + result);
    }
}

// Output:

// The sum is: 40
