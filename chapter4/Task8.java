package chapter4;
public class Task8 {
// Method with variable arguments
  public static int cumsum (int... num) {
  int total = 0;
    for (int par : num) {
    int sumToPar = (par * (par + 1)) / 2; // Formula for 1+2+...+n
    System.out.println("Sum of numbers from 1 to " + par + " = " + sumToPar);
    total += sumToPar;
    }
     return total;
    }
    public static void main(String[] args) {
    int result = cumsum(4, 5, 10);
    System.out.println("Overall Total = " + result);
    }
}