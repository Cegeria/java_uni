# 1
```java
class Parent {
    public final void toArgue() { 
        System.out.println("I told ya!");
    }
}

class Child extends Parent {
    public void toArgue() { //ошибка компиляции: этот метод определён в суперклассе как final
        System.out.println("I hate you!");
    }
}
```
# 2
```java
final class SingleMan {
    public void toArgue() { 
        System.out.println("You will become a great son of mine!");
    }
}

class Son extends SingleMan { //ошибка компиляции: этот класс наследуется от final класса
    public void toArgue() { 
        System.out.println("I love you, dad!");
    }
}
```
