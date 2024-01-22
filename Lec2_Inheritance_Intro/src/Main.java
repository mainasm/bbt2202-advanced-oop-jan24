public class Main{
    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "Corolla", "Saloon", 4, "Petrol");
        Car mercedes = new Car("Mercedes", "C200", "Hatchback", 5, "Electric");
        Car nissan = new Car("Nissan", "NP200", "Van", 6, "Diesel");

        corolla.displayVehicleInfo();
        mercedes.displayVehicleInfo();
        nissan.displayVehicleInfo();
    }
}