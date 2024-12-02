public class Main {
    
    public static void main(String[] args) {
        // базовые типы
        int a = 5;
        int b = 10;
        boolean bool1 = true;
        boolean bool2 = false;
        String str1 = "Hello";
        String str2 = "World";

        // оператор присваивания и арифметические операторы с присваиванием
        a = 15;        // присваивание
        a += 5;        // a = a + 5;
        b -= 3;        // b = b - 3;
        b *= 2;        // b = b * 2;
        b /= 2;        // b = b / 2;
        b %= 3;        // b = b % 3;

        // тернарный оператор 
        int min = (a < b) ? a : b;

        // логические операторы ||, &&
        boolean result = bool1 || bool2;  // true, так как bool1 = true
        result = bool1 && bool2;          // false, так как bool2 = false

        // побитовые операторы 
        int bitOr = a | b;   // побитовое ИЛИ
        int bitXor = a ^ b;  // побитовое исключающее ИЛИ
        int bitAnd = a & b;  // побитовое И

        // операторы равенства 
        boolean isEqual = (a == b);  // false, так как a != b
        boolean isNotEqual = (a != b);  // true, так как a != b

        // операторы сравнения
        boolean isGreater = (a > b);  // true, если a больше b
        boolean isLessEqual = (a <= b);  // false, если a больше b

        // побитовые сдвиги >>, >>>, <<
        int rightShift = a >> 2;     // сдвиг вправо с сохранением знака
        int unsignedRightShift = a >>> 2; // беззнаковый сдвиг вправо
        int leftShift = a << 2;      // сдвиг влево

        // операторы + и -
        int sum = a + b;   // сложение
        int diff = a - b;  // вычитание

        // операторы *, / и %
        int product = a * b;   // умножение
        int quotient = a / b;  // деление
        int remainder = a % b; // остаток от деления

        // префиксные и постфиксные операторы ++ и --
        int preIncrement = ++a; // префиксный инкремент (сначала увеличит, потом вернет)
        int postIncrement = b++; // постфиксный инкремент (сначала вернет, потом увеличит)
        int preDecrement = --a;  // префиксный декремент
        int postDecrement = b--; // постфиксный декремент

        // операторы для строк
        String concatenation = str1 + " " + str2;  // конкатенация строк
        str1 += " Java";  // конкатенация с присваиванием

        //  операторы равенства  для строк
        boolean strEqual = (str1 == str2);  // сравнение ссылок
        boolean strNotEqual = (str1 != str2);  // сравнение ссылок

        // демонстрация приоритета операторов с помощью скобок
        int complexExpression = (a + b) * (b - a); // сначала сложение и вычитание, затем умножение

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("min = " + min);
        System.out.println("result = " + result);
        System.out.println("bitOr = " + bitOr);
        System.out.println("bitXor = " + bitXor);
        System.out.println("bitAnd = " + bitAnd);
        System.out.println("isEqual = " + isEqual);
        System.out.println("isNotEqual = " + isNotEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLessEqual = " + isLessEqual);
        System.out.println("rightShift = " + rightShift);
        System.out.println("unsignedRightShift = " + unsignedRightShift);
        System.out.println("leftShift = " + leftShift);
        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("preDecrement = " + preDecrement);
        System.out.println("postDecrement = " + postDecrement);
        System.out.println("concatenation = " + concatenation);
        System.out.println("strEqual = " + strEqual);
        System.out.println("strNotEqual = " + strNotEqual);
        System.out.println("complexExpression = " + complexExpression);

        // пример использования instanceof
        Object obj = str1;
        if (obj instanceof String) {
            System.out.println("obj является экземпляром String");
        }

        // пример использования instanceof с null-значением
        obj = null;
        if (obj instanceof String) {
            System.out.println("Этот код не выполнится");
        } else {
            System.out.println("obj является null и не является экземпляром String");
        }

    }
}
