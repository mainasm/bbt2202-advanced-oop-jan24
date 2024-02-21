interface MyOtherVehicle {
    void display();
}
class MyOtherCar implements MyOtherVehicle {
    @Override
    public void display() {
        System.out.println("My other Car is displayed");
    }
}
class MyOtherMotorcycle implements MyOtherVehicle {

    @Override
    public void display() {
        System.out.println("My other Motorcycle is displayed");
    }
}

class MainVehicleClass {
    // This method demonstrates the Liskov Substitution Principle (LSP) by allowing any subtype of MyOtherVehicle to be passed as an argument.
    // It also exemplifies programming to an interface, not to an implementation.
    public static void displayVehicle(MyOtherVehicle vehicle) {
        vehicle.display(); // Polymorphic call to the display method. The specific method called is determined at runtime.
    }

    public static void main(String[] args) {
        // Demonstrates LSP and programming to interfaces by treating Car and Motorcycle objects as MyOtherVehicle types.
        MyOtherVehicle car = new MyOtherCar();
        MyOtherVehicle motorcycle = new MyOtherMotorcycle();

        // These calls illustrate polymorphism in action. The displayVehicle method can accept any object that implements MyOtherVehicle,
        // highlighting the flexibility and scalability of the design.
        displayVehicle(car); // Car is displayed
        displayVehicle(motorcycle); // Motorcycle is displayed
    }
}