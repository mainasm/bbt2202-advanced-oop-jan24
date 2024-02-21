class MyVehicle {
    void display() {
        System.out.println("Lets have a look inside the vehicle");
    }
}
class MyCar extends MyVehicle {
    void carSpecificFunction() {
        System.out.println("The car has car-specific functionalities");
    }
}

class MyCarMain {
    public static void main(String[] args) {

        //dynamic method dispatch
        MyVehicle newVehicle = new MyCar();
        newVehicle.display(); // Displays: Inside Vehicle

        // Casting to access Car-specific functionality
        if(newVehicle instanceof MyCar) {
            //SubclassType variableName = (SubclassType) superclassName;
            MyCar newCar = (MyCar) newVehicle;
            newCar.carSpecificFunction(); // Displays: Car-specific functionality
        }
    }
}