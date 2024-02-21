class TransportService {
    void bookRide (String vehicleType, int passengers){
        System.out.println("Book a ride for " + passengers + " passengers in a " + vehicleType);
    }

    void bookRide (String vehicleType, double volume, double weight){
        System.out.println("Booking a " + vehicleType + " for cargo delivery. Volume: " + volume +
                " cubic meters. Weight: " + weight + " kg");
    }

    void bookRide (String vehicleType, String model, boolean luxuryOption){
        if (luxuryOption) {
            System.out.println("Booking a luxury " + model + " " + vehicleType);
        } else {
            System.out.println("Booking a standard " + model + " " + vehicleType);
        }
    }
    void bookRide (String vehicleType, int passengers, boolean accessibilityOptions){
        if (accessibilityOptions){
            System.out.println("Booking an accessible " + vehicleType + " for " + passengers + " passengers");
        } else {
            System.out.println("Booking a standard " + vehicleType + " for " + passengers + " passengers");
        }
    }
}

class Main {
    public static void main(String[] args) {
        TransportService service = new TransportService();

        //Booking a vehicle for 2 passengers
        System.out.println("Uber Chap Chap");
        System.out.println("******************************");
        service.bookRide("Saloon", 2);
        System.out.println("******************************");
        System.out.println("Uber Mizigo");
        System.out.println("******************************");
        service.bookRide("Van", 5.5, 6.5);
        System.out.println("******************************");
        System.out.println("Uber Fancy");
        service.bookRide("SUV", "Lexus", true);
        System.out.println("******************************");
    }
}