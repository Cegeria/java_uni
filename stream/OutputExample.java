import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65); // запись символа 'A' 
            fos.write(66); // запись символа 'B' 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
