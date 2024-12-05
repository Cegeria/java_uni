# 1
См. Spec1.java
# 2
Метод `flush()` используется для немедленного вывода всех накопленных данных в потоке. Он сбрасывает буфер, если данные находятся в буферизированном потоке.
```java
import java.io.*;

public class FlushExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        writer.print("Hello, ");
        writer.print("world!");
        writer.flush();  // сбрасываем данные в файл немедленно

        writer.close();
    }
}
```
# 3
См. Spec2.java
