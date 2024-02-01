abstract class MyVehicle {
    protected  String brand; //state of vehicle

    public MyVehicle (String brand){
        this.brand=brand;
    }

    abstract void displayType();
}

class MyCar extends MyVehicle{

    public MyCar(String brand){
        super(brand);
    }
    @Override
    void displayType() {
        System.out.println("The car is of brand: " + brand);
    }
}

class MyMainClass {
    public static void main(String[] args) {
        MyCar car1 = new MyCar("BMW");
        car1.displayType();
    }
}