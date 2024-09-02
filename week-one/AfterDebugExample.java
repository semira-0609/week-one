public class AfterDebugExample {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
            e.printStackTrace(); // Printing the stack trace for detailed debugging information
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if(divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }

}
