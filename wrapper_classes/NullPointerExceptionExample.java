public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Integer nullValue = null;

        try {
            int primitiveValue = nullValue; 
        } catch (NullPointerException e) {
            System.out.println("throw error due NullPointerException");
        }
    }
}
