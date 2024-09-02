public class BeforeDebugExample {
    public static void main(String[] args) {

        int result = divideNumbers(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor; // Division by zero will cause an ArithmeticException
    }
}


