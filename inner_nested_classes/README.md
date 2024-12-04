# 1
```java
public class OuterClass {
    
    // приватный внутренний класс, доступен только внутри класса
    private class PrivateInner {
        public void display() {
            System.out.println("Private inner class");
        }
    }

    // защищённый внутренний класс, доступен в подклассах и в том же пакете
    protected class ProtectedInner {
        public void display() {
            System.out.println("Protected inner class");
        }
    }

    // публичный внутренний класс, доступен из других классов и пакетов
    public class PublicInner {
        public void display() {
            System.out.println("Public inner class");
        }
    }

    // внутренний класс с пакетом по умолчанию, доступен только внутри того же пакета
    class DefaultInner {
        public void display() {
            System.out.println("Default inner class");
        }
    }
}
```
Доступ к внешнему классу из другого пакета:
```java
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        
        // доступ к публичному внутреннему классу
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.display();  // Public inner class
        
        // попытка доступа к защищённому внутреннему классу приведёт к ошибке компиляции, если используется из другого пакета
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner(); //error

        // попытка доступа к приватному внутреннему классу        
        OuterClass.PrivateInner privateInner = outer.new PrivateInner(); //error
    }
}
```
# 2
Внутренний класс имеет доступ ко всем полям и методам внешнего класса, даже если они имеют ограниченные спецификаторы доступа.  Внутренний класс содержит скрытую ссылку на объект внешнего класса (через this).
```java
public class OuterClass {
    private String outerField = "Outer field";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        public void accessOuter() {
            System.out.println("Accessing outer class field: " + outerField);  // доступ к полю внешнего класса
            outerMethod();  // доступ к методу внешнего класса
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.accessOuter();  // Accessing outer class field: Outer field
                              // Outer method
    }
}
```
# 3
Внешний класс может создавать объект внутреннего класса только через внешний объект.  Внешний класс может получить доступ только к публичным полям и методам внутреннего класса, если они не private.
```java
public class OuterClass {
    public class InnerClass {
        private String innerField = "Inner field";

        public void innerMethod() {
            System.out.println(innerField);
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();  // доступ к методу внутреннего класса
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();  // Inner field
    }
}
```
