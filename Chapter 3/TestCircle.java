import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();
        
        a.setRadius(3);
        System.out.println("\n\tThe Radius of the Circle B: " + a.getRadius());
        System.out.println("\tThe Diameter of the Circle B: " + a.getDiameter());
        System.out.println("\tThe Area of the Circle B: " + a.getArea());

        b.setRadius(20);
        System.out.println("\n\tThe Radius of the Circle B: " + b.getRadius());
        System.out.println("\tThe Diameter of the Circle B: " + b.getDiameter());
        System.out.println("\tThe Area of the Circle B: " + b.getArea());
        
        System.out.printf("\n\tInput a value for Circle C: ");
        double number = scan.nextDouble();
        c.setRadius(number);
        System.out.println("\n\tThe Radius of the Circle C: " + c.getRadius());
        System.out.println("\tThe Diameter of the Circle C: " + c.getDiameter());
        System.out.println("\tThe Area of the Circle C: " + c.getArea());
    }
} 
