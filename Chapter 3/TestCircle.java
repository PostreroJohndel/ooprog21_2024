public class TestCircle {
    public static void main(String[] args) {
        
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
    }
}
