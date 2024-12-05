```java 
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // генерация первого исключения - перехваченное
            int result = 10 / 0;  // деление на ноль, вызовет ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        }
        
        // генерация второго исключения - не перехваченное, программа завершится аварийно
        String str = null;
        System.out.println(str.length());  // попытка работы с null, вызовет NullPointerException
    }
}
```
