package chapter4;
import static java.lang.Math.*;
public class Task9 {
    public static int add(int a, int b) {
        return addExact(a,b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a,b);
    }
    
    // The method floorDiv(int,int) in the type Math is not applicable 
    // for the arguments (float,float) because it is specifically 
    // designed to work with integer types.

    public static float divide(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        float num4 = 10F;
        float num5 = 5F;

        // Perform addition and display sum
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + add(num1, num2));
        
        // Perform subtraction and display difference
        System.out.println("Subtraction: " + num2 + " - " + num1 + " = " + subtract(num2, num1));
       
        // Perform multiplication and display product
        System.out.println("Multiplication: " + num3 + " * " + num2 + " = " + multiply(num3, num2));
        
        // Perform division and display quotient
        System.out.println("Division: " + num4 + " / " + num5 + " = " + divide(num4, num5));
        
    }
}