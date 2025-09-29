package chapter6;

interface Animal {
boolean feed(boolean timeToEat);
void groom();
void pet();
}
class Gorilla implements Animal {
public boolean feed(boolean timeToEat) {
    if (timeToEat) {
    // put gorilla food into cage
    System.out.println("Time to feed gorilla in cage!");
        return true;
    } else {
        System.out.println("It's not feeding time yet.");
        return false;
    }
}
    public void groom() {
    // lather, rinse, repeat
    System.out.println("Cleaning time for gorilla!");
    }
    public void pet() {
    // pet at your own risk
    System.out.println("It is risky to pet gorilla!");
    }
}
public class Task16 {
public static void main(String[] args) {
    Gorilla gorilla = new Gorilla();
    gorilla.feed(true);
    gorilla.groom();
    gorilla.pet();
    }
}