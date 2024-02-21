package RuntimePolymorphism;

class TransportService {
    private final String defaultVehicleType;
    private final String serviceArea;
    private final boolean luxuryOption;

    // Default constructor
    public TransportService() {
        this.defaultVehicleType = "car";
        this.serviceArea = "City Center";
        // Default service is non-luxury
        this.luxuryOption = false;
    }

    // Constructor to set default vehicle type
    public TransportService(String defaultVehicleType) {
        this.defaultVehicleType = defaultVehicleType;
        this.serviceArea = "City Center";
        this.luxuryOption = false;
    }

    // Constructor to set default vehicle type and service area
    public TransportService(String defaultVehicleType, String serviceArea) {
        this.defaultVehicleType = defaultVehicleType;
        this.serviceArea = serviceArea;
        this.luxuryOption = false;
    }

    // Constructor to set all fields
    public TransportService(String defaultVehicleType, String serviceArea, boolean luxuryOption) {
        this.defaultVehicleType = defaultVehicleType;
        this.serviceArea = serviceArea;
        this.luxuryOption = luxuryOption;
    }

    // Method to book a ride (simplified for demonstration)
    void bookRide(int passengers) {
        System.out.println("Booking a ride for " + passengers + " passengers in a " + defaultVehicleType + " for " + serviceArea + (luxuryOption ? " with luxury service." : "."));
    }

    // Other overloaded methods as previously defined...
}

class Main {
    public static void main(String[] args) {
        // Default transport service
        TransportService defaultService = new TransportService();
        defaultService.bookRide(3);

        // Transport service with a specified vehicle type
        TransportService carService = new TransportService("car");
        carService.bookRide(2);

        // Transport service with specified vehicle type and service area
        TransportService busService = new TransportService("bus", "Downtown");
        busService.bookRide(20);

        // Transport service with all configurations
        TransportService luxuryCarService = new TransportService("SUV", "All City", true);
        luxuryCarService.bookRide(2);
    }
}
