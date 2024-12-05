import java.io.FileInputStream;
import java.io.IOException;

public class InputExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteData;
            // чтение данных побайтово
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // преобразование байта в символ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
