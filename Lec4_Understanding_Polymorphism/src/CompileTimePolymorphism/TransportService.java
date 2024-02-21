package CompileTimePolymorphism;

class TransportService {

    // Method to book a ride for a car. Number of passengers is considered.
    void bookRide(String vehicleType, int passengers) {
        System.out.println("Booking a ride for " + passengers + " passengers in a " + vehicleType);
    }

    // Overloaded method to book a cargo delivery. Volume and weight are considered for cargos.
    void bookRide(String vehicleType, double volume, double weight) {
        System.out.println("Booking a " + vehicleType + " for cargo delivery. Volume: " + volume + " cubic meters. Weight: " + weight + " kg");
    }

    // Overloaded method for booking luxury or special vehicles where specific model is requested.
    void bookRide(String vehicleType, String model, boolean luxuryOption) {
        if (luxuryOption) {
            System.out.println("Booking a luxury " + model + " " + vehicleType);
        } else {
            System.out.println("Booking a standard " + model + " " + vehicleType);
        }
    }

    // Overloaded method for booking vehicles with accessibility options.
    void bookRide(String vehicleType, int passengers, boolean accessibilityOptions) {
        if (accessibilityOptions) {
            System.out.println("Booking an accessible " + vehicleType + " for " + passengers + " passengers");
        } else {
            System.out.println("Booking a standard " + vehicleType + " for " + passengers + " passengers");
        }
    }
}
class Main {
    public static void main(String[] args) {
        TransportService service = new TransportService();

        // Book a car ride for 3 passengers
        service.bookRide("car", 3);

        // Book a van for cargo delivery
        service.bookRide("van", 2.5, 600);

        // Book a luxury limousine
        service.bookRide("limousine", "Mercedes-Benz", true);

        // Book a bus with accessibility options
        service.bookRide("bus", 20, true);
    }
}
