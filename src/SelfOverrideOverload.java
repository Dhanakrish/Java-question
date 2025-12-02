// Parent class: Shape
class Shape {

    // Method 1: Area of a rectangle (int, int)
    int area(int length, int breadth) {
        System.out.println("Calculating area of rectangle...");
        return length * breadth;
    }

    // Method 2: Area of a square (int)
    int area(int side) {
        System.out.println("Calculating area of square...");
        return side * side;
    }

    // Method 3: Area of a circle (double)
    double area(double radius) {
        System.out.println("Calculating area of circle (from Shape class)...");
        return 3.14 * radius * radius;
    }
}

// Child class: CircleShape that overrides one method from Shape
class CircleShape extends Shape {

    // Overriding the circle method to use a more accurate value of PI
    @Override
    double area(double radius) {
        System.out.println("Calculating area of circle (from CircleShape class - overridden)...");
        return Math.PI * radius * radius;
    }
}

// Main class: Entry point
public class SelfOverrideOverload {

    public static void main(String[] args) {

        // Create object of parent class Shape
        Shape shape = new Shape();
        System.out.println("Rectangle area: " + shape.area(10, 5));   // Overloaded method 1
        System.out.println("Square area: " + shape.area(4));          // Overloaded method 2
        System.out.println("Circle area: " + shape.area(3.5));        // Overloaded method 3

        System.out.println("-------------------------------------");

        // Create object of child class CircleShape
        CircleShape circle = new CircleShape();
        System.out.println("Circle area (overridden): " + circle.area(3.5));  // Overridden method
    }
}
