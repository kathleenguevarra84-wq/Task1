package chapter5;
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
public AbstractShape(String color, double length, double width) {
    this.color = color;
    this.length = length;
    this.width = width;
    }
public double calculateArea() {
    return 0.0;
    }
public double calculatePerimeter() {
    return 0.0;
    }
}
class Circle extends AbstractShape {
private double radius;
public Circle(String color, double radius) {
    super(color, 0, 0); 
    this.radius = radius;
    }
@Override
    public double calculateArea() {
    return Math.PI * radius * radius;
    }
@Override
    public double calculatePerimeter() {
    return 2 * Math.PI * radius;
    }
public void display() {
    System.out.println("Circle Color: " + color);
    System.out.println("Circle Area: " + calculateArea());
    System.out.println("Circle Perimeter: " + calculatePerimeter());
    }
}
class Rectangle extends AbstractShape {
public Rectangle(String color, double length, double width) {
    super(color, length, width);
    }
@Override
    public double calculateArea() {
    return length * width;
    }
@Override
    public double calculatePerimeter() {
    return 2 * (length + width);
    }
public void display() {
    System.out.println("Rectangle Color: " + color);
    System.out.println("Rectangle Area: " + calculateArea());
    System.out.println("Rectangle Perimeter: " + calculatePerimeter());
    }
}
public class Task15 {
public static void main(String[] args) {
        
    Circle circle = new Circle("Blue", 10);
    circle.display();
    System.out.println();

    Rectangle rectangle = new Rectangle("Green", 4, 8);
    rectangle.display();
    }
}