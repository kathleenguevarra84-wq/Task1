package chapter1;

import java.util.Random;

public class Toy {
    String name;
    String brand;
    double price;
    int quantity;
      
 //sample file

    void setPrice(double Price){
            this.price = Price;
    }
    public static void main(String[] args) {
        //create an instance of a Toy class = Toy object

       /*this
        *is a 
        *multiline
        *comment
        */
        Toy toy1 = new Toy();
            toy1.name = "Doll";
            toy1.brand = "Barbie";
            toy1.price = 1250;
            toy1.quantity = 5;
            toy1.setPrice ((toy1.price*0.5));
            
            System.out.println(toy1.price);

            Random r = new Random();
            System.out.println(r.nextInt());
           // this create instance in string array: System.out.println(args[2]);
    }
}

  /**
 * Toy Object
 * has property/attribute of name, brand, price, quantity
 * with a method of setPrice() where you can change
 * the price state of Toy Object.
 */

 class Fruit {

 }

 class Fruit2{

 }
  class Fruit3{
    
 }
  class Fruit4{
    public static void main(String[] args) {
        System.out.println("I am Fruit 4");
        Fruit3 f3 = new Fruit3();
    }
 }