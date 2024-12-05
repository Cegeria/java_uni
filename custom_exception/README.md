```java
class MyFirstException extends Exception {

    public MyFirstException() {
        super("Custom exception has happened");
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyFirstException("This is an exception");
        } catch (MyFirstException e) {
            System.out.println("Catcehd an exception: " + e.getMessage());
        }
        
        try {
            throw new MyFirstException("Error", new NullPointerException("Cause: NullPointerException"));
        } catch (MyFirstException e) {
            System.out.println("Exception catched: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
```
