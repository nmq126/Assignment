package lab4.ex2;

public class Circle {
    protected double radius;
    protected String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString(){
        return String.format("A %s Circle of radius %f",color, radius);
    }

    public String getColor() {
        return color;
    }

}
