package structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        RegularCar car = new AdapterGolfCarToRegularCar();

        car.turnOn();
        car.shutDown();
        car.go();
        car.stop();
    }
}
