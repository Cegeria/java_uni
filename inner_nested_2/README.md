```java
interface MyInterface {
    class NestedClass {
        public void display() {
            System.out.println("Inner class in an interface");
        }
    }
}

public class Main implements MyInterface {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.display();  // Inner class in an interface    
        }
}
```
