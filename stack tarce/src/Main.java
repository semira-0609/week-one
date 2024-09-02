public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Intentionally throwing an exception.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}