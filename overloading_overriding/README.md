# 1
```java
class A {
    public void printNumbers(int a, int b) { // печатает два целых числа
        System.out.println("a = " + a + " b = " + b); 
    }

    public void PrintNumbers(double a, double b) { // печатает две десятичных дроби
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
```
# 2 
```java
class A { 
    public void method() { 
        System.out.println("A class method); 
    }
        
}

class B exends A {
    public void method() {
        System.out.println(B class method);
    }
}
class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();

        a.method();  // вызовет метод класса A
        b.method();  // вызовет метод класса B 
    }
}
```
Если у переопределенного и переопределяемого методов не будет совпадать тип возвращаемого значения, то компилятор выдаст ошибку
# 3
```java
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // ошибка компиляции: неправильно указана сигнатура метода
    @Override
    public void sounds() {  // неправильное название метода
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // ошибка компиляции: метод sounds() не существует в суперклассе
    }
}
```
Сообщение об ошибке:
```
error: method does not override or implement a method from a supertype
    @Override
    public void sounds() {
```
