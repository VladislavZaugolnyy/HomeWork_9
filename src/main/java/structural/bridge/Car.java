package structural.bridge;

class Car extends Vehicle {
    public Car(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workshop1.work();
        workshop2.work();
    }
}