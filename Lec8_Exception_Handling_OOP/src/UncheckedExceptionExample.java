public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // This will cause an ArithmeticException when used in division

      /*  // No try-catch block to handle the exception
        int result = numerator / denominator;
        System.out.println("Result: " + result);*/
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        }
    }
}
