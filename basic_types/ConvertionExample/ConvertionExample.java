public class ConvertionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
		int newIntValue = byteValue + shortValue;
		newIntValue += 30_209;
		System.out.println("Result: " + newIntValue); //30_239, т.к. преобразовалось в short
        int intValue = 30;
        long longValue = 40L;
		long newLongValue = intValue + longValue + 15_000_000_000_000L;
		System.out.println("Result: " + newLongValue); //15_000_000_000_070, т.к. преобразовалось в long
        float floatValue = 50.0f;
        double doubleValue = 60.0;
		double newDoubleValue = floatValue + doubleValue + 0.000_000_09;
        System.out.println("Result: " + newDoubleValue); //110.000_000_09, т.к. преобразовалось в double
    }
}
