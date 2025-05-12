import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileOutsideDirectory {
    public static void main(String[] args) {
        // Path to the file outside the program directory (use absolute path)
        String filePath =("sample.txt"); // <-- Change this to your actual file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
