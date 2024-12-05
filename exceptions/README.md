## `ArithmeticException` - исключение при некорректных арифметических операциях
```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        }
    }
}
```
## `ArrayIndexOutOfBoundsException` - исключение при выходе за пределы массива
```java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int value = array[5];  // индекс выходит за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: out of array bounds");
        }
    }
}
```
## `IllegalArgumentException` - исключение при передаче неверного аргумента методу
```java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-1);  // неверный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Error: wrong argument");
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be a negative number");
        }
    }
}
```
## `ClassCastException` - исключение при некорректном приведении типов
```java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        try {
            String str = (String) obj;  // невозможно привести Integer к String
        } catch (ClassCastException e) {
            System.out.println("Error: incorrect type casting");
        }
    }
}
```
## `NullPointerException` - исключение при работе с null-объектом
```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // попытка вызова метода на null
        } catch (NullPointerException e) {
            System.out.println("Error: adressing to null object");
        }
    }
}
```
