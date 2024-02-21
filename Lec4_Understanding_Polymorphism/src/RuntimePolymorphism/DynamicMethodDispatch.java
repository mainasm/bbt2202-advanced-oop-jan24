package RuntimePolymorphism;

//Superclass with one instance method
class MyVehicle {
    void startEngine() {
        System.out.println("Generic vehicle engine starts.");
    }
}
class MyCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key or button press.");
    }
}
class MyElectricCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Electric car engine starts silently with a button press.");
    }
}

class MyMotorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kickstart or button press.");
    }
}

class TestDynamicDispatch {
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Car();
        myVehicle.startEngine();  // Calls the startEngine method of Car

        myVehicle = new ElectricCar();
        myVehicle.startEngine();  // Calls the startEngine method of ElectricCar

        myVehicle = new Motorcycle();
        myVehicle.startEngine();  // Calls the startEngine method of Motorcycle
    }
}
