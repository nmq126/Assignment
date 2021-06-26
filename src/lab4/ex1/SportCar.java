package lab4.ex1;

public class SportCar extends Car{
    @Override
    public void accelerate() {
        System.out.println("Sport car is accelerating!");
        super.accelerate();
    }
    public SportCar(){
        super();
        System.out.println("Sport car is building");
    }
}
