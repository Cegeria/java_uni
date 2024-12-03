public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
	public static void main(String[] args) {
		A obj = new A();
		obj.printVars(); // Вызов с созданием объекта класса

		A.printVars(); // Вызов без создания объекта класса
	}
}
