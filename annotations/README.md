## `@Override`
Используется для явного указания того, что метод переопределяет метод родительского класса
```java
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override // компилятор выдаст ошибку при несоответствии метода с методом из суперкласса
    public void makeSound() {
        System.out.println("Bark");
    }
}
```
## `@Deprecated`
Указывает, что метод или класс устарели и не рекомендуется к использованию
```java
class Class {
    @Deprecated // при вызове oldMethod() компилятор выдаст предупреждение, что он устарел
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }

    public void newMethod() {
        System.out.println("This is the new method");
    }
}
```
## `@SuppressWarnings`
Используется для подавления предупреждений компилятора
```java
@SuppressWarnings("unchecked")
public void myMethod() {
    List list = new ArrayList();
    list.add("Hello");
    list.add("World");
}
```
Здесь компилятор может выдать предупреждение о небезопасных операциях с коллекцией, но с аннотацией `@SuppressWarnings("unchecked")` оно будет подавлено
