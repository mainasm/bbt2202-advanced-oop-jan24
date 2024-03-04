class Vehicle {

    //Private fields
    private String make;
    private String model;

    //Constructor remains the same
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Method to display details of the Vehicle
    protected void displayDetails() {
        System.out.println("Vehicle Make: "
                + make + "\n"
                + "Model: " + model
                + "\n");
    }
}

