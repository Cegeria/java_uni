# 1
```java
class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printType() {
        if (item instanceof Integer) {
            System.out.println("Item is of type Integer");
        } else if (item instanceof String) {
            System.out.println("Item is of type String");
        } else {
            System.out.println("Item is of an unknown type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(42);
        intWrapper.printType(); // "Item is of type Integer"

        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        stringWrapper.printType(); // "Item is of type String"

        Wrapper<Double> doubleWrapper = new Wrapper<>(3.14);
        doubleWrapper.printType(); // "Item is of an unknown type"
    }
}
```
# 2
## `<? extends T>`
Позволяет работать со списками или коллекциями объектов, которые являются подтипами указанного типа T. <br> Подходит для операций чтения, но запись невозможна.
## `<? super T>`
Позволяет работать с коллекциями объектов, которые являются суперклассами указанного типа T. <br>
Подходит для операций записи, так как можно добавлять объекты типа T или его подтипов.

Пример использования см. Main.java
