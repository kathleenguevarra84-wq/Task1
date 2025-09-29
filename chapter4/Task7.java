package chapter4;
import java.util.Scanner;
public class Task7 {
// Method for addition
public static int add(int a, int b) {
    return a + b;
    }
// Method for subtraction
public static int subtract(int a, int b) {
    return a - b;
    }
// Method for multiplication
public static int multiply(int a, int b) {
    return a * b;
    }
// Method for division
public static double divide(int a, int b) {
    if (b == 0) {
    System.out.println("Error: Division by zero is not allowed.");
    return 0; 
    }
    return (double) a / b;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// User input
System.out.print("Enter the 1st number: ");
    int n1 = sc.nextInt();
System.out.print("Enter the 2nd number: ");
    int n2 = sc.nextInt();

// Calling methods and printing results
System.out.println("Addition: " + n1 + " + " + n2 + " = " + add(n1, n2));
System.out.println("Subtraction: " + n1 + " - " + n2 + " = " + subtract(n1, n2));
System.out.println("Multiplication: " + n1 + " x " + n2 + " = " + multiply(n1, n2));
System.out.println("Division: " + n1 + " / " + n2 + " = " + divide(n1, n2));
sc.close();
}
}