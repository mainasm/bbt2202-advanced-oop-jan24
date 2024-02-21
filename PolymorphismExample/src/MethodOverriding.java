class Vehicle {
    void startEngine (){
        System.out.println("Vehicle engine starts. This is a generic behavior");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key or button press");
    }
}

class MyElectricCar extends Vehicle {
    @Override
    void startEngine(){
        System.out.println("Electric car starts silently with a button press");
    }
}

class MainVehicle {
    public static void main(String[] args) {
        //An object of the superclass Vehicle
        Vehicle myVehicle = new Vehicle();
        System.out.println("How does a vehicle engine generally start?");
        myVehicle.startEngine();
        System.out.println("*****************************************");
        /*An object of Car which inherits
        from Vehicle and overrides the superclass method*/
        Car myCar = new Car();
        System.out.println("How does a car generally start?");
        myCar.startEngine();
        MyElectricCar myElectricCar = new MyElectricCar();
        System.out.println("********************************");
        System.out.println("How does an electric car start?");
        myElectricCar.startEngine();
    }
}