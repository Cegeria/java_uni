public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException

            int result = 10 / 0;  // ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Произошло исключение: " + e);
        }
    }
}
