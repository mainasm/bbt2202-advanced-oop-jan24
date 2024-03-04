// Subclass Car that extends Vehicle and adds a new field with getters and setters
class Car extends Vehicle {
    //We introduce a new private field in the subclass
    private int seatingCapacity;
    // Constructor to initialize Car objects
    public Car(String make, String model, int seatingCapacity) {
        super(make, model); // Call to the superclass (Vehicle) constructor
        this.seatingCapacity = seatingCapacity;
    }
    // Getter for seatingCapacity
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    // Setter for seatingCapacity
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    // Overriding the displayDetails method to include seatingCapacity
    @Override
    protected void displayDetails() {
        super.displayDetails(); // Call to the superclass (Vehicle) method
        System.out.print("Seating Capacity: " + seatingCapacity);
    }
}


// Main class to demonstrate the use of Vehicle and Car classes
class Main {
    public static void main(String[] args) {
        // Creating an instance of Vehicle
        Vehicle vehicle = new Vehicle("Toyota", "Corolla");
        System.out.println("*******Initial Vehicle Version********");
        vehicle.displayDetails();
        vehicle.setMake("Toyota 2024 Updated"); // Updating make using setter
        vehicle.setModel("Corolla XL Updated"); // Updating model using setter
        System.out.println("*******Updated Vehicle*******" + "\n"
                + "Make: " + vehicle.getMake() + "\n"
                + "Model: " + vehicle.getModel() + "\n");
        vehicle.displayDetails(); // Displays updated details

        // Creating an instance of Car
        Car car = new Car("Honda", "Civic", 5);
        System.out.println("********A Second Vehicle*********");
        car.setSeatingCapacity(4); // Updating seating capacity using setter
        System.out.println("Car Make: " + car.getMake() + "\n"
                + "Model: " + car.getModel() + "\n"
                + "Updated Seating Capacity: " + car.getSeatingCapacity());
        car.displayDetails(); // Displays: Vehicle Make: Honda, Model: Civic
        // Seating Capacity: 4
    }
}

