public class MethodOverloading {

    public void dateInfo(int day, String month, int year) {
        System.out.println("Day: " + day + ", Month: " + month + ", Year: " + year);
    }

    public void dateInfo(String month, int day) {
        System.out.println("Month: " + month + ", Day: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();

        example.dateInfo("January", 1);
        example.dateInfo("January", 1, 2025);
    }
}
