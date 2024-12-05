# 1
```java
interface MyInterface {
    default void printMessage() { // впоследствии класс-наследник может переопределить этот метод
        System.out.println("Это метод по умолчанию!");
    }
    
    static void staticMethod() { 
        System.out.println("Это статический метод в интерфейсе.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void printMessage() {
        System.out.println("Переопределенный метод printMessage.");
    }
}

public class Main {
    public static void main(String[] args) {
        // все способы вызова методов
        MyClass obj = new MyClass();
        obj.printMessage(); 

        MyInterface.staticMethod(); //статический метод вызывается через имя интерфейса, а не через объект
    }
}
```
# 2
Когда класс реализует два интерфейса с одинаковыми методами, возникает конфликт, если эти методы не имеют одинаковую реализацию в обоих интерфейсах. Для решения этой проблемы, класс должен явно переопределить метод.
```java
interface InterfaceA {
    default void display() {
        System.out.println("Метод display из InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Метод display из InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // переопределяем метод display, чтобы разрешить конфликт
    @Override
    public void display() {
        System.out.println("Переопределенный метод display в MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();  // Вывод: Переопределенный метод display в MyClass
    }
}
```
