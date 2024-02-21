class Vehicle {}
class Car extends Vehicle {}
class Motorcycle extends Vehicle {}

class Main {
    public static void main(String[] args) {
        Vehicle aCar = new Car();
        Vehicle aMotorcycle = new Motorcycle();

        System.out.println("aCar instanceof Vehicle: " + (aCar instanceof Vehicle)); // true
        System.out.println("aCar instanceof Car: " + (aCar instanceof Car)); // true
        System.out.println("aCar instanceof Motorcycle: " + (aCar instanceof Motorcycle)); // false
    }
}
