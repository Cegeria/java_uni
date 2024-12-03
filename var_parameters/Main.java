public class Main {

    public static void printValues(int... numbers) {
        System.out.println("Printing integers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void printValues(Object... objects) {
        System.out.println("Printing objects:");
        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }

    public static void printValues(String... strings) {
        System.out.println("Printing strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printValues(new int[]{1, 2, 3, 4, 5}); // вызовется первый метод
        printValues(10, "Text", 3.14); // вызовется второй метод
        printValues("Hello", "World"); // вызовется третий метод
    }
}
