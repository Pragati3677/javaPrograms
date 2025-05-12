import java.io.*;

public class readFile {
    public static void main(String[] args) {
        try {
            // Provide the full path to your text file here
            File file = new File("C:\Users\praga\OneDrive\Desktop\Package\FileInputOutput");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();  // Read first line
            while (line != null) {
                System.out.println(line);  // Print each line
                line = reader.readLine();  // Read next line
            }

            reader.close();  // Close the reader
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}