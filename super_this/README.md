# 1
```java
class Parent {
    int a = 10;
    
    Parent() {
        System.out.println("Superclass constructor");
    }
    
    void method() {
        System.out.println("Superclass method");
    }
}

class Child extends Parent {
    int a = 20;

    Child() {
        super();  // вызов конструктора суперкласса
        System.out.println("Subclass constructor");
    }

    void method() {
        super.method();  // Вызов метода суперкласса
        System.out.println("Subclass method");
    }

    void printValues() {
        System.out.println("Superclass field a = " + super.a);  // доступ к полю суперкласса
        System.out.println("Subclass field a = " + this.a);    // доступ к полю текущего класса
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();  // вызовет конструктор суперкласса
        child.method();             // вызовет метод суперкласса и метод подкласса
        child.printValues();        // доступ к полям суперкласса и подкласса
    }
}
```
# 2
```java
class A {
    int a = 10;

    void method() {
        System.out.println("Method A");
    }
}

class B extends A {
    // класс B не определяет переменную `a` и метод `method()`
}

class C extends B {
    void method() {
        System.out.println("Method C");
        int a = super.a;   // доступ к переменной `a` из класса A через суперкласс B
        super.method();     // вызов метода `method()` из класса A через суперкласс B
        System.out.println("a from superclass A: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.method();  // вызов метода из класса C, который использует суперклассы
    }
}
```
# 3
```java
class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0);  
        z = 1;
    }

    public A(int a) {
        this(a, 0, 0);  
        z = 1;
    }

    public A(int a, int b) {
        this(a, b, 0);  
        z = 1;
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}
```
