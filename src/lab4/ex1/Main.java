package lab4.ex1;

public class Main {
    public static void main(String[] args) {
//        SportCar sportCar = new SportCar();
//        sportCar.accelerate();
//        new SportCar();
        Car c = new LuxuryCar();
        c.accelerate();
        ((LuxuryCar) c).service();
    }
}
