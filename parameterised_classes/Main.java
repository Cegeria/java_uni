import java.util.ArrayList;
import java.util.List;

class Demo {
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println("Number: " + num);
        }
    }

    public static void addIntegers(List<? super Integer> integers) {
        integers.add(100); // можно добавлять объекты Integer или подтипы
        integers.add(200); 
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);

        System.out.println("Printing numbers:");
        Demo.printNumbers(intList);
        Demo.printNumbers(doubleList);

        List<Object> objList = new ArrayList<>();
        Demo.addIntegers(objList); 
        System.out.println("List after adding integers: " + objList);

        // Demo.addIntegers(doubleList); - ошибка компиляции: Double не наследуется от Integer
    }
}
