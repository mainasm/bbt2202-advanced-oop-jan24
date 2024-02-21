package CompileTimePolymorphism;

public class GeometryCalculator {

    // Method to calculate area of a circle (single parameter)
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate area of a rectangle (two parameters, different type)
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate area of a rectangle (two parameters, same type, different order)
    double calculateArea(int width, double length) {
        return width * length;
    }

    // Overloaded method to calculate the volume of a cylinder (two parameters, same type)
    double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Overloaded method for volume: cylinder with number of cylinders (changing number of parameters)
    double calculateVolume(double radius, double height, int numberOfCylinders) {
        return Math.PI * radius * radius * height * numberOfCylinders;
    }

    public static void main(String[] args) {
        GeometryCalculator calc = new GeometryCalculator();

        // Calculate area of a circle
        System.out.println("Area of circle: " + calc.calculateArea(7.0));

        // Calculate area of a rectangle (using double, double)
        System.out.println("Area of rectangle: " + calc.calculateArea(5.5, 10.0));

        // Calculate area of a rectangle (using int, double)
        System.out.println("Area of rectangle: " + calc.calculateArea(5, 10.4));

        // Calculate volume of a cylinder
        System.out.println("Volume of cylinder: " + calc.calculateVolume(3.0, 5.0));

        // Calculate volume of multiple cylinders
        System.out.println("Volume of 3 cylinders: " + calc.calculateVolume(3.0, 5.0, 3));
    }
}
