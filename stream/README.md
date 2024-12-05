# 1
См. InputExample.java
# 2
См. OutputExample.java
# 3
`InputStream` и `OutputStream` работают с байтовыми данными, а Reader и Writer — с символьными данными. Разделение иерархий уместно, потому что символы в зависимости от кодировки могут представлять из себя многобайтовые последоательности
# 4
Интерфейс `AutoCloseable` используется для того, чтобы объекты могли быть автоматически закрыты после завершения работы с ними.
Пример:
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
        // BufferedReader реализует интерфейс AutoCloseable, и его метод close() сам вызывается в конце работы с ресурсом
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) { // файл будет закрыт, даже если возникнет исключение
            e.printStackTrace();
        }
    }
}
```
