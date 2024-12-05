import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // в общем случае может потребоваться указать абсолютный путь к текстовому файлу
        File file = new File("example.txt");

        try (Scanner scanner = new Scanner(file)) {
            // чтение строк до конца файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // выводим прочитанно	 строки на экран
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
