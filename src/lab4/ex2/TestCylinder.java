package lab4.ex2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "red", 10);
        System.out.printf("Cylinder testing:\nDetail: " + cylinder.toString() + "\n");
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
