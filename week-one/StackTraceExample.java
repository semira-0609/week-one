public class StackTraceExample {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        int[] array = new int[1];
        System.out.println(array[1]); // This will throw an ArrayIndexOutOfBoundsException
    }
}