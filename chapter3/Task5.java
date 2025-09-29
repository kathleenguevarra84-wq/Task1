package chapter3;
import java.util.*;
public class Task5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    try {
        System.out.print ("Type in the 1st number: ");
        int n1 = input.nextInt();

        System.out.print ("Type in the 2nd number: ");
        int n2 = input.nextInt();

        System.out.print ("Type in the 3rd number: ");
        int n3 = input.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println ("All of the given numbers are equal!"); }
        else {
            int highest;

                if (n1>=n2 && n1>=n3) {
                    highest = n1; }
                else if (n2>=n1 && n2>=n3) {
                    highest = n2; }
                else { highest = n3; }

                System.out.println ("Among all the numbers, the highest is: " + highest);
            }
        } catch (Exception a) {
            System.out.println ("Invalid input!");
        } finally {input.close();
        }
    }
}

