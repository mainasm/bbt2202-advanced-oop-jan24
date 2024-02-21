package RuntimePolymorphism;

//The superclass
class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine starts. This is generic behavior.");
    }
}

//Car inherits from Vehicle and overrides its method
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key or button press.");
    }
}
//ElectricCar inherits from Vehicle and overrides its method
class ElectricCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Electric car engine starts silently with a button press.");
    }
}
//Motorcycle inherits from Vehicle and overrides its method
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kickstart or button press.");
    }
}

class OverridingMain {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myElectricCar = new ElectricCar();
        Vehicle myMotorcycle = new Motorcycle();

        // Despite the reference type being Vehicle, the specific overridden methods are called.
        myCar.startEngine();         // Outputs: Car engine starts with a key or button press.
        myElectricCar.startEngine(); // Outputs: Electric car engine starts silently with a button press.
        myMotorcycle.startEngine();  // Outputs: Motorcycle engine starts with a kickstart or button press.
    }
}
