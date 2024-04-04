abstract class CarAfterOCP {
    public abstract void describe();
}

class ElectricCar extends CarAfterOCP {
    @Override
    public void describe() {
        System.out.println("This car is electric and environmentally friendly.");
    }
}

class GasolineCar extends CarAfterOCP {
    @Override
    public void describe() {
        System.out.println("This car runs on gasoline and has a V8 engine.");
    }
}

class Main {
    public static void main(String[] args) {
        CarAfterOCP electricCar = new ElectricCar();
        CarAfterOCP gasolineCar = new GasolineCar();

        electricCar.describe();
        gasolineCar.describe();
    }
}
