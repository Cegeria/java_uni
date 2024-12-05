import java.util.Formatter;

public class Spec1 {
    public static void main(String[] args) {
        // создаем объект Formatter
        Formatter formatter = new Formatter();

        // %b — логическое значение
        boolean isJavaFun = true;
        formatter.format("Is Java fun? %b\n", isJavaFun);

        // %d — десятичное целое число
        int number = 42;
        formatter.format("The answer to life is %d\n", number);

        // %f — число с плавающей точкой
        double pi = 3.14159;
        formatter.format("Value of Pi: %f\n", pi);

        // %s — строковое представление
        String name = "Java";
        formatter.format("The name is %s\n", name);

        // %% — вставка знака процента
        formatter.format("Percentage: 50%%\n");

        // вывод 
        System.out.println(formatter.toString());
        formatter.close();
    }
}
