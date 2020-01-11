package structural.adapter;

public class AdapterGolfCarToRegularCar extends GolfCar implements RegularCar {
    public void turnOn() {
        turnEngineOn();
    }

    public void shutDown() {
        turnEngineOff();
    }

    public void go() {
        pressGas();
    }

    public void stop() {
        stopMoving();
    }
}
